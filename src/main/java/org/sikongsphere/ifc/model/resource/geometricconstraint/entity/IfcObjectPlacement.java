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
package org.sikongsphere.ifc.model.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.presentationorganization.entity.IfcPresentationLayerAssignment;
import org.sikongsphere.ifc.model.resource.presentationorganization.entity.IfcStyledItem;

/**
 * Abstract supertype for the special types defining the object coordinate system.
 * The IfcObjectPlacement has to be provided for each product that has a shape representation.
 *
 * @author stan
 * @date 2022/09/01 22:18
 */
public class IfcObjectPlacement {

    private SET<IfcPresentationLayerAssignment> layerAssignments;
    private SET<IfcStyledItem> styledByItem;

    public IfcObjectPlacement(SET<IfcPresentationLayerAssignment> layerAssignments, SET<IfcStyledItem> styledByItem) {
        this.layerAssignments = layerAssignments;
        this.styledByItem = styledByItem;
    }

    public IfcObjectPlacement() {}

    public SET<IfcPresentationLayerAssignment> getLayerAssignments() {
        return layerAssignments;
    }

    public void setLayerAssignments(SET<IfcPresentationLayerAssignment> layerAssignments) {
        this.layerAssignments = layerAssignments;
    }

    public SET<IfcStyledItem> getStyledByItem() {
        return styledByItem;
    }

    public void setStyledByItem(SET<IfcStyledItem> styledByItem) {
        this.styledByItem = styledByItem;
    }
}