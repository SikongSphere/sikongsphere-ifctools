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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the basic configuration of the ramp type in terms of the number and shape of ramp flights,as shown in Figure 190. The type also distinguished turns by landings. In addition the subdivision of the straight andchanging direction ramps is included. The ramp configurations are given for ramps without and with one and twolandings.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcRampTypeEnum {
    /**
      * A ramp - which is a sloping floor, walk, or roadway - connecting two levels.The straight ramp consists of one straight flight without turns or winders.
      */
    STRAIGHT_RUN_RAMP,

    /**
      * A straight ramp consisting of two straight flights without turns but with onelanding.
      */
    TWO_STRAIGHT_RUN_RAMP,

    /**
      * A ramp making a 90° turn, consisting of two straight flights connected bya quarterspace landing. The direction of the turn is determined by the walking line.
      */
    QUARTER_TURN_RAMP,

    /**
      * A ramp making a 180° turn, consisting of three straight flights connectedby two quarterspace landings. The direction of the turn is determined by the walking line.
      */
    TWO_QUARTER_TURN_RAMP,

    /**
      * A ramp making a 180° turn, consisting of two straight flights connectedby a halfspace landing. The orientation of the turn is determined by the walking line.
      */
    HALF_TURN_RAMP,

    /**
      * A ramp constructed around a circular or elliptical well without newels andlandings.
      */
    SPIRAL_RAMP,

    /**
      * Free form ramp (user defined operation type).
      */
    USERDEFINED,

    NOTDEFINED

}
