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

import java.util.ArrayList;
import java.util.List;

/**
 *  This abstract class is mainly used to encapsulate many non-leaf nodes, which contain
 *  many specific architectural entities
 *
 * @author zaiyuan
 * @date 2022-08-11 18:30:00
 */
public class IfcNonLeafNode extends IfcNode {
    public int stepNumber;
    public List<IfcNode> elements = new ArrayList<>();
}
