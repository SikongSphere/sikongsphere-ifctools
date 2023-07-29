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
 * Defines general types of pumps.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcPumpTypeEnum {
    /**
      * A Circulator pump is a generic low-pressure, low-capacity pump. It may have a wet rotor and may be driven by a flexible-coupled motor.
      */
    CIRCULATOR,

    /**
      * An End Suction pump, when mounted horizontally, has a single horizontal inlet on the impeller suction side and a vertical discharge. It may have a direct or close-coupled motor.
      */
    ENDSUCTION,

    /**
      * A Split Case pump, when mounted horizontally, has an inlet and outlet on each side of the impeller. The impeller can be easily accessed by removing the front of the impeller casing. It may have a direct or close-coupled motor.
      */
    SPLITCASE,

    /**
      * A pump designed to be immersed in a fluid, typically a collection tank.
      */
    SUBMERSIBLEPUMP,

    /**
      * A pump designed to sit above a collection tank with a suction inlet extending into the tank.
      */
    SUMPPUMP,

    /**
      * A Vertical Inline pump has the pump and motor close-coupled on the pump casing. The pump depends on the connected, horizontal piping for support, with the suction and discharge along the piping axis.
      */
    VERTICALINLINE,

    /**
      * A Vertical Turbine pump has a motor mounted vertically on the pump casing for either wet-pit sump mounting or dry-well mounting.
      */
    VERTICALTURBINE,

    /**
      * User-defined pump type.
      */
    USERDEFINED,

    /**
      * Pump type has not been defined.
      */
    NOTDEFINED

}
