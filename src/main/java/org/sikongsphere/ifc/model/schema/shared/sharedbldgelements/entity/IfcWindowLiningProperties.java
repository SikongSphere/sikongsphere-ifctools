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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcShapeAspect;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zhongqi
 * @date 2022/11/1
 */

@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcWindowLiningProperties extends IfcPropertySetDefinition {

    private IfcPositiveLengthMeasure liningDepth;
    private IfcPositiveLengthMeasure liningThickness;
    private IfcPositiveLengthMeasure transomThickness;
    private IfcPositiveLengthMeasure mullionThickness;
    private IfcNormalisedRatioMeasure firstTransomOffset;
    private IfcNormalisedRatioMeasure secondTransomOffset;
    private IfcNormalisedRatioMeasure firstMullionOffset;
    private IfcNormalisedRatioMeasure secondMullionOffset;
    private IfcShapeAspect shapeAspectStyle;

    public IfcWindowLiningProperties() {}

    @IfcParserConstructor
    public IfcWindowLiningProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPositiveLengthMeasure liningDepth,
        IfcPositiveLengthMeasure liningThickness,
        IfcPositiveLengthMeasure transomThickness,
        IfcPositiveLengthMeasure mullionThickness,
        IfcNormalisedRatioMeasure firstTransomOffset,
        IfcNormalisedRatioMeasure secondTransomOffset,
        IfcNormalisedRatioMeasure firstMullionOffset,
        IfcNormalisedRatioMeasure secondMullionOffset,
        IfcShapeAspect shapeAspectStyle
    ) {
        super(globalId, ownerHistory, name, description);
        this.liningDepth = liningDepth;
        this.liningThickness = liningThickness;
        this.transomThickness = transomThickness;
        this.mullionThickness = mullionThickness;
        this.firstTransomOffset = firstTransomOffset;
        this.secondTransomOffset = secondTransomOffset;
        this.firstMullionOffset = firstMullionOffset;
        this.secondMullionOffset = secondMullionOffset;
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

    public IfcPositiveLengthMeasure getTransomThickness() {
        return transomThickness;
    }

    public void setTransomThickness(IfcPositiveLengthMeasure transomThickness) {
        this.transomThickness = transomThickness;
    }

    public IfcPositiveLengthMeasure getMullionThickness() {
        return mullionThickness;
    }

    public void setMullionThickness(IfcPositiveLengthMeasure mullionThickness) {
        this.mullionThickness = mullionThickness;
    }

    public IfcNormalisedRatioMeasure getFirstTransomOffset() {
        return firstTransomOffset;
    }

    public void setFirstTransomOffset(IfcNormalisedRatioMeasure firstTransomOffset) {
        this.firstTransomOffset = firstTransomOffset;
    }

    public IfcNormalisedRatioMeasure getSecondTransomOffset() {
        return secondTransomOffset;
    }

    public void setSecondTransomOffset(IfcNormalisedRatioMeasure secondTransomOffset) {
        this.secondTransomOffset = secondTransomOffset;
    }

    public IfcNormalisedRatioMeasure getFirstMullionOffset() {
        return firstMullionOffset;
    }

    public void setFirstMullionOffset(IfcNormalisedRatioMeasure firstMullionOffset) {
        this.firstMullionOffset = firstMullionOffset;
    }

    public IfcNormalisedRatioMeasure getSecondMullionOffset() {
        return secondMullionOffset;
    }

    public void setSecondMullionOffset(IfcNormalisedRatioMeasure secondMullionOffset) {
        this.secondMullionOffset = secondMullionOffset;
    }

    public IfcShapeAspect getShapeAspectStyle() {
        return shapeAspectStyle;
    }

    public void setShapeAspectStyle(IfcShapeAspect shapeAspectStyle) {
        this.shapeAspectStyle = shapeAspectStyle;
    }
}
