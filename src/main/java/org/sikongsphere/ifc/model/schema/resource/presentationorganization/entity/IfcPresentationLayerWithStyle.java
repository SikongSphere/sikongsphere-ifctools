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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcPresentationStyleSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLayeredItem;

/**
 * An IfcPresentationLayerAssignmentWithStyle extends the presentation layer assignment with capabilities to
 * define visibility control, access control and common style information.
 * 
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPresentationLayerWithStyle extends IfcPresentationLayerAssignment {
    private LOGICAL layerOn;
    private LOGICAL layerFrozen;
    private LOGICAL layerBlocked;
    private SET<IfcPresentationStyleSelect> layerStyles;

    @IfcParserConstructor
    public IfcPresentationLayerWithStyle(
        IfcLabel name,
        IfcText description,
        SET<IfcLayeredItem> assignedItems,
        IfcIdentifier identifier,
        LOGICAL layerOn,
        LOGICAL layerFrozen,
        LOGICAL layerBlocked,
        SET<IfcPresentationStyleSelect> layerStyles
    ) {
        super(name, description, assignedItems, identifier);
        this.layerOn = layerOn;
        this.layerFrozen = layerFrozen;
        this.layerBlocked = layerBlocked;
        this.layerStyles = layerStyles;
    }

    public LOGICAL getLayerOn() {
        return layerOn;
    }

    public void setLayerOn(LOGICAL layerOn) {
        this.layerOn = layerOn;
    }

    public LOGICAL getLayerFrozen() {
        return layerFrozen;
    }

    public void setLayerFrozen(LOGICAL layerFrozen) {
        this.layerFrozen = layerFrozen;
    }

    public LOGICAL getLayerBlocked() {
        return layerBlocked;
    }

    public void setLayerBlocked(LOGICAL layerBlocked) {
        this.layerBlocked = layerBlocked;
    }

    public SET<IfcPresentationStyleSelect> getLayerStyles() {
        return layerStyles;
    }

    public void setLayerStyles(SET<IfcPresentationStyleSelect> layerStyles) {
        this.layerStyles = layerStyles;
    }
}
