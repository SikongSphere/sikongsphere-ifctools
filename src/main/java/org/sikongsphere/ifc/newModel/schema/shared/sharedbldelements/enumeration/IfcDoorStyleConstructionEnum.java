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
package org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the basic types of construction of doors.
 * @author Wang Bohong
 * @date 2022/10/25 12:06
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcDoorStyleConstructionEnum {
    ALUMINIUM,
    HIGH_GRADE_STEEL,
    STEEL,
    WOOD,
    ALUMINIUM_WOOD,
    ALUMINIUM_PLASTIC,
    PLASTIC,
    USERDEFINED,
    NOTDEFINED;
}
