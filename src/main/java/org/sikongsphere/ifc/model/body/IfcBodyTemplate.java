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
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcTimeStamp;
import org.sikongsphere.ifc.model.resource.utility.enumeration.IfcChangeActionEnum;

import java.lang.reflect.Field;
import java.util.ArrayList;

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

    /**
     * make up IFC data according to params received.
     * @param value
     * @param stepNumber
     * @return
     */
    public String toString(IfcBodyTemplate value, Integer stepNumber) {
        ArrayList<Object> list = new ArrayList<>();
        Field[] fields = value.getClass().getDeclaredFields();

        value.stepNumber = stepNumber;

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            if (!field.getType().getName().contains(StringConstant.INVERSE_TAG)) {
                try {
                    // when value is null, should be replaced with "$"
                    if (field.get(value) == null) {
                        list.add(StringConstant.DOLLAR);

                        // when value extended from STRING, like "unknown","user"
                    } else if (STRING.class.isAssignableFrom(field.get(value).getClass())) {
                        STRING o = (STRING) field.get(value);
                        list.add(o.value);

                        // when value is an enum, like ".ADDED."
                        // Todo: all Enum should extended from one superclass like "IfcBodyTemplate"
                    } else if (Enum.class.isAssignableFrom(field.get(value).getClass())) {
                        IfcChangeActionEnum o = (IfcChangeActionEnum) field.get(value);
                        list.add(StringConstant.DOT + o.name() + StringConstant.DOT);

                        // when value's class is IfcTimeStamp, like 1660128237;
                        // Todo: other class like IfcTimeStamp should be complemented
                    } else if (IfcTimeStamp.class.isAssignableFrom(field.get(value).getClass())) {
                        IfcTimeStamp o = (IfcTimeStamp) field.get(value);
                        list.add(o.getTimestamp());

                        /*
                          Actually when value extended from IfcBodyTemplate, like "IfcPerson",
                          which performs as "#1","#2" in an Ifc file. So we just get its stepNumber
                          when write to a new Ifc File.
                         */
                    } else {
                        IfcBodyTemplate o = (IfcBodyTemplate) field.get(value);
                        list.add(StringConstant.WELL + o.stepNumber);
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
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
