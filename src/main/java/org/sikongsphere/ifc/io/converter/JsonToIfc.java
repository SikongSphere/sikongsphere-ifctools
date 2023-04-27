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

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.sikongsphere.ifc.common.algorithm.GlobalUniqueID;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.common.exception.SikongSphereException;
import org.sikongsphere.ifc.common.exception.SikongSphereParseException;
import org.sikongsphere.ifc.infra.IfcClassContainer;
import org.sikongsphere.ifc.io.constant.IfcJSONStringConstant;
import org.sikongsphere.ifc.io.constant.TokenConstant;
import org.sikongsphere.ifc.io.handler.ifc.IfcFileWriter;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.IfcInterface;
import org.sikongsphere.ifc.model.datatype.INTEGER;
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
 * @author: stan & yese
 * @date:2023/3/16 22:49
 *
 * 用于将IfcJSON转换为IFC格式的工具类
 */
public class JsonToIfc {

    private final LinkedHashMap<Integer, IfcAbstractClass> ifcBody;
    private final IfcClassContainer container = IfcClassContainer.getInstance();
    private final Map<String, Object> singletonObjects;


    public JsonToIfc() {
        this.singletonObjects = new ConcurrentHashMap<>();
        this.ifcBody = new LinkedHashMap<>();
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
    private IfcFileName createFileName(String ifcPath, String preprocessorVersion) {
        LIST<IfcInterface> list = new LIST<>();

        // file path and current time
        list.add(new STRING(ifcPath));
        list.add(new STRING(ConfigProvider.getUTCTime()));

        // unknown data
        list.add(new LIST<>());
        list.add(new LIST<>());

        // related version
        list.add(new STRING(preprocessorVersion));
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
    private IfcFileSchema createFileSchema(String schemaIdentifier) {
        LIST<IfcInterface> list = new LIST<>();
        list.add(new STRING(schemaIdentifier));

        LIST<Object> listWrapper = new LIST<>();
        listWrapper.add(list);

        List<IfcInterface> wrapper = new ArrayList<>();
        wrapper.add(listWrapper);

        return new IfcFileSchema(wrapper);
    }

    private void fillIfcBodyEntity(LinkedHashMap<String, Object> attributeData) {
        Object globalIdObject = attributeData.get(StringConstant.GLOBAL_ID);
        if (null == globalIdObject) {
            throw new SikongSphereParseException(TokenConstant.WARNING_GLOBAL_ID);
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
            String propertySetMethodName = StringConstant.SET_METHOD + StringUtils.capitalize(String.valueOf(key));
            List<Method> propertySetMethods = methods.stream().filter(v -> v.getName().equals(propertySetMethodName)).collect(Collectors.toList());

            if (propertySetMethods.size() == 0) {
                return;
            }
            // todo：这里取第一个方法不太好，需要更详细的考虑实现。最好能根据方法入参和实际数据，动态的生成需要的对象
            Method defaultSetMethod = propertySetMethods.get(0);
            try {
                if (StringConstant.GLOBAL_ID.equalsIgnoreCase(key)) {
                    defaultSetMethod.invoke(
                        ifcObject,
                        new IfcGloballyUniqueId(
                            GlobalUniqueID.compress(GlobalUniqueID.merge(String.valueOf(value)))
                        )
                    );
                    return;
                }
                // todo: 将对象json的value转化成对于的属性对象。这里很容易出现问题，需要做详细的测试。
                Object ifcClass = value;
                if (LinkedHashMap.class.isAssignableFrom(value.getClass())) {
                    ifcClass = this.dealWithMap((LinkedHashMap) value);
                } else if (ArrayList.class.isAssignableFrom(value.getClass())) {
                    ifcClass = this.dealWithList((ArrayList<?>) value, methods);
                } else if (String.class.isAssignableFrom(value.getClass())) {
                    ifcClass = this.dealWithString((String) value, defaultSetMethod);
                } else if (Integer.class.isAssignableFrom(value.getClass())) {
                    ifcClass = new INTEGER(Integer.valueOf(value.toString()));
                }
                Method matchSetMethod = ConvertUtils.getSetMethod(ifcObject.getClass(), propertySetMethodName, ifcClass.getClass());
                if (null != matchSetMethod) {
                    matchSetMethod.invoke(ifcObject, ifcClass);
                } else {
                    defaultSetMethod.invoke(ifcObject, ifcClass);
                }
            } catch (InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
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
                    ((IfcAbstractClass) ifcObject).setStepNumber(this.ifcBody.size()+1);
                    this.ifcBody.put(this.ifcBody.size(), (IfcAbstractClass) ifcObject);
                }
            }
        }
        return (IfcAbstractClass) ifcObject;
    }

    private Object dealWithMap(LinkedHashMap<String, Object> value)
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
        Object ifcObject;
        try {
            ifcObject = container.get(ifcClassName.toUpperCase(Locale.ROOT))
                .newInstance();
            if (ifcObject instanceof IfcAbstractClass && !(ifcObject instanceof IfcDimensionalExponents)) {
                IfcAbstractClass ifcAbstractClass = (IfcAbstractClass) ifcObject;
                ifcAbstractClass.setStepNumber(this.ifcBody.size()+1);
                this.ifcBody.put(this.ifcBody.size(), ifcAbstractClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
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
                    method -> method.getName()
                        .equals(StringConstant.SET_METHOD + StringUtils.capitalize(propertyName))
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
                            TokenConstant.WARNING_UNKNOWN_CLASS + propertyValue.getClass().getName()
                        );
                    }
            } catch (Exception e) {
                throw new IllegalStateException(TokenConstant.WARNING_INIT_FAIL, e);
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
                } if (Objects.equals(method.getDeclaringClass().getName(), STRING.class.getName())) {
                    ifcClass = new STRING(value);
                    continue;
                } /*if (Objects.equals(method.getDeclaringClass().getName(), BOOLEAN.class.getName())) {
                    ifcClass = new STRING(value);
                    continue;
                }*/
                ifcClass = parameterType.getDeclaredConstructor(STRING.class).newInstance(new STRING(value));
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException();
            }
        }

        return ifcClass;
    }

    private Object dealWithList(ArrayList value, List<Method> methods)
        throws InvocationTargetException, IllegalAccessException, InstantiationException,
        NoSuchMethodException {
        Set<Object> set = new HashSet<>();
        if (value.stream().anyMatch(v -> v instanceof Map)) {
            for (int i = 0; i < ((ArrayList<?>) value).size(); i++) {
                Object o = ((ArrayList<?>) value).get(i);
                Object data = this.dealWithMap((LinkedHashMap<String, Object>) o);
                set.add(data);
            }
            return new SET<>(set);
        }

        // todo: 对于json中的list怎么初始化对象
        // 这里直接转string，不过大概率是有问题的
        return value.stream().map(String::valueOf).collect(Collectors.toList());
    }


    /**
     * 解析json文件，生成ifc模型实体
     * @param jsonFile json文件
     * @param ifcFilePath 导出ifc的地址
     * @return ifc模型实体
     */
    private IfcFileModel parseJsonToIfcModel(File jsonFile, String ifcFilePath) {
        String preprocessorVersion = null, schemaIdentifier = null;
        JsonFactory jsonFactory = new MappingJsonFactory();
        // start parse
        try(JsonParser jp = jsonFactory.createParser(jsonFile)) {
            if (jp.nextToken() != JsonToken.START_OBJECT) {
                throw new SikongSphereParseException(TokenConstant.WARNING_JSON_ROOT_WRONG);
            }
            while (jp.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = jp.getCurrentName();
                jp.nextToken();
                // body信息
                if (StringConstant.DATA.equalsIgnoreCase(fieldName)) {
                    while (jp.nextToken() != JsonToken.END_ARRAY) {
                        JsonNode ifcComponentNode = jp.readValueAsTree();
                        // 按照官方建议，构件层级不会太深，所以这里不再继续深入。
                        LinkedHashMap<String, Object> ifcComponent =
                                new ObjectMapper().convertValue(ifcComponentNode, new TypeReference<LinkedHashMap<String,Object>>() {});
                        this.fillIfcBodyEntity(ifcComponent);
                    }
                }
                // header信息
                else if (IfcJSONStringConstant.SCHEMA_IDENTIFIER.equalsIgnoreCase(fieldName)) {
                    schemaIdentifier = jp.getValueAsString();
                } else if (IfcJSONStringConstant.PREPROCESSOR_VERSION.equalsIgnoreCase(fieldName)) {
                    preprocessorVersion = jp.getValueAsString();
                }
                // 暂时不处理的字段，目前已知的有：type、organization、TIMESTAMP、version、originatingSystem
                else {
                    jp.skipChildren();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
            throw new SikongSphereParseException("ifcJson 解析失败！");
        }
        IfcHeader ifcHeader = new IfcHeader(
                this.createFileName(ifcFilePath, preprocessorVersion),
                this.createFileDescription(),
                this.createFileSchema(schemaIdentifier)
        );
        return new IfcFileModel(ifcHeader, new IfcBody(this.ifcBody));
    }

    public void writeToIfc(String jsonFilePath, String ifcFilePath) {
        if (StringUtils.isBlank(jsonFilePath) || StringUtils.isBlank(ifcFilePath)) {
            throw new SikongSphereException(TokenConstant.WARNING_IFC_JSON_PARSE_AILED);
        }
        File jsonFile = new File(jsonFilePath);
        if (!jsonFile.exists()) {
            throw new SikongSphereParseException(TokenConstant.WARNING_FILE_NOT_EXIST);
        }
        IfcFileModel ifcFileModel = this.parseJsonToIfcModel(jsonFile, ifcFilePath);
        IfcFileWriter.writeFile(ifcFileModel, ifcFilePath);
    }
}
