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
 * This enumeration defines the range of different types of covering that can further specify an IfcCovering or an IfcCoveringType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCoveringTypeEnum {
    /**
      * The covering is used torepresent a ceiling.
      */
    CEILING,

    /**
      * The covering is used to represent a flooring.
      */
    FLOORING,

    /**
      * The covering is used to represent a cladding.
      */
    CLADDING,

    /**
      * The covering is used to represent a roof covering.
      */
    ROOFING,

    /**
      * The covering is used to represent a molding being a strip of material to cover the transition of surfaces (often between wall cladding and ceiling).
      */
    MOLDING,

    /**
      * The covering is used to represent a skirting board being a strip of material to cover the transition between the wall cladding and the flooring.
      */
    SKIRTINGBOARD,

    /**
      * The covering is used to insulate an element for thermal or acoustic purposes.
      */
    INSULATION,

    /**
      * An impervious layer that could be used for e.g. roof covering (below tiling - that may be known as sarking etc.) or as a damp proof course membrane.
      */
    MEMBRANE,

    /**
      * The covering is used to isolate a distribution element from a space in which it is contained.
      */
    SLEEVING,

    /**
      * The covering is used for wrapping particularly of distribution elements using tape.
      */
    WRAPPING,

    /**
      * User defined type of covering.
      */
    USERDEFINED,

    /**
      * Undefined type of covering.
      */
    NOTDEFINED

}
