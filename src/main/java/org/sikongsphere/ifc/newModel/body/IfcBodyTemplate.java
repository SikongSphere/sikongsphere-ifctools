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
package org.sikongsphere.ifc.newModel.body;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.newModel.IfcNonLeafNode;

import java.lang.reflect.Field;
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

        Field[] fields = getAllFields(value);

        IfcBodyValidateUtils validateUtils = new IfcBodyValidateUtils(value, stepNumber);
        validateUtils.validateTypeToString(fields);

        String strList = String.valueOf(validateUtils.getList());
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
