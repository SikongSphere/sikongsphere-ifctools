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
package org.sikongsphere.ifc.model.schema.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.core.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Yiwei
 * @date 2022/10/25
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcDoorLiningProperties extends IfcPropertySetDefinition {
    private IfcPositiveLengthMeasure liningDepth;
    private IfcPositiveLengthMeasure liningThickness;
    private IfcPositiveLengthMeasure thresholdDepth;
    private IfcPositiveLengthMeasure thresholdThickness;
    private IfcPositiveLengthMeasure transomThickness;
    private IfcLengthMeasure transomOffset;
    private IfcLengthMeasure liningOffset;
    private IfcLengthMeasure thresholdOffset;
    private IfcPositiveLengthMeasure casingThickness;
    private IfcPositiveLengthMeasure casingDepth;
    private IfcShapeAspect shapeAspectStyle;

    public IfcDoorLiningProperties() {}

    @IfcParserConstructor
    public IfcDoorLiningProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPositiveLengthMeasure liningDepth,
        IfcPositiveLengthMeasure liningThickness,
        IfcPositiveLengthMeasure thresholdDepth,
        IfcPositiveLengthMeasure thresholdThickness,
        IfcPositiveLengthMeasure transomThickness,
        IfcLengthMeasure transomOffset,
        IfcLengthMeasure liningOffset,
        IfcLengthMeasure thresholdOffset,
        IfcPositiveLengthMeasure casingThickness,
        IfcPositiveLengthMeasure casingDepth,
        IfcShapeAspect shapeAspectStyle
    ) {
        super(globalId, ownerHistory, name, description);
        this.liningDepth = liningDepth;
        this.liningThickness = liningThickness;
        this.thresholdDepth = thresholdDepth;
        this.thresholdThickness = thresholdThickness;
        this.transomThickness = transomThickness;
        this.transomOffset = transomOffset;
        this.liningOffset = liningOffset;
        this.thresholdOffset = thresholdOffset;
        this.casingThickness = casingThickness;
        this.casingDepth = casingDepth;
        this.shapeAspectStyle = shapeAspectStyle;
    }

    public IfcPositiveLengthMeasure getLiningDepth() {
        return liningDepth;
    }

    public void setLiningDepth(IfcPositiveLengthMeasure liningDepth) {
        this.liningDepth = liningDepth;
    }

    public IfcPositiveLengthMeasure getLiningThickness() {
        return liningThickness;
    }

    public void setLiningThickness(IfcPositiveLengthMeasure liningThickness) {
        this.liningThickness = liningThickness;
    }

    public IfcPositiveLengthMeasure getThresholdDepth() {
        return thresholdDepth;
    }

    public void setThresholdDepth(IfcPositiveLengthMeasure thresholdDepth) {
        this.thresholdDepth = thresholdDepth;
    }

    public IfcPositiveLengthMeasure getThresholdThickness() {
        return thresholdThickness;
    }

    public void setThresholdThickness(IfcPositiveLengthMeasure thresholdThickness) {
        this.thresholdThickness = thresholdThickness;
    }

    public IfcPositiveLengthMeasure getTransomThickness() {
        return transomThickness;
    }

    public void setTransomThickness(IfcPositiveLengthMeasure transomThickness) {
        this.transomThickness = transomThickness;
    }

    public IfcLengthMeasure getTransomOffset() {
        return transomOffset;
    }

    public void setTransomOffset(IfcLengthMeasure transomOffset) {
        this.transomOffset = transomOffset;
    }

    public IfcLengthMeasure getLiningOffset() {
        return liningOffset;
    }

    public void setLiningOffset(IfcLengthMeasure liningOffset) {
        this.liningOffset = liningOffset;
    }

    public IfcLengthMeasure getThresholdOffset() {
        return thresholdOffset;
    }

    public void setThresholdOffset(IfcLengthMeasure thresholdOffset) {
        this.thresholdOffset = thresholdOffset;
    }

    public IfcPositiveLengthMeasure getCasingThickness() {
        return casingThickness;
    }

    public void setCasingThickness(IfcPositiveLengthMeasure casingThickness) {
        this.casingThickness = casingThickness;
    }

    public IfcPositiveLengthMeasure getCasingDepth() {
        return casingDepth;
    }

    public void setCasingDepth(IfcPositiveLengthMeasure casingDepth) {
        this.casingDepth = casingDepth;
    }

    public IfcShapeAspect getShapeAspectStyle() {
        return shapeAspectStyle;
    }

    public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
        this.shapeAspectStyle = shapeAspectStyle;
    }
}
