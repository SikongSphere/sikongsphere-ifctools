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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.sikongsphere.ifc.common.algorithm.GlobalUniqueID;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.infra.IfcClassContainer;
import org.sikongsphere.ifc.infra.IfcClassFactory;
import org.sikongsphere.ifc.io.constant.IfcJSONStringConstant;
import org.sikongsphere.ifc.io.constant.IfcJsonSerializerMapper;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.fileelement.IfcFileDescription;
import org.sikongsphere.ifc.model.fileelement.IfcFileName;
import org.sikongsphere.ifc.model.fileelement.IfcFileSchema;
import org.sikongsphere.ifc.model.fileelement.IfcHeader;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @author:stan
 * @date:2023/3/16 22:49
 *
 * 用于将IfcJSON转换为IFC格式的工具类
 */
public class JsonToIfc {

    private String jsonFile;
    private Map jsonData;
    private String writeToIfcPath;

    public void setWriteToIfcPath(String writeToIfcPath) {
        this.writeToIfcPath = writeToIfcPath;
    }

    public JsonToIfc(String jsonFile) throws IOException {
        this.jsonFile = jsonFile;
        this.jsonData = new ObjectMapper().readValue(new File(jsonFile), Map.class);
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

    /**
     * create data entity
     */
    private void createDataEntity() throws IOException {
        ArrayList list = (ArrayList) this.jsonData.get(StringConstant.DATA);
        IfcClassContainer container = IfcClassContainer.getInstance();

        for (Object object : list) {
            LinkedHashMap map = (LinkedHashMap) object;

            // 创建空的对象
            String className = (String) map.get(StringConstant.TYPE);
            Class<?> ifcEntityClass = container.get(className.toUpperCase(Locale.ROOT));
            map.remove(StringConstant.TYPE);
            Method[] methods = ConvertUtils.getSetMethods(ifcEntityClass);

            // 遍历每一行数据，利用反射调用set方法
            map.forEach((key, value) -> {
                // todo 解析实例
            });
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        JsonToIfc jsonToIfc = new JsonToIfc("src/test/resources/blank_sikongsphere.json");
        jsonToIfc.setWriteToIfcPath("src/test/resources/blank_ifc_sikongsphere.ifc");
        IfcHeader ifcHeader = jsonToIfc.createIfcHeader();
        jsonToIfc.createDataEntity();
        System.out.println(ifcHeader);
    }
}
