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
    private IfcHeader header;
    private IfcBody body;

    public IfcFileModel(IfcHeader header, IfcBody body) {
        this.header = header;
        this.body = body;
    }

}
