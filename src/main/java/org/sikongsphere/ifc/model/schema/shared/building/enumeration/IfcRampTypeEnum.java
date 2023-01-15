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
package org.sikongsphere.ifc.model.schema.shared.building.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the basic configuration of the ramp type in terms of the number and shape of ramp flights.
 * The type also distinguished turns by landings. In addition the subdivision of the straight and changing direction
 * ramps is included. The ramp configurations are given for ramps without and with one and two landings.
 * @author Kuang Tianyu
 * @date 2022/12/18 16:47
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcRampTypeEnum {
    STRAIGHT_RUN_RAMP,
    TWO_STRAIGHT_RUN_RAMP,
    QUARTER_TURN_RAMP,
    TWO_QUARTER_TURN_RAMP,
    HALF_TURN_RAMP,
    SPIRAL_RAMP,
    USERDEFINED,
    NOTDEFINED;
}
