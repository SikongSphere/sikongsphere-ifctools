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
package org.sikongsphere.ifc.newModel.fileelement;

import org.sikongsphere.ifc.newModel.IfcFileElement;
import org.sikongsphere.ifc.newModel.IfcInterface;

import java.util.ArrayList;
import java.util.Collections;
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

    // /**
    // * make up IFC Header according to params received.
    // * @param ifcNode
    // * @return
    // */
    // private String mkParams(IfcNodeList ifcNode) {
    //
    // StringBuilder builder = new StringBuilder();
    //
    // for (int i = 0; i < ifcNode.elements.size(); i++) {
    // String ifcValue = null;
    //
    // if (IfcNodeList.class.equals(ifcNode.elements.get(i).getClass())) {
    // IfcNodeList node = (IfcNodeList) ifcNode.elements.get(i);
    // ifcValue = StringConstant.LEFT_BRACKETS + ((STRING) node.elements.get(0)).value
    // + StringConstant.RIGHT_BRACKETS;
    //
    // } else if (STRING.class.equals(ifcNode.elements.get(i).getClass())) {
    // ifcValue = ((STRING) ifcNode.elements.get(i)).value;
    // }
    //
    // if (i < ifcNode.elements.size() - 1) {
    // builder.append(ifcValue).append(StringConstant.COMMA);
    // } else {
    // builder.append(ifcValue);
    // }
    // }
    //
    // return builder.toString();
    // }

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

    // @Override
    // public String toString() {
    //
    // String fileDescription = this.mkParams((IfcNodeList) this.fileDescription.elements.get(0));
    // String fileName = this.mkParams((IfcNodeList) this.fileName.elements.get(0));
    // String fileSchema = this.mkParams((IfcNodeList) this.fileSchema.elements.get(0));
    //
    // StringBuilder builder = new StringBuilder();
    // // Header entity
    // builder.append("HEADER").append(StringConstant.COLON).append(StringConstant.NEW_LINE);
    //
    // // File Description
    // builder.append("FILE_DESCRIPTION")
    // .append(StringConstant.LEFT_BRACKETS)
    // .append(fileDescription)
    // .append(StringConstant.RIGHT_BRACKETS)
    // .append(StringConstant.COLON)
    // .append(StringConstant.NEW_LINE);
    //
    // // File Name
    // builder.append("FILE_NAME")
    // .append(StringConstant.LEFT_BRACKETS)
    // .append(fileName)
    // .append(StringConstant.RIGHT_BRACKETS)
    // .append(StringConstant.COLON)
    // .append(StringConstant.NEW_LINE);
    //
    // // File Schema
    // builder.append("FILE_SCHEMA")
    // .append(StringConstant.LEFT_BRACKETS)
    // .append(fileSchema)
    // .append(StringConstant.RIGHT_BRACKETS)
    // .append(StringConstant.COLON)
    // .append(StringConstant.NEW_LINE)
    // .append(StringConstant.END_TAG)
    // .append(StringConstant.COLON);
    //
    // builder.append(StringConstant.BLANK_ROW);
    //
    // return builder.toString();
    // }
}
