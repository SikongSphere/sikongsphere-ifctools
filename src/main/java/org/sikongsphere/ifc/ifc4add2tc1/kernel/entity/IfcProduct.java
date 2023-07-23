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
package org.sikongsphere.ifc.ifc4add2tc1.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcProduct is an abstract representation of any object that relates to a geometric or spatial context. An IfcProduct occurs at a specific location in space if it has a geometric representation assigned. It can be placed relatively to other products, but ultimately relative to theproject coordinate system. The ObjectPlacement attribute establishes the coordinate system in which all points and directions used by the geometricrepresentation items under Representation are founded. The Representation is provided by an IfcProductDefinitionShape being either a geometric shape representation, or a topology representation (with or without underlying geometry of the topological items).
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY, version = IfcVersion.IFC_4_ADD2_TC1)
public class IfcProduct {

}
