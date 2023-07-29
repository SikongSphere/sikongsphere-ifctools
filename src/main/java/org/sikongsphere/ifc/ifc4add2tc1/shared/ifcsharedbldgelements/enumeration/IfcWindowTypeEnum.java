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
 * This enumeration defines the different predefined types of windows that can further specify an IfcWindow or IfcWindowType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcWindowTypeEnum {
    /**
      * A standard window usually within a wall opening, as a window panel in a curtain wall, or as a "free standing" window.
      */
    WINDOW,

    /**
      * A window within a sloped building element, usually a roof slab.
      */
    SKYLIGHT,

    /**
      * A special window that lies horizonally in a roof slab opening.
      */
    LIGHTDOME,

    /**
      * User-defined window element.
      */
    USERDEFINED,

    /**
      * Undefined window element.
      */
    NOTDEFINED

}
