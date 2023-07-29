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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcutilityresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcStateEnum enumeration identifies the state or accessibility of the object (for example, read/write, locked).
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcStateEnum {
    /**
      * Object is in a Read-Write state. It may be modified by an application.
      */
    READWRITE,

    /**
      * Object is in a Read-Only state. It may be viewed but not modified by an application.
      */
    READONLY,

    /**
      * Object is in a Locked state. It may not be accessed by an application.
      */
    LOCKED,

    /**
      * Object is in a Read-Write-Locked state. It may not be accessed by an application.
      */
    READWRITELOCKED,

    /**
      * Object is in a Read-Only-Locked state. It may not be accessed by an application.
      */
    READONLYLOCKED

}
