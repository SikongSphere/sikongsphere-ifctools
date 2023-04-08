/*
 * Copyright 2022 SikongSphere
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
*/
package org.sikongsphere.ifc.io.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.sikongsphere.ifc.common.algorithm.GlobalUniqueID;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.infra.IfcClassContainer;
import org.sikongsphere.ifc.io.constant.IfcJSONStringConstant;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcDataType;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.fileelement.*;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author:stan
 * @date:2023/3/16 22:49
 *
 * 用于将IfcJSON转换为IFC格式的工具类
 */
public class JsonToIfc {

    private String jsonFile;
    private Map jsonData;
    private LinkedHashMap<Integer, IfcAbstractClass> ifcBody = new LinkedHashMap<
        Integer,
        IfcAbstractClass>();
    private String writeToIfcPath;
    private IfcClassContainer container = IfcClassContainer.getInstance();
    private IfcAbstractClass instance;
    private List<LinkedHashMap> list;

    public void setWriteToIfcPath(String writeToIfcPath) {
        this.writeToIfcPath = writeToIfcPath;
    }

    public JsonToIfc(String jsonFile) throws IOException {
        this.jsonFile = jsonFile;
        this.jsonData = new ObjectMapper().readValue(new File(jsonFile), Map.class);
        this.list = (List) this.jsonData.get(StringConstant.DATA);
    }

    /**
     * create file description
     *
     * @return
     */
    private IfcFileDescription createFileDescription() {
        LIST<STRING> list = new LIST<>();
        list.add(new STRING(IfcJSONStringConstant.VIEW_DEFINITION));

        LIST<IfcInterface> allList = new LIST<>();
        allList.add(list);
        allList.add(new STRING(IfcJSONStringConstant.DESC_VERSION));

        ArrayList<IfcInterface> wrapper = new ArrayList<>();
        wrapper.add(allList);

        return new IfcFileDescription(wrapper);

    }

    /**
     * create file name
     *
     * @return
     */
    private IfcFileName createFileName() {
        LIST<IfcInterface> list = new LIST<>();

        // file path and current time
        list.add(new STRING(this.writeToIfcPath));
        list.add(new STRING(ConfigProvider.getUTCTime()));

        // unknown data
        list.add(new LIST<>());
        list.add(new LIST<>());

        // related version
        list.add(
            new STRING((String) this.jsonData.get(IfcJSONStringConstant.PREPROCESSOR_VERSION))
        );
        list.add(new STRING(ConfigProvider.getVersion()));

        // unknown data
        list.add(new STRING());

        List<IfcInterface> wrapper = new ArrayList<>();
        wrapper.add(list);

        return new IfcFileName(wrapper);
    }

    /**
     * create file schema
     *
     * @return
     */
    private IfcFileSchema createFileSchema() {
        LIST<IfcInterface> list = new LIST<>();
        list.add(new STRING((String) this.jsonData.get(IfcJSONStringConstant.SCHEMA_IDENTIFIER)));

        LIST<Object> listWrapper = new LIST<>();
        listWrapper.add(list);

        List<IfcInterface> wrapper = new ArrayList<>();
        wrapper.add(listWrapper);

        return new IfcFileSchema(wrapper);
    }

    /**
     * create IfcFileHeader
     * @return
     */
    private IfcHeader createIfcHeader() {
        return new IfcHeader(
            this.createFileName(),
            this.createFileDescription(),
            this.createFileSchema()
        );
    }

    private IfcBody createIfcBody() throws InstantiationException, IllegalAccessException {

        for (int i = 0; i < this.list.size(); i++) {
            String className = (String) this.list.get(i).get(StringConstant.TYPE);
            IfcAbstractClass ifcClass = (IfcAbstractClass) container.get(
                className.toUpperCase(Locale.ROOT)
            ).newInstance();

            this.ifcBody.put(i, ifcClass);
        }
        //Todo 完成对实体的解析
//        this.ifcBody.forEach(
//                (key, value) -> this.fillEntity(value, this.list.get(key))
//        );

        return new IfcBody(this.ifcBody);
    }

    private void fillEntity(
        IfcAbstractClass ifcAbstractClass,
        LinkedHashMap<String, Object> attributeData
    ) {
        Method[] methods = ConvertUtils.getSetMethods(ifcAbstractClass.getClass());
        attributeData.forEach((key, value) -> {
            if (StringConstant.TYPE.equalsIgnoreCase(key)) {} else {
                Method targetMethod = Arrays.stream(methods)
                    .filter(
                        method -> method.getName()
                            .equals("set" + StringUtils.capitalize(String.valueOf(key)))
                    )
                    .collect(Collectors.toList())
                    .get(0);

                try {
                    if (StringConstant.GLOBAL_ID.equalsIgnoreCase(key)) {
                        targetMethod.invoke(
                            ifcAbstractClass,
                            new IfcGloballyUniqueId(
                                GlobalUniqueID.compress(GlobalUniqueID.merge(String.valueOf(value)))
                            )
                        );
                    } else {
                        Object data = getAttributeData(value,targetMethod);
                        targetMethod.invoke(ifcAbstractClass, data);
                    }
                } catch (InvocationTargetException | IllegalAccessException | InstantiationException |
                         NoSuchMethodException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private Object getAttributeData(Object attributeData, Method method) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Object ifcClass = null;

        if (LinkedHashMap.class.isAssignableFrom(attributeData.getClass())) {
            ifcClass = this.dealWithMap((LinkedHashMap) attributeData);
        }
        else if (String.class.isAssignableFrom(attributeData.getClass())) {
            ifcClass = this.dealWithString((String) attributeData, method);
        }
        else if (ArrayList.class.isAssignableFrom(attributeData.getClass())) {
            SET<Object> set = new SET<>();
            for (int i = 0; i < ((ArrayList<?>) attributeData).size(); i++) {
                Object o = ((ArrayList<?>) attributeData).get(i);
                Object data = this.getAttributeData(o, method);
                set.add(data);
            }
            ifcClass = set;
        }
        return ifcClass;
    }


    private IfcAbstractClass dealWithMap(LinkedHashMap value) throws InstantiationException,
        IllegalAccessException {
        String ifcClassName = (String) ((LinkedHashMap<?, ?>) value).get(StringConstant.TYPE);
        IfcAbstractClass ifcClass = (IfcAbstractClass) this.container.get(
            ifcClassName.toUpperCase(Locale.ROOT)
        ).newInstance();

        if (value.containsKey("ref")) {
        }
        else {
            this.ifcBody.put(this.ifcBody.size(), ifcClass);
        }
        return ifcClass;
    }

    private IfcDataType dealWithString(String value, Method method) throws NoSuchMethodException,
        InvocationTargetException, InstantiationException, IllegalAccessException {
        IfcDataType ifcClass = null;

        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            ifcClass = (IfcDataType) parameterType.getDeclaredConstructor(STRING.class)
                .newInstance(new STRING(value));
        }

        return ifcClass;
    }

    public static void main(String[] args) throws IOException, InstantiationException,
        IllegalAccessException {
        JsonToIfc jsonToIfc = new JsonToIfc("src/test/resources/blank_sikongsphere.json");
        jsonToIfc.setWriteToIfcPath("src/test/resources/blank_ifc_sikongsphere.ifc");
        IfcHeader ifcHeader = jsonToIfc.createIfcHeader();
        IfcBody ifcBody = jsonToIfc.createIfcBody();
        System.out.println(ifcBody);
    }
}
