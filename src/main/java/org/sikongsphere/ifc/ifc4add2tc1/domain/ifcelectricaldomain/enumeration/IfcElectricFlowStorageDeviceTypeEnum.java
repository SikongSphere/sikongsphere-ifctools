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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcelectricaldomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcElectricFlowStorageDeviceTypeEnum defines different types of electrical flow storage devices.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcElectricFlowStorageDeviceTypeEnum {
    /**
      * A device for storing energy in chemical form so that it can be released as electrical energy.
      */
    BATTERY,

    /**
      * A device that stores electrical energy when an external power supply is present using the electrical property of capacitance.
      */
    CAPACITORBANK,

    /**
      * A device that constantly injects currents that precisely correspond to the harmonic components drawn by the load.
      */
    HARMONICFILTER,

    INDUCTORBANK,

    /**
      * A device that provides a time limited alternative source of power supply in the event of failure of the main supply.
      */
    UPS,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
