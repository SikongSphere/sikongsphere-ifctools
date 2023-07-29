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
 * This enumeration defines the different predefined types of an IfcDoor or IfcDoorType object.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDoorTypeEnum {
    /**
      * A standard door usually within a wall opening, as a door panel in a curtain wall, or as a "free standing" door.
      */
    DOOR,

    /**
      * A gate is a point of entry to a property usually within an opening in a fence. Or as a "free standing" gate.
      */
    GATE,

    /**
      * A special door that lies horizonally in a slab opening. Often used for accessing cellar or attic.
      */
    TRAPDOOR,

    /**
      * User-defined linear beam element.
      */
    USERDEFINED,

    /**
      * Undefined linear beam element.
      */
    NOTDEFINED

}
