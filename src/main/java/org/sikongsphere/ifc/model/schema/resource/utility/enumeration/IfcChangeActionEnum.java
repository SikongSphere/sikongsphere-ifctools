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
 * Enumeration identifying the type of change that might have occurred to the object during the last session (e.g., unchanged, added, deleted, etc.).
 * This information is required in a partial model exchange scenario so that an application or model server will know how an object might have been affected by the previous application,
 * Below are valid enumerations:
 *
 * @author Wang Bohong
 * @date 2022/08/29 15:20
 * @modified stan
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION, isStepElement = false)
public enum IfcChangeActionEnum {

    /**
     * Object has not been modified. This is the default state.
     * @author Wang Bohong
     */
    NOCHANGE,
    /**
     * A modification to the object has been made by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    MODIFIED,
    /**
     * The object has been added by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    ADDED,
    /**
     * The object has been added by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    DELETED,
    /**
     * The object has been added and modified by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    MODIFIEDADDED,
    /**
     * The object has been modified and deleted by the user and application defined by the LastModifyingUser and LastModifyingApplication respectively.
     * @author Wang Bohong
     */
    MODIFIEDDELETED
}
