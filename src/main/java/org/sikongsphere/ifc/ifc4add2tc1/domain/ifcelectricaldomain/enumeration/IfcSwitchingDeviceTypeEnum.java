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
 * The IfcSwitchingDeviceTypeEnum defines the range of different types of switch that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcSwitchingDeviceTypeEnum {
    /**
      * An electrical device used to control the flow of power in a circuit on or off.
      */
    CONTACTOR,

    /**
      * A dimmer switch has variable positions, and may adjust electrical power or other setting (according to the switched port type).
      */
    DIMMERSWITCH,

    /**
      * An emergency stop device acts to remove as quickly as possible any danger that may have arisen unexpectedly.
      */
    EMERGENCYSTOP,

    /**
      * A set of buttons or switches, each potentially applicable to a different device.
      */
    KEYPAD,

    /**
      * A momentary switch has no position, and may trigger some action to occur.
      */
    MOMENTARYSWITCH,

    /**
      * A selector switch has multiple positions, and may change the source or level of power or other setting (according to the switched port type).
      */
    SELECTORSWITCH,

    /**
      * A starter is a switch which in the closed position controls the application of power to an electrical device.
      */
    STARTER,

    /**
      * A switch disconnector is a switch which in the open position satisfies the isolating requirements specified for a disconnector.
      */
    SWITCHDISCONNECTOR,

    /**
      * A toggle switch has two positions, and may enable or isolate electrical power or other setting (according to the switched port type).
      */
    TOGGLESWITCH,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
