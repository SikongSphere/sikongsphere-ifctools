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
package org.sikongsphere.ifc.model.enumeration;

/**
 * This enumeration defines the applicable object categories
 *
 * @author Wang Bohong
 * @date 2022/8/29 15:33
 */
public enum IfcObjectTypeEnum {
    /**
     * IfcProduct or its subclasses.
     * @author Wang Bohong
     */
    PRODUCT,
    /**
     * IfcProcess or its subclasses.
     * @author Wang Bohong
     */
    PROCESS,
    /**
     * IfcControl or its subclasses.
     * @author Wang Bohong
     */
    CONTROL,
    /**
     * IfcResource or its subclasses.
     * @author Wang Bohong
     */
    RESOURCE,
    /**
     * IfcActor or its subclasses.
     * @author Wang Bohong
     */
    ACTOR,
    /**
     * IfcGroup or its subclasses.
     * @author Wang Bohong
     */
    GROUP,
    /**
     * IfcProject or its subclasses.
     * @author Wang Bohong
     */
    PROJECT,
    /**
     * Other entities.
     * @author Wang Bohong
     */
    NOTDEFINED
}
