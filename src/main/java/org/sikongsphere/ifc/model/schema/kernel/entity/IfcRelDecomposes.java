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
package org.sikongsphere.ifc.model.schema.kernel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * IfcRelDecomposes
 *
 * @author zaiyuan
 * @date 2022/8/31 21:15
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.CORE)
public abstract class IfcRelDecomposes extends IfcRelationship {
    private IfcObjectDefinition relatingObject;
    private SET<IfcObjectDefinition> relatedObjects = new SET<>();

    public IfcRelDecomposes() {}

    @IfcParserConstructor
    public IfcRelDecomposes(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcObjectDefinition relatingObject,
        SET<IfcObjectDefinition> relatedObjects
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingObject = relatingObject;
        this.relatedObjects = relatedObjects;
    }

    public IfcObjectDefinition getRelatingObject() {
        return relatingObject;
    }

    public void setRelatingObject(IfcObjectDefinition relatingObject) {
        this.relatingObject = relatingObject;
    }

    public SET<IfcObjectDefinition> getRelatedObjects() {
        return relatedObjects;
    }

    public void setRelatedObjects(SET<IfcObjectDefinition> relatedObjects) {
        this.relatedObjects = relatedObjects;
    }

    public void addRelatedObject(IfcObjectDefinition object) {
        relatedObjects.add(object);
    }

    public void addRelatedObjects(SET<IfcObjectDefinition> objects) {
        objects.getObjects().forEach(relatedObjects::add);
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
