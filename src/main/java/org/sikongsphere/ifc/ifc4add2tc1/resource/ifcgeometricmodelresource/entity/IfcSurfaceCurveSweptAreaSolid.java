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
 * The IfcSurfaceCurveSweptAreaSolid is the result of sweeping an area along a directrix that lies on areference surface. The swept area is provided by a subtype of IfcProfileDef. The profile is placedby an implicit cartesian transformation operator at the start point of the sweep, where the profile normal agreesto the tangent of the directrix at this point, and the profile's x-axis agrees to the surface normal. At any pointalong the directrix, the swept profile origin lies on the directrix, the profile's normal points towards the tangentof the directrix, and the profile's x-axis is identical to the surface normal at this point.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY, version = IfcVersion.IFC_4_ADD2_TC1)
public class IfcSurfaceCurveSweptAreaSolid {

}
