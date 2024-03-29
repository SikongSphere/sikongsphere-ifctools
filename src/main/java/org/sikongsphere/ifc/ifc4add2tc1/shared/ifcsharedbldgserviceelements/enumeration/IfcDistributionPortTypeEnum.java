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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgserviceelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration identifies different types of distribution ports. It is used to designate ports by their general function, which determines applicable property sets and compatible systems.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcDistributionPortTypeEnum {
    /**
      * Connection to cable segment or fitting for distribution of electricity.
      */
    CABLE,

    /**
      * Connection to cable carrier segment or fitting for enclosing cables.
      */
    CABLECARRIER,

    /**
      * Connection to duct segment or fitting for distribution of air.
      */
    DUCT,

    /**
      * Connection to pipe segment or fitting for distribution of solid, liquid, or gas.
      */
    PIPE,

    /**
      * User-defined port type.
      */
    USERDEFINED,

    /**
      * Undefined port type.
      */
    NOTDEFINED

}
