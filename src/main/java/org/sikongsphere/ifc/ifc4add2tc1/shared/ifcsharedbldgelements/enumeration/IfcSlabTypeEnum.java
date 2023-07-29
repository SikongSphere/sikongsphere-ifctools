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
 * This enumeration defines the available predefined types of slabs that can further specify an IfcSlab or IfcSlabType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcSlabTypeEnum {
    /**
      * The slab is used to represent a floor slab.
      */
    FLOOR,

    /**
      * The slab is used to represent a roof slab (either flat or sloped).
      */
    ROOF,

    /**
      * The slab is used to represent a landing within a stair or ramp.
      */
    LANDING,

    /**
      * The slab is used to represent a floor slab against the ground (and thereby being a part of the foundation). Another name is mat foundation.
      */
    BASESLAB,

    USERDEFINED,

    NOTDEFINED

}
