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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcproductextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the range of different types of spatial zones that can further specify an IfcSpatialZoneTypeEnum.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcSpatialZoneTypeEnum {
    /**
      * The spatial zone is used to represent a construction zone for the production process.
      */
    CONSTRUCTION,

    /**
      * The spatial zone is used to represent a fire safety zone, or fire compartment.
      */
    FIRESAFETY,

    /**
      * The spatial zone is used to represent a lighting zone; a daylight zone, or an artificial lighting zone.
      */
    LIGHTING,

    /**
      * The spatial zone is used to represent a zone of particular occupancy.
      */
    OCCUPANCY,

    /**
      * The spatial zone is used to represent a zone for security planning and maintainance work.
      */
    SECURITY,

    /**
      * The spatial zone is used to represent a thermal zone.
      */
    THERMAL,

    TRANSPORT,

    /**
      * The spatial zone is used to represent a ventilation zone.
      */
    VENTILATION,

    /**
      * User defined type spatial zone.
      */
    USERDEFINED,

    /**
      * Undefined type spatial zone.
      */
    NOTDEFINED

}
