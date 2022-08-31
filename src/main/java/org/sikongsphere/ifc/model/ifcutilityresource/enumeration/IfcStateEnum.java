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
package org.sikongsphere.ifc.model.ifcutilityresource.enumeration;

/**
 * Enumeration identifying the state or accessibility of the object (e.g., read/write, locked, etc.).
 *
 * @author Wang Bohong
 * @date 2022/08/29 15:14
 */

public enum IfcStateEnum {
    /**
     * Object is in a Read-Write state.
     * @author Wang Bohong
     */
    READWRITE,
    /**
     * Object is in a Read-Write state.
     * @author Wang Bohong
     */
    READONLY,
    /**
     * Object is in a Locked state.
     * @author Wang Bohong
     */
    LOCKED,
    /**
     * Object is in a Read-Write-Locked state.
     * @author Wang Bohong
     */
    READWRITELOCKED,
    /**
     * Object is in a Read-Write-Locked state.
     * @author Wang Bohong
     */
    READONLYLOCKED
}
