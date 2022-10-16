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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * IfcRepresentation
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRepresentation extends IfcNonLeafNode {
    private IfcRepresentation contextContextOfItems;
    private IfcLabel representationIdentifier;
    private IfcLabel representationType;
    private SET<IfcRepresentationItem> items;

    public IfcRepresentation() {}

    @IfcParserConstructor
    public IfcRepresentation(
        IfcRepresentation contextContextOfItems,
        IfcLabel representationIdentifier,
        IfcLabel representationType,
        SET<IfcRepresentationItem> items
    ) {
        this.contextContextOfItems = contextContextOfItems;
        this.representationIdentifier = representationIdentifier;
        this.representationType = representationType;
        this.items = items;
    }

    public IfcRepresentation getContextContextOfItems() {
        return contextContextOfItems;
    }

    public void setContextContextOfItems(IfcRepresentation contextContextOfItems) {
        this.contextContextOfItems = contextContextOfItems;
    }

    public IfcLabel getRepresentationIdentifier() {
        return representationIdentifier;
    }

    public void setRepresentationIdentifier(IfcLabel representationIdentifier) {
        this.representationIdentifier = representationIdentifier;
    }

    public IfcLabel getRepresentationType() {
        return representationType;
    }

    public void setRepresentationType(IfcLabel representationType) {
        this.representationType = representationType;
    }

    public SET<IfcRepresentationItem> getItems() {
        return items;
    }

    public void setItems(SET<IfcRepresentationItem> items) {
        this.items = items;
    }
    // TODO private Items : SET [1:?] OF IfcRepresentationItem;

    /**
     * TODO
     *
     * RepresentationMap	 : 	SET [0:1] OF IfcRepresentationMap FOR MappedRepresentation;
     * LayerAssignments	 : 	SET OF IfcPresentationLayerAssignment FOR Assigneditems;
     * OfProductRepresentation	 : 	SET [0:1] OF IfcProductRepresentation FOR Representations;
     */
}
