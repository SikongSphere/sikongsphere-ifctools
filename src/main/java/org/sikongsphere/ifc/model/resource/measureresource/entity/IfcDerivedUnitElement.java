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
package org.sikongsphere.ifc.model.resource.measureresource.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.INTEGER;

/**
 * This class is used to encapsulate derived unit element information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public class IfcDerivedUnitElement extends IfcNonLeafNode {
    private IfcNamedUnit unit;
    private INTEGER exponent;
}
