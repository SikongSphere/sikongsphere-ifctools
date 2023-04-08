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
import org.sikongsphere.ifc.common.exception.SikongSphereParseException;
import org.sikongsphere.ifc.infra.IfcClassContainer;
import org.sikongsphere.ifc.io.constant.IfcJSONStringConstant;
import org.sikongsphere.ifc.io.handler.ifc.IfcFileWriter;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.fileelement.*;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcDimensionalExponents;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * @author:stan & yese
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
    private final Map<String, Object> singletonObjects;

    public void setWriteToIfcPath(String writeToIfcPath) {
        this.writeToIfcPath = writeToIfcPath;
    }

    public JsonToIfc(String jsonFile) throws IOException {
        this.jsonFile = jsonFile;
        this.jsonData = new ObjectMapper().readValue(new File(jsonFile), Map.class);
        this.list = (List) this.jsonData.get(StringConstant.DATA);
        this.singletonObjects = new ConcurrentHashMap<>(this.list.size());
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

    private IfcBody createIfcBody() {
        this.list.forEach(this::fillEntity);
        this.ifcBody.forEach((k, v) -> v.setStepNumber(k + 1));
        return new IfcBody(this.ifcBody);
    }

    private void fillEntity(LinkedHashMap<String, Object> attributeData) {
        Object globalIdObject = attributeData.get(StringConstant.GLOBAL_ID);
        if (null == globalIdObject) {
            throw new SikongSphereParseException("globalId is must!");
        }
        String globalId = globalIdObject.toString();
        String className = (String) attributeData.get(StringConstant.TYPE);
        IfcAbstractClass ifcObject = this.getOrCreateIfcBean(globalId, className);
        // 开始初始化对象
        List<Method> methods = Arrays.asList(ConvertUtils.getSetMethods(ifcObject.getClass()));
        attributeData.forEach((key, value) -> {
            if (StringConstant.TYPE.equalsIgnoreCase(key)) {
                return;
            }
            List<Method> collect = methods.stream()
                .filter(
                    v -> v.getName().equals("set" + StringUtils.capitalize(String.valueOf(key)))
                )
                .collect(Collectors.toList());

            if (collect.size() == 0) {
                // todo: 部分对象没有globalId的属性。这个因该是错误情况
                return;
            }
            Method targetMethod = collect.get(0);
            try {
                if (StringConstant.GLOBAL_ID.equalsIgnoreCase(key)) {
                    targetMethod.invoke(
                        ifcObject,
                        new IfcGloballyUniqueId(
                            GlobalUniqueID.compress(GlobalUniqueID.merge(String.valueOf(value)))
                        )
                    );
                    return;
                }
                Object ifcClass = null;
                if (LinkedHashMap.class.isAssignableFrom(value.getClass())) {
                    ifcClass = this.dealWithMap((LinkedHashMap) value);
                } else if (ArrayList.class.isAssignableFrom(value.getClass())) {
                    SET<Object> set = new SET<>();
                    for (int i = 0; i < ((ArrayList<?>) value).size(); i++) {
                        Object o = ((ArrayList<?>) value).get(i);
                        Object data = this.dealWithMap((LinkedHashMap<String, Object>) o);
                        set.add(data);
                    }
                    ifcClass = set;
                } else if (String.class.isAssignableFrom(value.getClass())) {
                    ifcClass = this.dealWithString((String) value, targetMethod);
                }
                targetMethod.invoke(ifcObject, ifcClass);
            } catch (InvocationTargetException | IllegalAccessException | InstantiationException
                | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public IfcAbstractClass getOrCreateIfcBean(String globalId, String className) {
        // 先尝试从单例池里取出已实例化的对象
        Object ifcObject = this.singletonObjects.get(globalId);
        if (null == ifcObject) {
            // 单例池没有，这里先实例化一个对象放到里面。
            synchronized (this.singletonObjects) {
                ifcObject = this.singletonObjects.get(globalId);
                if (null == ifcObject) {
                    // 注意这里只是实例化一个对象，并不进行初始化
                    try {
                        ifcObject = container.get(className.toUpperCase(Locale.ROOT)).newInstance();
                    } catch (Exception e) {
                        throw new SikongSphereParseException(
                            String.format(
                                "Class for %s does not instantiated successfully.",
                                className
                            )
                        );
                    }
                    singletonObjects.put(globalId, ifcObject);
                    this.ifcBody.put(this.ifcBody.size(), (IfcAbstractClass) ifcObject);
                }
            }
        }
        return (IfcAbstractClass) ifcObject;
    }

    private IfcAbstractClass dealWithMap(LinkedHashMap<String, Object> value)
        throws InvocationTargetException, IllegalAccessException, InstantiationException,
        NoSuchMethodException {
        String ifcClassName = (String) ((LinkedHashMap<?, ?>) value).get(StringConstant.TYPE);
        if (value.containsKey(StringConstant.REF)) {
            // 链接对象
            String ref = String.valueOf(value.get(StringConstant.REF));
            return this.getOrCreateIfcBean(ref, ifcClassName);
        }
        // 非链接对象，说明子对象只在当前实体里使用，直接创建对象赋值即刻，不用放到单例池里
        // todo: 是否需要给他一个globalId
        // 1：实例化一个对象
        IfcAbstractClass ifcObject;
        try {
            ifcObject = (IfcAbstractClass) container.get(ifcClassName.toUpperCase(Locale.ROOT))
                .newInstance();
            if (!(ifcObject instanceof IfcDimensionalExponents)) {
                this.ifcBody.put(this.ifcBody.size(), ifcObject);
            }
        } catch (Exception e) {
            throw new SikongSphereParseException(
                String.format("Class for %s does not instantiated successfully.", ifcClassName)
            );
        }
        // 2：对属性进行赋值
        List<Method> methods = Arrays.asList(ConvertUtils.getSetMethods(ifcObject.getClass()));
        value.forEach((propertyName, propertyValue) -> {
            if (StringConstant.TYPE.equalsIgnoreCase(propertyName)) {
                return;
            }
            List<Method> targetMethods = methods.stream()
                .filter(
                    method -> method.getName().equals("set" + StringUtils.capitalize(propertyName))
                )
                .collect(Collectors.toList());
            try {
                if (StringConstant.GLOBAL_ID.equalsIgnoreCase(propertyName)) {
                    // globalId
                    targetMethods.get(0)
                        .invoke(
                            ifcObject,
                            new IfcGloballyUniqueId(
                                GlobalUniqueID.compress(GlobalUniqueID.merge(String.valueOf(value)))
                            )
                        );
                } else if (String.class.isAssignableFrom(propertyValue.getClass())
                    || Integer.class.isAssignableFrom(propertyValue.getClass())
                    || Long.class.isAssignableFrom(propertyValue.getClass())
                    || Double.class.isAssignableFrom(propertyValue.getClass())) {
                        // string
                        targetMethods.get(0)
                            .invoke(
                                ifcObject,
                                this.dealWithString(
                                    String.valueOf(propertyValue),
                                    targetMethods.get(0)
                                )
                            );
                    } else if (LinkedHashMap.class.isAssignableFrom(propertyValue.getClass())) {
                        // Map
                        targetMethods.get(0)
                            .invoke(
                                ifcObject,
                                this.dealWithMap((LinkedHashMap<String, Object>) propertyValue)
                            );
                    } else if (ArrayList.class.isAssignableFrom(propertyValue.getClass())) {
                        // List;.
                        // todo: 对于list的处理，还需要完善
                        Object o = this.dealWithList((ArrayList) propertyValue, targetMethods);
                        for (Method targetMethod : targetMethods) {
                            if (targetMethod.getParameterCount() != 1) {
                                continue;
                            }
                            if (targetMethod.getParameterTypes()[0].isAssignableFrom(
                                o.getClass()
                            )) {
                                targetMethod.invoke(ifcObject, o);
                            }
                        }
                    } else {
                        throw new RuntimeException(
                            "unknown type: " + propertyValue.getClass().getName()
                        );
                    }
            } catch (Exception e) {
                throw new IllegalStateException("初始化失败！", e);
            }

        });
        return ifcObject;
    }

    private Object dealWithString(String value, Method method) {
        Object ifcClass = null;

        Class<?>[] parameterTypes = method.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            try {
                if (Enum.class.isAssignableFrom(parameterType)) {
                    // 创建枚举对象
                    Class clazz = Class.forName(parameterType.getName());
                    ifcClass = Enum.valueOf(clazz, value);
                    continue;
                }
                ifcClass = parameterType.getDeclaredConstructor(STRING.class)
                    .newInstance(new STRING(value));
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }

        return ifcClass;
    }

    private Object dealWithList(ArrayList value, List<Method> methods)
        throws InvocationTargetException, IllegalAccessException, InstantiationException,
        NoSuchMethodException {
        List<Object> set = new ArrayList<>();
        if (value.stream().anyMatch(v -> v instanceof Map)) {
            for (int i = 0; i < ((ArrayList<?>) value).size(); i++) {
                Object o = ((ArrayList<?>) value).get(i);
                Object data = this.dealWithMap((LinkedHashMap<String, Object>) o);
                set.add(data);
            }
            return set;
        }

        // todo: 对于json中的list怎么初始化对象
        // 这里直接转string，不过大概率是有问题的
        return value.stream().map(String::valueOf).collect(Collectors.toList());
        /*if (method.getParameterCount() != 1) {
            throw new IllegalArgumentException("参数数量不匹配！");
        }
        Class<?> parameterType = method.getParameterTypes()[0];
        if (parameterType.isAssignableFrom(List.class)) {
            return set;
        }
        for (Object o : value) {
        //            parameterType.get
            Object ifcClass = parameterType.getDeclaredConstructor(STRING.class)
                    .newInstance(new STRING(String.valueOf(o)));
            set.add(ifcClass);
        }*/
        // method.get
        // return set;
    }

    public void writeToIfc() {
        IfcHeader ifcHeader = this.createIfcHeader();
        IfcBody ifcBody = this.createIfcBody();

        IfcFileModel ifcFileModel = new IfcFileModel(ifcHeader, ifcBody);
        IfcFileWriter.writeFile(ifcFileModel, this.writeToIfcPath);
    }
}
