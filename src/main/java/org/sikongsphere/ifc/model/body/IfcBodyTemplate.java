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
import org.sikongsphere.ifc.model.IfcNode;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.STRING;

import java.util.ArrayList;

/**
 * This class is used to encapsulate data template
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcBodyTemplate extends IfcNonLeafNode {
    public String ifcName;

    public String toString(Integer stepNumber) {
        ArrayList<String> list = new ArrayList<>();
        for (IfcNode element : elements) {
            list.add(((STRING) element).value);
        }
        String strList = String.valueOf(list);
        String substring = strList.substring(1, strList.length() - 1);

        StringBuilder builder = new StringBuilder();
        builder.append(StringConstant.WELL)
            .append(stepNumber)
            .append(StringConstant.EQUALS)
            .append(StringConstant.WHITE_SPACE)
            .append(ifcName)
            .append(StringConstant.LEFT_BRACKETS)
            .append(substring)
            .append(StringConstant.RIGHT_BRACKETS)
            .append(StringConstant.COLON);

        return builder.toString();
    }
}
