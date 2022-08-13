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
package org.sikongsphere.ifc.model;

import org.sikongsphere.ifc.model.header.IfcHeader;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to encapsulate IfcModel information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcModel extends IfcNode {
    public IsoTagEnum isoTagEnum = IsoTagEnum.ISO_10303_21;
    public IfcHeader header;
    public Map<Integer, IfcNode> elements = new HashMap<>();
}
