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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcconstructionmgmtdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration is used to identify the primary purpose of a construction material resource. It is limited to the most common raw materials used in construction and excludes materials commonly sold as finished products.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcConstructionMaterialResourceTypeEnum {
    /**
      * Construction aggregate including sand, gravel, and crushed stone.
      */
    AGGREGATES,

    /**
      * Cast-in-place concrete.
      */
    CONCRETE,

    /**
      * Wall board, including gypsum board.
      */
    DRYWALL,

    /**
      * Fuel for running equipment.
      */
    FUEL,

    /**
      * Any gypsum material.
      */
    GYPSUM,

    /**
      * Masonry including brick, stone, concrete block, glass block, and tile.
      */
    MASONRY,

    /**
      * Any metallic material.
      */
    METAL,

    /**
      * Any plastic material.
      */
    PLASTIC,

    /**
      * Any wood material.
      */
    WOOD,

    /**
      * Undefined resource.
      */
    NOTDEFINED,

    /**
      * User-defined resource.
      */
    USERDEFINED

}
