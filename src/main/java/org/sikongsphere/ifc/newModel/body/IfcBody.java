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

import org.sikongsphere.ifc.newModel.IfcNode;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to encapsulate data information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcBody extends IfcNode {
    public List<IfcNode> elements = new ArrayList<>();
}
