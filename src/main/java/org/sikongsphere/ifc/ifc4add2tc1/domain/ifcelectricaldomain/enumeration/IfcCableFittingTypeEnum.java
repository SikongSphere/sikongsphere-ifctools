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
 * The IfcCableFittingTypeEnum defines the range of different types of cable fitting that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCableFittingTypeEnum {
    /**
      * A fitting that joins two cable segments of the same connector type (though potentially different gender).
      */
    CONNECTOR,

    /**
      * A fitting that begins a cable segment at a non-electrical element such as a grounding clamp attached to a pipe.
      */
    ENTRY,

    /**
      * A fitting that ends a cable segment at a non-electrical element such as a grounding clamp attached to a pipe or to the ground.
      */
    EXIT,

    /**
      * A fitting that joins three or more segments of arbitrary connector types for signal splitting or multiplexing.
      */
    JUNCTION,

    /**
      * A fitting that joins two cable segments of different connector types.
      */
    TRANSITION,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
