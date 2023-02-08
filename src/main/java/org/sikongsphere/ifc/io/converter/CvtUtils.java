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

import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.io.constant.UnitConstant;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.fileelement.IfcFileModel;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * @author:stan
 * @date:2023/2/5 10:02
 */
public class CvtUtils {

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
        Map<Integer, IfcAbstractClass> elements = ifcFileModel.getBody().getElements();
        ArrayList<IfcAbstractClass> list = new ArrayList<>();

        elements.forEach((key, value) -> {
            if (value.getClass().getSimpleName().equalsIgnoreCase(stepEntityName)) {
                list.add(value);
            }
        });

        return list;
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
        if (parentNode.isAssignableFrom(childNode.getClass())) {
            return true;
        } else return false;
    }

    /**
     * 由于受到深度的限制，参考ifcOpenShell的做法，先转为map而不是json。
     * 原理为：将对象转为map，仅限于第一层
     * 利用反射获取所有成员变量名称与值，构建map
     * 对于实体类子节点，不对其进行转换。
     *
     * @return
     */
    public static LinkedHashMap<Object, Object> jsonifyEntity(IfcAbstractClass entity) {
        LinkedHashMap<Object, Object> map = new LinkedHashMap<>();
        map.put("type", entity.getClass().getSimpleName());

        Field[] fields = getFields(entity.getClass());
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                map.put(field.getName(), field.get(entity));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return map;

    }

    public static LinkedHashMap<String, Object> getDimensionsForSiUnit(IfcAbstractClass entity) {
        LinkedHashMap<String, Object> dimensions = new LinkedHashMap<>();
        dimensions.put("type", "IfcDimensionalExponents");
        //Todo 检查正确性
        if (UnitConstant.DIMENSIONALEXPONENTS.containsKey(entity.getClass().getSimpleName())) {
            List dimExps = UnitConstant.DIMENSIONALEXPONENTS.get(entity.getClass().getSimpleName());
            if (!(dimExps.get(0).equals(0))) {
                dimensions.put("LengthExponent", dimExps.get(0));
            }
            if (!(dimExps.get(1).equals(0))) {
                dimensions.put("MassExponent", dimExps.get(1));
            }
            if (!(dimExps.get(2).equals(0))) {
                dimensions.put("TimeExponent", dimExps.get(2));
            }
            if (!(dimExps.get(3).equals(0))) {
                dimensions.put("ElectricCurrentExponent", dimExps.get(3));
            }
            if (!(dimExps.get(4).equals(0))) {
                dimensions.put("ThermodynamicTemperatureExponent", dimExps.get(4));
            }
            if (!(dimExps.get(5).equals(0))) {
                dimensions.put("AmountOfSubstanceExponent", dimExps.get(5));
            }
            if (!(dimExps.get(6).equals(0))) {
                dimensions.put("LuminousIntensityExponent", dimExps.get(6));
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
        ref.put("type", entityAttributes.get("type"));
        ref.put("ref", entityAttributes.get("globalId"));

        return ref;
    }

    /**
     * 获取本类及父类的所有字段
     * Todo 调整顺序，使得能够自顶向下
     * @param clazz
     * @return
     */
    private static Field[] getFields(Class clazz) {
        ArrayList<Object> fieldList = new ArrayList<>();
        while (clazz != null) {
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                if (!field.isAnnotationPresent(IfcDeriveParameter.class)
                    && !field.isAnnotationPresent(IfcInverseParameter.class)
                    && field.getModifiers() == Modifier.PRIVATE) {
                    fieldList.add(field);
                }
            }
            clazz = clazz.getSuperclass();
        }
        Field[] f = new Field[fieldList.size()];
        return fieldList.toArray(f);
    }
}
