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

import org.sikongsphere.ifc.common.annotation.IfcAbstractValueField;
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.io.constant.IfcJSONStringConstant;
import org.sikongsphere.ifc.io.constant.UnitConstant;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcDimensionalExponents;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcSIUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

/**
 * ifc转json的一些辅助方法
 *
 * @author:stan
 * @date:2023/2/5 10:02
 */
public class ConvertUtils {

    /**
     * 获取ifcBody中满足step名称的实体
     * @param ifcFileModel
     * @param stepEntityName
     * @return
     */
    public static ArrayList<IfcAbstractClass> getEntityByName(
        IfcFileModel ifcFileModel,
        String stepEntityName
    ) {
        return (ArrayList<IfcAbstractClass>) ifcFileModel.getBody()
            .getElements()
            .values()
            .stream()
            .map(
                ifcAbstractClass -> ifcAbstractClass.getClass()
                    .getSimpleName()
                    .equalsIgnoreCase(stepEntityName) ? ifcAbstractClass : null
            )
            .filter(Objects::isNull)
            .collect(Collectors.toList());
    }

    /**
     * 根据stepNumber返回对应的实体
     * @param ifcFileModel
     * @param stepNumber
     * @return
     */
    public static IfcAbstractClass getEntityByStepNumber(
        IfcFileModel ifcFileModel,
        Integer stepNumber
    ) {
        Map<Integer, IfcAbstractClass> elements = ifcFileModel.getBody().getElements();
        IfcAbstractClass entity = null;

        for (Map.Entry<Integer, IfcAbstractClass> entry : elements.entrySet()) {

            IfcAbstractClass value = entry.getValue();
            if (stepNumber.equals(value.getStepNumber())) {
                entity = value;
                break;
            }
        }

        return entity;
    }

    /**
     * 获取IfcBody中指定实体的所有子节点
     *
     * @param parentNode
     * @return
     */
    public static ArrayList<IfcAbstractClass> getAllChildNodesFrom(
        IfcFileModel ifcFileModel,
        Class<?> parentNode
    ) {
        Map<Integer, IfcAbstractClass> elements = ifcFileModel.getBody().getElements();
        ArrayList<IfcAbstractClass> list = new ArrayList<>();

        elements.forEach((key, value) -> {
            if (isBelongTo(value, parentNode)) {
                list.add(value);
            }
        });

        return list;
    }

    /**
     * 判断一个类是否继承另一个类
     * @param childNode
     * @param parentNode
     * @return
     */
    public static boolean isBelongTo(IfcAbstractClass childNode, Class<?> parentNode) {
        return parentNode.isAssignableFrom(childNode.getClass());
    }

    /**
     * 由于受到深度的限制，参考ifcOpenShell的做法，先转为map而不是json。
     * 原理为：将对象转为map，仅限于第一层
     * 利用反射获取所有成员变量名称与值，构建map
     * 对于实体类子节点，不对其进行转换。
     *
     * @return
     */
    public static LinkedHashMap<Object, Object> jsonifyEntity(
        Object entity,
        Set<IfcValue> specialIfcValue
    ) {
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        map.put(StringConstant.TYPE, entity.getClass().getSimpleName());

        Field[] fields = getFields(entity.getClass());
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(entity);
                if (field.isAnnotationPresent(IfcAbstractValueField.class)) {
                    specialIfcValue.add((IfcValue) value);
                }
                map.put(field.getName(), value);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return map;

    }

    public static LinkedHashMap<String, Object> getDimensionsForSiUnit(IfcAbstractClass entity) {
        LinkedHashMap<String, Object> dimensions = new LinkedHashMap<>();
        dimensions.put(StringConstant.TYPE, IfcDimensionalExponents.class.getSimpleName());
        IfcSIUnit unitEntity = (IfcSIUnit) entity;

        if (UnitConstant.DIMENSIONALEXPONENTS.containsKey(unitEntity.getName().name())) {
            List dimExps = UnitConstant.DIMENSIONALEXPONENTS.get(unitEntity.getName().name());
            if (!(dimExps.get(0).equals(0))) {
                dimensions.put(IfcJSONStringConstant.LENGTH_EXPONENT, dimExps.get(0));
            }
            if (!(dimExps.get(1).equals(0))) {
                dimensions.put(IfcJSONStringConstant.MASS_EXPONENT, dimExps.get(1));
            }
            if (!(dimExps.get(2).equals(0))) {
                dimensions.put(IfcJSONStringConstant.TIME_EXPONENT, dimExps.get(2));
            }
            if (!(dimExps.get(3).equals(0))) {
                dimensions.put(IfcJSONStringConstant.ELECTRIC_CURRENT_EXPONENT, dimExps.get(3));
            }
            if (!(dimExps.get(4).equals(0))) {
                dimensions.put(
                    IfcJSONStringConstant.THERMODYNAMIC_TEMPERATURE_EXPONENT,
                    dimExps.get(4)
                );
            }
            if (!(dimExps.get(5).equals(0))) {
                dimensions.put(IfcJSONStringConstant.AMOUNT_OF_SUBSTANCE_EXPONENT, dimExps.get(5));
            }
            if (!(dimExps.get(6).equals(0))) {
                dimensions.put(IfcJSONStringConstant.LUMINOUS_INTENSITY_EXPONENT, dimExps.get(6));
            }
        }

        return dimensions;
    }

    /**
     * 根据GUID创建引用对象
     *
     * @param entityAttributes
     * @return
     */
    public static LinkedHashMap<Object, Object> createReferencedObject(
        LinkedHashMap<Object, Object> entityAttributes
    ) {
        LinkedHashMap<Object, Object> ref = new LinkedHashMap<>();
        ref.put(StringConstant.TYPE, entityAttributes.get(StringConstant.TYPE));
        ref.put(IfcJSONStringConstant.REF, entityAttributes.get(StringConstant.GLOBAL_ID));

        return ref;
    }

    /**
     * 获取本类及父类的所有成员属性并以自顶向下的顺序进行排序
     * @param clazz
     * @return
     */
    public static Field[] getFields(Class clazz) {
        ArrayList<Object> fieldList = new ArrayList<>();
        while (clazz != null) {
            ArrayList<Object> list = new ArrayList<>();

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (!field.isAnnotationPresent(IfcDeriveParameter.class)
                    && !field.isAnnotationPresent(IfcInverseParameter.class)
                    && field.getModifiers() == Modifier.PRIVATE
                    && !field.getName().equalsIgnoreCase(StringConstant.IS_DECOMPOSED_BY)
                    && !field.getName().equalsIgnoreCase(StringConstant.DECOMPOSES)) {
                    list.add(field);
                }
                // else if (!field.getName().equalsIgnoreCase(StringConstant.IS_DECOMPOSED_BY) &&
                // !field
                // .getName()
                // .equalsIgnoreCase(StringConstant.DECOMPOSES)) {
                // list.add(field);
                // }
            }
            fieldList.addAll(0, list);
            clazz = clazz.getSuperclass();
        }
        Field[] f = new Field[fieldList.size()];
        return fieldList.toArray(f);
    }

    /**
     * 获取本类及父类的所有set方法并以自顶向下的顺序进行排序
     *
     * @param clazz
     * @return
     */
    public static Method[] getSetMethods(Class clazz) {
        ArrayList<Object> methodList = new ArrayList<>();
        while (clazz != null) {
            ArrayList<Object> list = new ArrayList<>();

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getModifiers() == Modifier.PUBLIC
                    && method.getName().contains(StringConstant.SET_METHOD)) {
                    list.add(method);
                } else continue;
            }
            methodList.addAll(0, list);
            clazz = clazz.getSuperclass();
        }
        Method[] f = new Method[methodList.size()];
        return methodList.toArray(f);
    }

    /**
     * 获取指定属性的指定入参的set函数
     * @param clazz
     * @param paramClass
     * @return
     */
    public static Method getSetMethod(Class clazz, String propertySetMethodName, Class paramClass) {
        while (clazz != null) {
            try {
                return clazz.getDeclaredMethod(propertySetMethodName, paramClass);
            } catch (NoSuchMethodException ignore) {}
            clazz = clazz.getSuperclass();
        }
        return null;
    }
}
