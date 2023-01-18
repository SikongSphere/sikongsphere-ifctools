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
package org.sikongsphere.ifc.model.schema.shared.building.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.building.enumeration.IfcWindowPanelOperationEnum;
import org.sikongsphere.ifc.model.schema.shared.building.enumeration.IfcWindowPanelPositionEnum;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeAspect;

/**
 * A description of the window panel. A window panel is a casement, i.e. a component, fixed or opening, consisting
 * essentially of a frame and the infilling. The infilling of a window panel is normally glazing. The way of operation
 * is defined in the operation type.
 * @author Kuang Tianyu
 * @date 2022/12/18 16:47
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcWindowPanelProperties extends IfcPropertySetDefinition {
    private IfcWindowPanelOperationEnum operationType;
    private IfcWindowPanelPositionEnum panelPosition;
    @IfcOptionField
    private IfcPositiveLengthMeasure frameDepth;
    @IfcOptionField
    private IfcPositiveLengthMeasure frameThickness;
    @IfcOptionField
    private IfcShapeAspect shapeAspectStyle;

    public IfcWindowPanelProperties() {}

    @IfcParserConstructor
    public IfcWindowPanelProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcWindowPanelOperationEnum operationType,
        IfcWindowPanelPositionEnum panelPosition,
        IfcPositiveLengthMeasure frameDepth,
        IfcPositiveLengthMeasure frameThickness,
        IfcShapeAspect shapeAspectStyle
    ) {
        super(globalId, ownerHistory, name, description);
        this.operationType = operationType;
        this.panelPosition = panelPosition;
        this.frameDepth = frameDepth;
        this.frameThickness = frameThickness;
        this.shapeAspectStyle = shapeAspectStyle;
    }

    public IfcWindowPanelOperationEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(IfcWindowPanelOperationEnum operationType) {
        this.operationType = operationType;
    }

    public IfcWindowPanelPositionEnum getPanelPosition() {
        return panelPosition;
    }

    public void setPanelPosition(IfcWindowPanelPositionEnum panelPosition) {
        this.panelPosition = panelPosition;
    }

    public IfcPositiveLengthMeasure getFrameDepth() {
        return frameDepth;
    }

    public void setFrameDepth(IfcPositiveLengthMeasure frameDepth) {
        this.frameDepth = frameDepth;
    }

    public IfcPositiveLengthMeasure getFrameThickness() {
        return frameThickness;
    }

    public void setFrameThickness(IfcPositiveLengthMeasure frameThickness) {
        this.frameThickness = frameThickness;
    }

    public IfcShapeAspect getShapeAspectStyle() {
        return shapeAspectStyle;
    }

    public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
        this.shapeAspectStyle = shapeAspectStyle;
    }
}
