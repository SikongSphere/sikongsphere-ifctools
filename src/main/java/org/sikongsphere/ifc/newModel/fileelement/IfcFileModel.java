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

import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IsoTagEnum;
import org.sikongsphere.ifc.newModel.Model;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.IfcFileElement;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to encapsulate IfcModel information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcFileModel extends IfcFileElement implements Model {
    public IsoTagEnum isoTagEnum = IsoTagEnum.ISO_10303_21;
    public IfcHeader header;
    public Map<Integer, IfcAbstractClass> elements = new HashMap<>();

    /**
     * used to make up the data body of an IFC file.
     *
     * @return data body.
     */
    private StringBuilder mkDataBody() {
        StringBuilder builder = new StringBuilder();

        elements.forEach((key, value) -> {
            String s = value.toString(key, value);
            builder.append(s).append(StringConstant.NEW_LINE);
        });
        builder.append(StringConstant.END_TAG).append(StringConstant.COLON);
        builder.append(StringConstant.BLANK_ROW);
        return builder;
    }

    /**
     * build IfcModel instance
     */
    public void build() {
        // TODO
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        // ISO Tag Start
        builder.append(StringConstant.BEGIN_ISO);
        builder.append(StringConstant.COLON);
        builder.append(StringConstant.NEW_LINE);

        // Header Entities
        builder.append(header.toString()).append(StringConstant.NEW_LINE);

        // Body Entities
        builder.append(StringConstant.BODY_TAG)
            .append(StringConstant.COLON)
            .append(StringConstant.NEW_LINE);
        builder.append(mkDataBody()).append(StringConstant.NEW_LINE);

        // ISO Tag End
        builder.append(StringConstant.END_ISO).append(StringConstant.COLON);

        return builder.toString();
    }
}
