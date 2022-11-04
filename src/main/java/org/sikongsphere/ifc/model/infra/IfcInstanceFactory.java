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
package org.sikongsphere.ifc.model.infra;

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.util.StringUtil;
import org.sikongsphere.ifc.model.IfcNode;
import org.sikongsphere.ifc.model.IfcNodeList;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.body.IfcEmptyNode;

import java.lang.reflect.*;
import java.util.*;

import static org.sikongsphere.ifc.common.constant.StringConstant.ASTERISK;
import static org.sikongsphere.ifc.common.constant.StringConstant.COMMA;

/**
 * This class is used to encapsulate actor role information
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
public class IfcInstanceFactory {

    public static IfcNode getIfcInstance(String stepName, Object... args) {
        IfcClassContainer instance = IfcClassContainer.getInstance();
        Constructor<?>[] constructors = instance.get(stepName.toUpperCase(Locale.ROOT))
            .getConstructors();
        Object o = new IfcEmptyNode();
        // ToDO 这个地方写法还有问题，需要思考下怎么处理
        if (args[0].getClass().isArray()) args = (Object[]) args[0];
        for (Constructor<?> constructor : constructors) {
            if (constructor.isAnnotationPresent(IfcParserConstructor.class)) {
                try {
                    validateType(constructor, stepName, args);
                    o = constructor.newInstance(args);
                } catch (Exception e) {
                    throw new RuntimeException(
                        String.format("Class for %s does not instantiated successfully.", stepName)
                    );
                }
            }
        }
        return (IfcNode) o;
    }

    public static void validateType(Constructor<?> constructor, String stepName, Object... args)
        throws NoSuchMethodException, InvocationTargetException, InstantiationException,
        IllegalAccessException {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length, listIndex = 0, setIndex = 0;
        for (int i = 0; i < length; i++) {
            if (args[i] == null) continue;
            if (args[i].getClass().equals(STRING.class)
                && ASTERISK.equals(((STRING) args[i]).value)) {
                // 当传入参数为*的时候，所有值视作默认值
                // 如果该类为接口 设为null
                if (parameterTypes[i].isInterface()) {
                    args[i] = null;
                    continue;
                }
                IfcClassContainer instance = IfcClassContainer.getInstance();
                Constructor<?> constructorWithNoParam = parameterTypes[i].getConstructor();
                args[i] = constructorWithNoParam.newInstance();
                IfcBodyTemplate body = (IfcBodyTemplate) args[i];
                body.setDefault(true);
                continue;
            }
            if (parameterTypes[i] != args[i].getClass()
                && !parameterTypes[i].isAssignableFrom(args[i].getClass())) {
                // 针对枚举类的处理
                if (parameterTypes[i].isEnum()) {
                    String[] route = parameterTypes[i].getName().split("\\.");
                    String className = route[route.length - 1];
                    args[i] = getEnumInstance(className, ((STRING) args[i]).value);
                } else if (parameterTypes[i].equals(LIST.class)) {
                    if (args[i].getClass() == IfcNodeList.class) {
                        args[i] = getListInstance((IfcNodeList) args[i]);
                        listIndex++;
                    } else {
                        args[i] = getSimpleListInstance(
                            stepName,
                            ((STRING) args[i]).value,
                            listIndex++
                        );
                    }
                } else {
                    // ToDO 需要重构
                    if (parameterTypes[i].equals(SET.class)) {
                        if (args[i].getClass() == IfcNodeList.class) {
                            args[i] = getSetInstance((IfcNodeList) args[i]);
                            setIndex++;
                        } else {
                            args[i] = getSimpleSetInstance(
                                stepName,
                                ((STRING) args[i]).value,
                                setIndex++
                            );
                        }
                    } else if (args[i].getClass().equals(IfcNodeList.class)) {
                        // 处理某个参数的类构造器为单一简单类型list
                        Constructor<?>[] constructors = parameterTypes[i].getConstructors();
                        for (Constructor<?> cons : constructors) {
                            if (cons.isAnnotationPresent(IfcParserConstructor.class)) {
                                List<IfcNode> elements = ((IfcNodeList) args[i]).elements;
                                List<STRING> params = new ArrayList<>();
                                for (IfcNode element : elements) {
                                    params.add((STRING) element);
                                }
                                LIST<STRING> paramList = new LIST<>(params);
                                Object instance = cons.newInstance(paramList);
                                args[i] = instance;
                            }
                        }
                    } else {
                        Object instance = parameterTypes[i].getConstructor(args[i].getClass())
                            .newInstance(args[i]);
                        args[i] = instance;
                    }
                }
            }
        }
    }

    public static Object getEnumInstance(String className, String value) {
        // 获取类
        IfcClassContainer instance = IfcClassContainer.getInstance();
        Class clazz = instance.get(className.toUpperCase(Locale.ROOT));
        value = StringUtil.dropQuota(value);
        Enum[] enumConstants = (Enum[]) clazz.getEnumConstants();
        for (Enum enumConstant : enumConstants) {
            if (value.equals(enumConstant.name())) {
                return enumConstant;
            }
        }
        return null;
    }

    public static LIST getListInstance(IfcNodeList list) {
        List res = new ArrayList();
        return new LIST(list.elements);
    }

    public static SET getSetInstance(IfcNodeList list) {
        SET set = new SET();
        for (IfcNode element : list.elements) {
            set.add(element);
        }
        return set;
    }

    /**
     * convert String to LIST instance
     * @param stepName the name of the class
     * @param value STRING.value
     * @param listIndex the index of LIST
     * @return
     */
    public static LIST getSimpleListInstance(String stepName, String value, int listIndex)
        throws InstantiationException, IllegalAccessException, NoSuchMethodException,
        InvocationTargetException {
        List list = new ArrayList();
        IfcClassContainer container = IfcClassContainer.getInstance();
        String[] strs = value.substring(1, value.length() - 1).split(COMMA);
        Object[] generics = container.getGeneric(stepName);
        Object[] genericTuple = (Object[]) generics[listIndex];
        Class generic = (Class) genericTuple[1];
        for (String str : strs) {
            list.add(generic.getConstructor(STRING.class).newInstance(new STRING(str)));
        }
        return new LIST(list);
    }

    public static SET getSimpleSetInstance(String stepName, String value, int listIndex)
        throws InstantiationException, IllegalAccessException, NoSuchMethodException,
        InvocationTargetException {
        Set set = new HashSet<>();
        IfcClassContainer container = IfcClassContainer.getInstance();
        String[] strs = value.substring(1, value.length() - 1).split(COMMA);
        Object[] generics = container.getGeneric(stepName);
        Object[] genericTuple = (Object[]) generics[listIndex];
        Class generic = (Class) genericTuple[1];
        for (String str : strs) {
            set.add(generic.getConstructor(STRING.class).newInstance(new STRING(str)));
        }
        return new SET(set);
    }

}
