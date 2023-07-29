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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcelectricaldomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcCableSegmentTypeEnum defines the range of different types of cable segment that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCableSegmentTypeEnum {
    /**
      * Electrical conductor that makes a common connection between several electrical circuits. Properties of a busbar are the same as those of a cable segment and are captured by the cable segment property set.
      */
    BUSBARSEGMENT,

    /**
      * Cable with a specific purpose to lead electric current within a circuit or any other electric construction. Includes all types of electric cables, mainly several core segments or conductor segments wrapped together.
      */
    CABLESEGMENT,

    /**
      * A single linear element within a cable or an exposed wire (such as for grounding) with the specific purpose to lead electric current, data, or a telecommunications signal.
      */
    CONDUCTORSEGMENT,

    /**
      * A self contained element of a cable that comprises one or more conductors and sheathing.The core of one lead is normally single wired or multiwired which are intertwined.
      */
    CORESEGMENT,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
