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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifchvacdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * There are two general types of cooled or chilled beams: passive and active.An active Cooled Beam uses a fan or other auxilliary device to aid in air recirculation, while a passiveCooled Beam relies solely on convection to cool the space.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCooledBeamTypeEnum {
    /**
      * An active or ventilated cooled beam provides cooling (and heating) but can also function as an air terminal in a ventilation system.
      */
    ACTIVE,

    /**
      * A passive or static cooled beam provides cooling (and heating) to a room or zone.
      */
    PASSIVE,

    /**
      * User-defined cooled beam type.
      */
    USERDEFINED,

    /**
      * Undefined cooled beam type.
      */
    NOTDEFINED

}
