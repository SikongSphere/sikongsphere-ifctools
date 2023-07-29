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
 * This enumeration is used to identify the primary purpose of a duct fitting. This is a very basic categorization mechanismto generically identify the duct fitting type. Subcategories of duct fittings are not enumerated.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDuctFittingTypeEnum {
    /**
      * A fitting with typically two ports used to change the direction of flow between connected elements.
      */
    BEND,

    /**
      * Connector fitting, typically used to join two ports together within a flow distribution system (e.g., a coupling used to join two duct segments).
      */
    CONNECTOR,

    /**
      * Entry fitting, typically unconnected at one port and connected to a flow distribution system at the other (e.g., an outside air duct system intake opening).
      */
    ENTRY,

    /**
      * Exit fitting, typically unconnected at one port and connected to a flow distribution system at the other (e.g., an exhaust air discharge opening).
      */
    EXIT,

    /**
      * A fitting with typically more than two ports used to redistribute flow among the ports and/or to change the direction of flow between connected elements (e.g, tee, cross, wye, etc.).
      */
    JUNCTION,

    /**
      * A fitting with typically two ports used to obstruct or restrict flow between the connected elements (e.g., screen, perforated plate, etc.).
      */
    OBSTRUCTION,

    /**
      * A fitting with typically two ports having different shapes or sizes. Can also be used to change the direction of flow between connected elements.
      */
    TRANSITION,

    /**
      * User-defined fitting.
      */
    USERDEFINED,

    /**
      * Undefined fitting.
      */
    NOTDEFINED

}
