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
 * This enumeration defines the basic configuration of the stair type in terms of the number of stair flights and thenumber of landings, as illustrated in Figure 192. The type also distinguished turns by windings or by landings. Inaddition the subdivision of the straight and changing direction stairs is included. The stair configurations are givenfor stairs without and with one, two or three landings.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcStairTypeEnum {
    /**
      * A stair extending from one level to another without turns or winders. The stair consists of one straight flight.
      */
    STRAIGHT_RUN_STAIR,

    /**
      * A straight stair consisting of two straight flights without turns but with one landing.
      */
    TWO_STRAIGHT_RUN_STAIR,

    /**
      * A stair consisting of one flight with a quarter winder, which is making a 90° turn. The direction of the turn is determined by the walking line.
      */
    QUARTER_WINDING_STAIR,

    /**
      * A stair making a 90° turn, consisting of two straight flights connected by a quarterspace landing. The direction of the turn is determined by the walking line.
      */
    QUARTER_TURN_STAIR,

    /**
      * A stair consisting of one flight with one half winder, which makes a 180° turn. The orientation of the turn is determined by the walking line.
      */
    HALF_WINDING_STAIR,

    /**
      * A stair making a 180° turn, consisting of two straight flights connectedby a halfspace landing. The orientation of the turn is determined by the walking line.
      */
    HALF_TURN_STAIR,

    /**
      * A stair consisting of one flight with two quarter winders, which make a90° turn. The stair makes a 180° turn. The direction of the turns is determined by the walking line.
      */
    TWO_QUARTER_WINDING_STAIR,

    /**
      * A stair making a 180° turn, consisting of three straight flights connected by two quarterspace landings. The direction of the turns is determined by the walking line.
      */
    TWO_QUARTER_TURN_STAIR,

    /**
      * A stair consisting of one flight with three quarter winders, which make a90° turn. The stair makes a 270° turn. The direction of the turns is determined by the walking line.
      */
    THREE_QUARTER_WINDING_STAIR,

    /**
      * A stair making a 270° turn, consisting of four straight flights connectedby three quarterspace landings. The direction of the turns is determined by the walking line.
      */
    THREE_QUARTER_TURN_STAIR,

    /**
      * A stair constructed with winders around a circular newel often without landings. Depending on outer boundary it can be either a circular, elliptical or rectangular spiral stair. The orientation of the winding stairs is determined by the walking line.
      */
    SPIRAL_STAIR,

    /**
      * A stair having one straight flight to a wide quarterspace landing, and two side flights from that landing into opposite directions. The stair is making a 90° turn. The direction of traffic is determined by the walking line.
      */
    DOUBLE_RETURN_STAIR,

    /**
      * A stair extending from one level to another without turns or winders. The stair is consisting of one curved flight.
      */
    CURVED_RUN_STAIR,

    /**
      * A curved stair consisting of two curved flights without turns but with one landing.
      */
    TWO_CURVED_RUN_STAIR,

    /**
      * Free form stair (user defined operation type).
      */
    USERDEFINED,

    NOTDEFINED

}
