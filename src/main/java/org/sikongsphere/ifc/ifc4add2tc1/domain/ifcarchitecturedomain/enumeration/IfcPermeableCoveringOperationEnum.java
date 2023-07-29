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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcarchitecturedomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the valid types of permeable coverings.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcPermeableCoveringOperationEnum {
    /**
      * Protective screen of metal bars or wires.
      */
    GRILL,

    /**
      * Set of fixed or movable strips of wood, metal, etc. arranged to let air in while keeping light or rain out.
      */
    LOUVER,

    /**
      * Upright, fixed or movable, sometimes folding framework used for protection against heat, light, access or similar.
      */
    SCREEN,

    /**
      * User defined permeable covering type.
      */
    USERDEFINED,

    /**
      * No information available.
      */
    NOTDEFINED

}
