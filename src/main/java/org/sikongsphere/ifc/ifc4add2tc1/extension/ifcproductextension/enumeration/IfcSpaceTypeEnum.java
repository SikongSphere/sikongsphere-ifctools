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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcproductextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the available generic types for IfcSpace andIfcSpaceType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcSpaceTypeEnum {
    /**
      * Any space not falling into another category.
      */
    SPACE,

    /**
      * A space dedication for use as a parking spot for vehicles, including access, such as a parking aisle.
      */
    PARKING,

    /**
      * Gross Floor Area - a specific kind of space for each building story that includes all net area and construction area (also the external envelop). Provision of such a specific space is often required by regulations.
      */
    GFA,

    INTERNAL,

    EXTERNAL,

    USERDEFINED,

    NOTDEFINED

}
