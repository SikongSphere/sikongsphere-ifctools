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
package org.sikongsphere.ifc.newModel.shared.sharedbldelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * @author zhongqi
 * @date 2022/11/1
 */

@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcStairTypeEnum {
    STRAIGHT_RUN_STAIR,
    TWO_STRAIGHT_RUN_STAIR,
    QUARTER_WINDING_STAIR,
    QUARTER_TURN_STAIR,
    HALF_WINDING_STAIR,
    HALF_TURN_STAIR,
    TWO_QUARTER_WINDING_STAIR,
    TWO_QUARTER_TURN_STAIR,
    THREE_QUARTER_WINDING_STAIR,
    THREE_QUARTER_TURN_STAIR,
    SPIRAL_STAIR,
    DOUBLE_RETURN_STAIR,
    CURVED_RUN_STAIR,
    TWO_CURVED_RUN_STAIR,
    USERDEFINED,
    NOTDEFINED;
}
