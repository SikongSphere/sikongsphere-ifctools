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
 * Enumeration defining the typical types of tanks.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcTankTypeEnum {
    /**
      * An arbitrary open tank type.
      */
    BASIN,

    /**
      * An open container that breaks the hydraulic pressure in a distribution system, typically located between the fluid reservoir and the fluid supply points. A typical break pressure tank allows the flow to discharge into the atmosphere, thereby reducing its hydrostatic pressure to zero.
      */
    BREAKPRESSURE,

    /**
      * A closed container used in a closed fluid distribution system to mitigate the effects of thermal expansion or water hammer. The tank is typically constructed with a diaphragm dividing the tank into two sections, with fluid on one side of the diaphragm and air on the other. One example application is when connected to the primary circuit of a hot water system to accommodate the increase in volume of the water when it is heated.
      */
    EXPANSION,

    /**
      * An open tank that is used for both storage and thermal expansion. A typical example is a tank used to store make-up water at ambient pressure for supply to a hot water system, simultaneously accommodating increases in volume of the water when heated.
      */
    FEEDANDEXPANSION,

    /**
      * A closed container used for storing fluids or gases at a pressure different from the ambient pressure. A pressure vessel is typically rated by an authority having jurisdiction for the operational pressure.
      */
    PRESSUREVESSEL,

    /**
      * An open or closed containter used for storing a fluid at ambient pressure and from which it can be supplied to the fluid distribution system. There are many examples of storage tanks, such as potable water storage tanks, fuel storage tanks, etc.
      */
    STORAGE,

    /**
      * An arbitrary closed tank type.
      */
    VESSEL,

    /**
      * User-defined tank type.
      */
    USERDEFINED,

    /**
      * Undefined tank type.
      */
    NOTDEFINED

}
