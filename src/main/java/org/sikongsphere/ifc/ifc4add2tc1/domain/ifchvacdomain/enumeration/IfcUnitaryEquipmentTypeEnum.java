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
 * Enumeration defining the functional type of unitary equipment.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcUnitaryEquipmentTypeEnum {
    /**
      * A unitary air handling unit typically containing a fan, economizer, and coils.
      */
    AIRHANDLER,

    /**
      * A unitary packaged air-conditioning unit typically used in residential or light commercial applications.
      */
    AIRCONDITIONINGUNIT,

    /**
      * A unitary packaged dehumidification unit. Note: units supporting multiple modes (dehumidification, cooling, and/or heating) should use AIRCONDITIONINGUNIT.
      */
    DEHUMIDIFIER,

    /**
      * A system which separates the compressor from the evaporator, but acts as a unitary component typically within residential or light commercial applications.
      */
    SPLITSYSTEM,

    /**
      * A packaged assembly that is either field-erected or manufactured atop the roof of a large residential or commercial building and acts as a unitary component.
      */
    ROOFTOPUNIT,

    /**
      * User-defined unitary equipment type.
      */
    USERDEFINED,

    /**
      * Undefined unitary equipment type.
      */
    NOTDEFINED

}
