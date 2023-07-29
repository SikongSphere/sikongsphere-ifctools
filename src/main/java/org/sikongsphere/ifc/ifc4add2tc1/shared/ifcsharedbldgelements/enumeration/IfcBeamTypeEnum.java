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
 * This enumeration defines the different predefined types of beams that can further specify an IfcBeam or IfcBeamType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcBeamTypeEnum {
    /**
      * A standard beam usually used horizontally.
      */
    BEAM,

    /**
      * A beam used to support a floor or ceiling.
      */
    JOIST,

    /**
      * A wide often prestressed beam with a hollow-core profile that usually serves as a slab component.
      */
    HOLLOWCORE,

    /**
      * A beam or horizontal piece of material over an opening (e.g. door, window).
      */
    LINTEL,

    /**
      * A tall beam placed on the facade of a building. One tall side is usually finished to provide the exterior of the building. Can be used to support joists or slab elements on its interior side.
      */
    SPANDREL,

    /**
      * A beam that forms part of a slab construction and acts together with the slab which its carries. Such beams are often of T-shape (therefore the English name), but may have other shapes as well, e.g. an L-Shape or an Inverted-T-Shape.
      */
    T_BEAM,

    /**
      * User-defined linear beam element.
      */
    USERDEFINED,

    /**
      * Undefined linear beam element.
      */
    NOTDEFINED

}
