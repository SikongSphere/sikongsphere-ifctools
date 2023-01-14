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
package org.sikongsphere.ifc.model.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcRepresentationMap;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.entity.IfcPresentationLayerAssignment;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLayeredItem;

/**
 * A representation is one or more representation items that are related in a specified representation context
 * as the representation of some concept.
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRepresentation extends IfcAbstractClass implements IfcLayeredItem {
    private IfcRepresentationContext contextContextOfItems;
    @IfcOptionField
    private IfcLabel representationIdentifier;
    @IfcOptionField
    private IfcLabel representationType;
    private SET<IfcRepresentationItem> items;

    @IfcInverseParameter
    private SET<IfcRepresentationMap> representationMap;
    @IfcInverseParameter
    private SET<IfcPresentationLayerAssignment> layerAssignments;
    @IfcInverseParameter
    private SET<IfcProductRepresentation> ofProductRepresentation;

    public IfcRepresentation() {}

    @IfcParserConstructor
    public IfcRepresentation(
        IfcRepresentationContext contextContextOfItems,
        IfcLabel representationIdentifier,
        IfcLabel representationType,
        SET<IfcRepresentationItem> items
    ) {
        this.contextContextOfItems = contextContextOfItems;
        this.representationIdentifier = representationIdentifier;
        this.representationType = representationType;
        this.items = items;
    }

    public IfcRepresentationContext getContextContextOfItems() {
        return contextContextOfItems;
    }

    public void setContextContextOfItems(IfcRepresentationContext contextContextOfItems) {
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

    public SET<IfcRepresentationMap> getRepresentationMap() {
        return representationMap;
    }

    public void setRepresentationMap(SET<IfcRepresentationMap> representationMap) {
        this.representationMap = representationMap;
    }

    public SET<IfcPresentationLayerAssignment> getLayerAssignments() {
        return layerAssignments;
    }

    public void setLayerAssignments(SET<IfcPresentationLayerAssignment> layerAssignments) {
        this.layerAssignments = layerAssignments;
    }

    public SET<IfcProductRepresentation> getOfProductRepresentation() {
        return ofProductRepresentation;
    }

    public void setOfProductRepresentation(SET<IfcProductRepresentation> ofProductRepresentation) {
        this.ofProductRepresentation = ofProductRepresentation;
    }
}
