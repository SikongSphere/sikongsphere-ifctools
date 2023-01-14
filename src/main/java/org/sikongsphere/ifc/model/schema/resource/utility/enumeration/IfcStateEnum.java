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
package org.sikongsphere.ifc.model.schema.resource.utility.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Enumeration identifying the state or accessibility of the object (e.g., read/write, locked, etc.).
 *
 * @author Wang Bohong
 * @date 2022/08/29 15:14
 * @modified stan
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)

public enum IfcStateEnum {
    /**
     * Object is in a Read-Write state. It may be modified by an application.
     * @author Wang Bohong
     */
    READWRITE,
    /**
     * Object is in a Read-Only state. It may be viewed but not modified by an application.
     * @author Wang Bohong
     */
    READONLY,
    /**
     * Object is in a Locked state. It may not be accessed by an application.
     * @author Wang Bohong
     */
    LOCKED,
    /**
     * Object is in a Read-Write-Locked state. It may not be accessed by an application.
     * @author Wang Bohong
     */
    READWRITELOCKED,
    /**
     * Object is in a Read-Only-Locked state. It may not be accessed by an application.
     * @author Wang Bohong
     */
    READONLYLOCKED
}
