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
package org.sikongsphere.ifc.model.header;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.IfcNode;
import org.sikongsphere.ifc.model.basic.STRING;

/**
 * header of IFC file
 *
 * @author stan
 * @date 2022/09/08 13:51
 */
public class IfcHeader extends IfcNode {
    public IfcFileName fileName;
    public IfcFileDescription fileDescription;
    public IfcFileSchema fileSchema;

    @Override
    public String toString() {

        STRING fileDescription = (STRING) this.fileDescription.elements.get(0);
        STRING fileName = (STRING) this.fileName.elements.get(0);
        STRING fileSchema = (STRING) this.fileSchema.elements.get(0);

        StringBuilder builder = new StringBuilder();
        // Header entity
        builder.append("HEADER").append(StringConstant.COLON).append(StringConstant.NEW_LINE);

        // File Description
        builder.append("FILE_DESCRIPTION")
            .append(StringConstant.LEFT_BRACKETS)
            .append(fileDescription.value)
            .append(StringConstant.RIGHT_BRACKETS)
            .append(StringConstant.COLON)
            .append(StringConstant.NEW_LINE);

        // File Name
        builder.append("FILE_NAME")
            .append(StringConstant.LEFT_BRACKETS)
            .append(fileName.value)
            .append(StringConstant.RIGHT_BRACKETS)
            .append(StringConstant.COLON)
            .append(StringConstant.NEW_LINE);

        // File Schema
        builder.append("FILE_SCHEMA")
            .append(StringConstant.LEFT_BRACKETS)
            .append(fileSchema.value)
            .append(StringConstant.RIGHT_BRACKETS)
            .append(StringConstant.COLON)
            .append(StringConstant.NEW_LINE)
            .append(StringConstant.END_TAG)
            .append(StringConstant.COLON);

        builder.append(StringConstant.BLANK_ROW);

        return builder.toString();
    }
}
