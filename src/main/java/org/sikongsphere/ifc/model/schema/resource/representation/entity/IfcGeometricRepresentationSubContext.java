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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.representation.enumeration.IfcGeometricProjectionEnum;

/**
 * The IfcGeometricRepresentationSubContext defines the context that applies to several shape representations
 * of a product being a sub context, sharing the WorldCoordinateSystem, CoordinateSpaceDimension, Precision
 * and TrueNorth attributes with the parent IfcGeometricRepresentationContext.
 *
 * @author stan
 * @date 2022/09/02 13:31
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext {

    private IfcGeometricRepresentationContext parentContext;
    @IfcOptionField
    private IfcPositiveRatioMeasure targetScale;
    private IfcGeometricProjectionEnum targetView;
    @IfcOptionField
    private IfcLabel userDefinedTargetView;

    public IfcGeometricRepresentationSubContext() {}

    @IfcParserConstructor
    public IfcGeometricRepresentationSubContext(
        IfcLabel contextIdentifier,
        IfcLabel contextType,
        IfcDimensionCount coordinateSpaceDimension,
        DOUBLE precision,
        IfcAxis2Placement worldCoordinateSystem,
        IfcDirection trueNorth,
        IfcGeometricRepresentationContext parentContext,
        IfcPositiveRatioMeasure targetScale,
        IfcGeometricProjectionEnum targetView,
        IfcLabel userDefinedTargetView
    ) {
        super(
            contextIdentifier,
            contextType,
            coordinateSpaceDimension,
            precision,
            worldCoordinateSystem,
            trueNorth
        );
        this.parentContext = parentContext;
        this.targetScale = targetScale;
        this.targetView = targetView;
        this.userDefinedTargetView = userDefinedTargetView;
    }

    public IfcGeometricRepresentationContext getParentContext() {
        return parentContext;
    }

    public void setParentContext(IfcGeometricRepresentationContext parentContext) {
        this.parentContext = parentContext;
    }

    public IfcPositiveRatioMeasure getTargetScale() {
        return targetScale;
    }

    public void setTargetScale(IfcPositiveRatioMeasure targetScale) {
        this.targetScale = targetScale;
    }

    public IfcGeometricProjectionEnum getTargetView() {
        return targetView;
    }

    public void setTargetView(IfcGeometricProjectionEnum targetView) {
        this.targetView = targetView;
    }

    public IfcLabel getUserDefinedTargetView() {
        return userDefinedTargetView;
    }

    public void setUserDefinedTargetView(IfcLabel userDefinedTargetView) {
        this.userDefinedTargetView = userDefinedTargetView;
    }
}
