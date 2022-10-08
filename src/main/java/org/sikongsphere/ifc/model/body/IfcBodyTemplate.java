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
package org.sikongsphere.ifc.model.body;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcTimeStamp;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcDimensionalExponents;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * This class is used to encapsulate data template
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcBodyTemplate extends IfcNonLeafNode {
    public String ifcName;

    /**
     * 当ifc文件中某个类的值为"*"时，将此值设为true，并利用空参构造器初始化实例。
     * 输出ifc文件时，若某个实例该值为true，则输出"*"
     * @author Wang Bohong
     */
    private boolean isDefault;

    private Field[] getAllFields(Object object) {
        Class clazz = object.getClass();
        List<Field> fieldList = new ArrayList<>();

        while (clazz != null) {
            fieldList.addAll(0, new ArrayList<>(Arrays.asList(clazz.getDeclaredFields())));
            clazz = clazz.getSuperclass();
        }
        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        return fields;
    }

    /**
     * make up IFC data according to params received.
     * @param value
     * @param stepNumber
     * @return
     */
    public String toString(IfcBodyTemplate value, Integer stepNumber)
        throws IllegalAccessException {
        ArrayList<Object> list = new ArrayList<>();
        Field[] fields = getAllFields(value);

        value.stepNumber = stepNumber;

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            if (!Modifier.isStatic(field.getModifiers())
                && !Modifier.isPublic(field.getModifiers())) {

                if (field.get(value) == null) {
                    list.add(StringConstant.DOLLAR);

                } else if (Boolean.class.equals(field.get(value).getClass())) {
                    continue;

                } else if (STRING.class.isAssignableFrom(field.get(value).getClass())) {
                    STRING o = (STRING) field.get(value);
                    list.add(o.value);

                } else if (Enum.class.isAssignableFrom(field.get(value).getClass())) {
                    Enum o = (Enum) field.get(value);
                    list.add(StringConstant.DOT + o.name() + StringConstant.DOT);

                } else if (IfcTimeStamp.class.equals(field.get(value).getClass())) {
                    IfcTimeStamp o = (IfcTimeStamp) field.get(value);
                    list.add(o.getTimestamp());

                } else if (LIST.class.isAssignableFrom(field.get(value).getClass())) {
                    LIST listElements = (LIST) field.get(value);

                    ArrayList<String> tempList = new ArrayList<>();

                    for (int j = 0; j < listElements.size(); j++) {
                        STRING element = (STRING) listElements.get(j);
                        tempList.add(element.value);
                    }
                    String replacedTuple = String.valueOf(tempList)
                        .replace(StringConstant.LEFT_SQUARE_BRACKETS, StringConstant.LEFT_BRACKETS)
                        .replace(
                            StringConstant.RIGHT_SQUARE_BRACKETS,
                            StringConstant.RIGHT_BRACKETS
                        );

                    list.add(replacedTuple);

                } else if (SET.class.equals(field.get(value).getClass())) {
                    SET o = ((SET) field.get(value));
                    Iterator iterator = o.getObjects().iterator();

                    ArrayList<Integer> temp = new ArrayList<>();

                    while (iterator.hasNext()) {
                        IfcBodyTemplate next = (IfcBodyTemplate) iterator.next();
                        temp.add(next.stepNumber);
                    }

                    temp.sort((x1, x2) -> x1 - x2);

                    ArrayList<String> strings = new ArrayList<>();
                    temp.forEach(x -> strings.add(StringConstant.WELL + x));
                    list.add(
                        String.valueOf(strings)
                            .replace(
                                StringConstant.LEFT_SQUARE_BRACKETS,
                                StringConstant.LEFT_BRACKETS
                            )
                            .replace(
                                StringConstant.RIGHT_SQUARE_BRACKETS,
                                StringConstant.RIGHT_BRACKETS
                            )
                    );

                } else if (IfcDimensionCount.class.equals(field.get(value).getClass())) {
                    IfcDimensionCount o = (IfcDimensionCount) field.get(value);
                    list.add(o.getDimensionCount().value);

                } else if (IfcDimensionalExponents.class.equals(field.get(value).getClass())) {
                    IfcDimensionalExponents o = (IfcDimensionalExponents) field.get(value);
                    if (o.isDefault()) {
                        list.add(StringConstant.ASTERISK);
                    }
                } else {
                    IfcBodyTemplate o = (IfcBodyTemplate) field.get(value);
                    list.add(StringConstant.WELL + o.stepNumber);
                }
            }
        }

        String strList = String.valueOf(list);
        String substring = strList.substring(1, strList.length() - 1);

        StringBuilder builder = new StringBuilder();

        // stepNumber
        builder.append(StringConstant.WELL)
            .append(stepNumber)
            .append(StringConstant.EQUALS)
            .append(StringConstant.WHITE_SPACE)

            // left
            .append(this.getClass().getSimpleName().toUpperCase())
            .append(StringConstant.LEFT_BRACKETS)

            // data
            .append(substring)

            // right
            .append(StringConstant.RIGHT_BRACKETS)
            .append(StringConstant.COLON);

        return builder.toString();
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }
}
