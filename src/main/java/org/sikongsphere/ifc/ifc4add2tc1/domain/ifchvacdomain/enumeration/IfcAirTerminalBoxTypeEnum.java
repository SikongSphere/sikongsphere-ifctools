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
 * This enumeration identifies different types of air terminal boxes.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcAirTerminalBoxTypeEnum {
    /**
      * Terminal box does not include a means to reset the volume automatically to an outside signal such as thermostat.
      */
    CONSTANTFLOW,

    /**
      * Terminal box includes a means to reset the volume automatically to a different control point in response to an outside signal such as thermostat: air-flow rate depends on supply pressure.
      */
    VARIABLEFLOWPRESSUREDEPENDANT,

    /**
      * Terminal box includes a means to reset the volume automatically to a different control point in response to an outside signal such as thermostat: air-flow rate is independant of supply pressure.
      */
    VARIABLEFLOWPRESSUREINDEPENDANT,

    /**
      * User-defined terminal box.
      */
    USERDEFINED,

    /**
      * Undefined terminal box.
      */
    NOTDEFINED

}
