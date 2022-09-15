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
package org.sikongsphere.ifc.model.core.kernel.entity;

import org.sikongsphere.ifc.model.basic.SET;

/**
 * IfcRelDecomposes
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
public abstract class IfcRelDecomposes extends IfcRelationship {
    private IfcObjectDefinition relatingObject;
    private SET<IfcObjectDefinition> relatedObjects;

    public IfcRelDecomposes(
        IfcObjectDefinition relatingObject,
        SET<IfcObjectDefinition> relatedObjects
    ) {
        this.relatingObject = relatingObject;
        this.relatedObjects = relatedObjects;
    }
}
