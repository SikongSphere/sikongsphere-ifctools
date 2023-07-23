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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcprofileresource.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * IfcRectangleHollowProfileDef defines a section profile that provides the defining parameters of a rectangular (or square) hollow section to be used by the swept surface geometry or the swept area solid. Its parameters and orientation relative to the position coordinate system are according to the following illustration. A square hollow section can be defined by equal values for h and b. The centre of the position coordinate system is in the profiles centre of the bounding box (for symmetric profiles identical with the centre of gravity). Normally, the longer sides are parallel to the y-axis, the shorter sides parallel to the x-axis.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY, version = IfcVersion.IFC_4_ADD2_TC1)
public class IfcRectangleHollowProfileDef {

}
