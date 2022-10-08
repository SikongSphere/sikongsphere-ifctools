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
package org.sikongsphere.ifc.model.resource.presentationorganization.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.presentationorganization.selecttype.IfcLayeredItem;

/**
 * The presentation layer assignment entity assigns an identifying name and optionally a description
 * to a set of presentation and representation items.
 *
 * @author stan
 * @date 2022/09/01
 */
public class IfcPresentationLayerAssignment {
    private IfcLabel name;
    private IfcText description;
    private SET<IfcLayeredItem> assignedItems;
    private IfcIdentifier identifier;

    public IfcPresentationLayerAssignment() {}

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
