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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration identifies different types of building systems.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcBuildingSystemTypeEnum {
    /**
      * System of doors, windows, and other fillings in opening in a building envelop that are designed to permit the passage of air or light.
      */
    FENESTRATION,

    /**
      * System of shallow and deep foundation element that transmit forces to the supporting ground.
      */
    FOUNDATION,

    /**
      * System of building elements that transmit forces and stiffen the construction.
      */
    LOADBEARING,

    /**
      * System of building elements that provides the outer skin to protect the construction (such as the facade).
      */
    OUTERSHELL,

    /**
      * System of shading elements (external or internal) that permits the limitation or control of impact of natural sun light.
      */
    SHADING,

    /**
      * System of all transport elements in a building that enables the transport of people or goods.
      */
    TRANSPORT,

    USERDEFINED,

    NOTDEFINED

}
