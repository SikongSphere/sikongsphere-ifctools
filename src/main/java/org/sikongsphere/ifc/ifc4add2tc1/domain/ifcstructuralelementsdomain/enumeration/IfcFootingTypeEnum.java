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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralelementsdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * Enumeration defining the generic footing type.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFootingTypeEnum {
    /**
      * A foundation construction type used in underwater construction.
      */
    CAISSON_FOUNDATION,

    /**
      * Footing elements that are in bending and are supported clear of the ground. They will normally span between piers, piles or pile caps. They are distinguished from beams in the building superstructure since they will normally require a lower grade of finish. They are distinguished from STRIP_FOOTING since they are clear of the ground surface and hence require support to the lower face while the concrete is curing.
      */
    FOOTING_BEAM,

    /**
      * An element that transfers the load of a single column (possibly two) to the ground.
      */
    PAD_FOOTING,

    /**
      * An element that transfers the load from a column or group of columns to a pier or pile or group of piers or piles.
      */
    PILE_CAP,

    /**
      * A linear element that transfers loads into the ground from either a continuous element, such as a wall, or from a series of elements, such as columns.
      */
    STRIP_FOOTING,

    /**
      * Special types of footings which meet specific local requirements.
      */
    USERDEFINED,

    /**
      * The type of footing is not defined.
      */
    NOTDEFINED

}
