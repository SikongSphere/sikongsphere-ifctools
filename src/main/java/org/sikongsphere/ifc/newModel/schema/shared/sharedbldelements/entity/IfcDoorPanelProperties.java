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
package org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.core.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.representation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.enumeration.IfcDoorPanelOperationEnum;
import org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.enumeration.IfcDoorPanelPositionEnum;

/**
 * A description of the door panel. A door panel is normally a door leaf that opens to allow people or goods to pass.
 * @author Wang Bohong
 * @date 2022/10/25 12:41
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcDoorPanelProperties extends IfcPropertySetDefinition {
    private IfcPositiveLengthMeasure panelDepth;
    private IfcDoorPanelOperationEnum panelOperation;
    private IfcNormalisedRatioMeasure panelWidth;
    private IfcDoorPanelPositionEnum panelPosition;
    private IfcShapeAspect shapeAspect;

    public IfcDoorPanelProperties() {}

    @IfcParserConstructor
    public IfcDoorPanelProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPositiveLengthMeasure panelDepth,
        IfcDoorPanelOperationEnum panelOperation,
        IfcNormalisedRatioMeasure panelWidth,
        IfcDoorPanelPositionEnum panelPosition,
        IfcShapeAspect shapeAspect
    ) {
        super(globalId, ownerHistory, name, description);
        this.panelDepth = panelDepth;
        this.panelOperation = panelOperation;
        this.panelWidth = panelWidth;
        this.panelPosition = panelPosition;
        this.shapeAspect = shapeAspect;
    }

    public IfcPositiveLengthMeasure getPanelDepth() {
        return panelDepth;
    }

    public void setPanelDepth(IfcPositiveLengthMeasure panelDepth) {
        this.panelDepth = panelDepth;
    }

    public IfcDoorPanelOperationEnum getPanelOperation() {
        return panelOperation;
    }

    public void setPanelOperation(IfcDoorPanelOperationEnum panelOperation) {
        this.panelOperation = panelOperation;
    }

    public IfcNormalisedRatioMeasure getPanelWidth() {
        return panelWidth;
    }

    public void setPanelWidth(IfcNormalisedRatioMeasure panelWidth) {
        this.panelWidth = panelWidth;
    }

    public IfcDoorPanelPositionEnum getPanelPosition() {
        return panelPosition;
    }

    public void setPanelPosition(IfcDoorPanelPositionEnum panelPosition) {
        this.panelPosition = panelPosition;
    }

    public IfcShapeAspect getShapeAspect() {
        return shapeAspect;
    }

    public void setShapeAspect(IfcShapeAspect shapeAspect) {
        this.shapeAspect = shapeAspect;
    }
}
