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
 * Enumeration defining the functional type of medical device.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcMedicalDeviceTypeEnum {
    /**
      * Device that provides purified medical air, composed of an air compressor and air treatment line.
      */
    AIRSTATION,

    /**
      * Device that feeds air to an oxygen generator, composed of an air compressor, air treatment line, and an air receiver.
      */
    FEEDAIRUNIT,

    /**
      * Device that generates oxygen from air.
      */
    OXYGENGENERATOR,

    /**
      * Device that combines a feed air unit, oxygen generator, and backup oxygen cylinders.
      */
    OXYGENPLANT,

    /**
      * Device that provides suction, composed of a vacuum pump and bacterial filtration line.
      */
    VACUUMSTATION,

    /**
      * User-defined medical device type.
      */
    USERDEFINED,

    /**
      * Undefined medical device type.
      */
    NOTDEFINED

}
