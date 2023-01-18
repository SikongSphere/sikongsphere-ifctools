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
package org.sikongsphere.ifc.model.schema.domain.architecture.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.domain.architecture.enumeration.IfcPermeableCoveringOperationEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.building.enumeration.IfcWindowPanelPositionEnum;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcPermeableCoveringProperties extends IfcPropertySetDefinition {
    private IfcPermeableCoveringOperationEnum operationType;
    private IfcWindowPanelPositionEnum panelPosition;
    @IfcOptionField
    private IfcPositiveLengthMeasure frameDepth;
    @IfcOptionField
    private IfcPositiveLengthMeasure frameThickness;
    @IfcOptionField
    private IfcShapeAspect shapeAspectStyle;

    @IfcParserConstructor
    public IfcPermeableCoveringProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPermeableCoveringOperationEnum operationType,
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

    public IfcPermeableCoveringOperationEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(IfcPermeableCoveringOperationEnum operationType) {
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
