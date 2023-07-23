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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcgeometricmodelresource.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The polygonal bounded half space is a special subtype of a half space solid, where the material of the half spaceused in Boolean expressions is bounded by a polygonal boundary. The base surface of the half space is positioned by itsnormal relative to the object coordinate system (as defined at the supertype IfcHalfSpaceSolid), and itspolygonal (with or without arc segments) boundary is defined in the XY plane of the position coordinate systemestablished by the Position attribute, the subtraction body is extruded perpendicular to the XY plane of theposition coordinate system, that is, into the direction of the positive Z axis defined by the Positionattribute.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY, version = IfcVersion.IFC_4_ADD2_TC1)
public class IfcPolygonalBoundedHalfSpace {

}
