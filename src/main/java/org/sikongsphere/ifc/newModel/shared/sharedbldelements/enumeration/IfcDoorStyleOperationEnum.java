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
 * This enumeration defines the basic ways to describe how doors operate.
 * @author Wang Bohong
 * @date 2022/10/25 12:03
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION)
public enum IfcDoorStyleOperationEnum {
    SINGLE_SWING_LEFT,
    SINGLE_SWING_RIGHT,
    DOUBLE_DOOR_SINGLE_SWING,
    DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_LEFT,
    DOUBLE_DOOR_SINGLE_SWING_OPPOSITE_RIGHT,
    DOUBLE_SWING_LEFT,
    DOUBLE_SWING_RIGHT,
    DOUBLE_DOOR_DOUBLE_SWING,
    SLIDING_TO_LEFT,
    SLIDING_TO_RIGHT,
    DOUBLE_DOOR_SLIDING,
    FOLDING_TO_LEFT,
    FOLDING_TO_RIGHT,
    DOUBLE_DOOR_FOLDING,
    REVOLVING,
    ROLLINGUP,
    USERDEFINED,
    NOTDEFINED;
}
