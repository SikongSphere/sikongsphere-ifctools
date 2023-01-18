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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.entity.IfcPresentationLayerAssignment;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity.IfcStyledItem;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLayeredItem;

/**
 * A instance of the class is an element of product data that participates in one or more representations
 * or contributes to the definition of another representation item.
 *
 * @author Wang Bohong
 * @date 2022/9/1 13:29
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcRepresentationItem extends IfcAbstractClass implements IfcLayeredItem {
    @IfcInverseParameter
    private SET<IfcPresentationLayerAssignment> layerAssignments;
    @IfcInverseParameter
    private SET<IfcStyledItem> styledByItem;

    @IfcParserConstructor
    public IfcRepresentationItem() {}

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
