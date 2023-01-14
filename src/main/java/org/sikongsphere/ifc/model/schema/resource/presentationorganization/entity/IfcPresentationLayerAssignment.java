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
package org.sikongsphere.ifc.model.schema.resource.presentationorganization.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLayeredItem;

/**
 * The presentation layer assignment entity assigns an identifying name and optionally a description
 * to a set of presentation and representation items.
 *
 * @author stan
 * @date 2022/09/01
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPresentationLayerAssignment extends IfcAbstractClass {
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private SET<IfcLayeredItem> assignedItems;
    @IfcOptionField
    private IfcIdentifier identifier;

    public IfcPresentationLayerAssignment() {}

    @IfcParserConstructor
    public IfcPresentationLayerAssignment(
        IfcLabel name,
        IfcText description,
        SET<IfcLayeredItem> assignedItems,
        IfcIdentifier identifier
    ) {
        this.name = name;
        this.description = description;
        this.assignedItems = assignedItems;
        this.identifier = identifier;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public SET<IfcLayeredItem> getAssignedItems() {
        return assignedItems;
    }

    public void setAssignedItems(SET<IfcLayeredItem> assignedItems) {
        this.assignedItems = assignedItems;
    }

    public IfcIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(IfcIdentifier identifier) {
        this.identifier = identifier;
    }
}
