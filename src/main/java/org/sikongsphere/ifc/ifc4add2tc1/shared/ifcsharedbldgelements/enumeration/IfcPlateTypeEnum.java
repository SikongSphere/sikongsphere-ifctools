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
 * This enumeration defines the different types of planar elements an IfcPlate or IfcPlateType object can fulfill.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcPlateTypeEnum {
    /**
      * A planar element within a curtain wall, often consisting of a frame with fixed glazing.
      */
    CURTAIN_PANEL,

    /**
      * A planar, flat and thin element, comes usually as metal sheet, and is often used as an additonal part within an assembly.
      */
    SHEET,

    /**
      * User-defined linear element.
      */
    USERDEFINED,

    /**
      * Undefined linear element.
      */
    NOTDEFINED

}
