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
package org.sikongsphere.ifc.model.fileelement;

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.model.IfcFileElement;
import org.sikongsphere.ifc.model.IfcInterface;

import java.util.List;

/**
 * header of IFC file
 *
 * @author stan
 * @date 2022/09/08 13:51
 */
public class IfcHeader extends IfcFileElement {
    private IfcFileName fileName;
    private IfcFileDescription fileDescription;
    private IfcFileSchema fileSchema;

    public IfcHeader(List<IfcInterface> params) {
        super(params);
    }

    public IfcHeader(
        IfcFileName fileName,
        IfcFileDescription fileDescription,
        IfcFileSchema fileSchema
    ) {
        this.fileName = fileName;
        this.fileDescription = fileDescription;
        this.fileSchema = fileSchema;
        params.add(fileName);
        params.add(fileDescription);
        params.add(fileSchema);
    }

    public IfcFileName getFileName() {
        return fileName;
    }

    public void setFileName(IfcFileName fileName) {
        this.fileName = fileName;
    }

    public IfcFileDescription getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(IfcFileDescription fileDescription) {
        this.fileDescription = fileDescription;
    }

    public IfcFileSchema getFileSchema() {
        return fileSchema;
    }

    public void setFileSchema(IfcFileSchema fileSchema) {
        this.fileSchema = fileSchema;
    }

    @Override
    public String toString() {
        return "HEADER;"
            + StringConstant.NEW_LINE
            + "FILE_DESCRIPTION"
            + fileDescription
            + StringConstant.COLON
            + StringConstant.NEW_LINE
            + "FILE_NAME"
            + fileName
            + StringConstant.COLON
            + StringConstant.NEW_LINE
            + "FILE_SCHEMA"
            + fileSchema
            + StringConstant.COLON
            + StringConstant.NEW_LINE
            + StringConstant.END_TAG
            + StringConstant.COLON
            + StringConstant.NEW_LINE;
    }
}
