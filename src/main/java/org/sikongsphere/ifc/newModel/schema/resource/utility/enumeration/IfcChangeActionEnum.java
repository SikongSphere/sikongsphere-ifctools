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
package org.sikongsphere.ifc.newModel.schema.resource.utility.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Enumeration identifying the state or accessibility of the object (e.g., read/write, locked, etc.).
 *
 * @author Wang Bohong
 * @date 2022/08/29 15:20
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcChangeActionEnum {

    /**
     * Default state
     * @author Wang Bohong
     */
    NOCHANGE,
    /**
     * Modification to the object has been made.
     * @author Wang Bohong
     */
    MODIFIED,
    /**
     * The object has been added by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    ADDED,
    /**
     * The object has been deleted by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    DELETED,
    /**
     * The object has been added and modified.
     * @author Wang Bohong
     */
    MODIFIEDADDED,
    /**
     * The object has been modified and deleted.
     * @author Wang Bohong
     */
    MODIFIEDDELETED,
    /**
     * Constant of Enum which is null
     * @author stan
     */
    $
}
