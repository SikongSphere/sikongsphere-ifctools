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
 * This enumeration defines the valid types of IfcShadingDevice or IfcShadingDeviceType thatcan be predefined using the enumeration values.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcShadingDeviceTypeEnum {
    /**
      * A blind with adjustable horizontal slats for admitting light and air while excluding direct sun and rain.
      */
    JALOUSIE,

    /**
      * A mechanical devices that limits the passage of light. Often used as a a solid or louvered movable cover for a window.
      */
    SHUTTER,

    /**
      * A rooflike shelter of canvas or other material extending over a doorway, from the top of a window, over a deck, or similar, in order to provide protection, as from the sun.
      */
    AWNING,

    USERDEFINED,

    NOTDEFINED

}
