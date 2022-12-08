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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcAxis2Placement;
import org.sikongsphere.ifc.model.resource.representation.enumeration.IfcGeometricProjectionEnum;

import java.util.Locale;
import java.util.Optional;

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
    private IfcPositiveRatioMeasure targetScale;
    private IfcGeometricProjectionEnum targetView;
    private IfcLabel userDefinedTargetView;

    public IfcGeometricRepresentationSubContext() {}

    @IfcParserConstructor
    public IfcGeometricRepresentationSubContext(
        IfcLabel contextIdentifier,
        IfcLabel contextType,
        IfcDimensionCount coordinateSpaceDimension,
        STRING precision,
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

    @Override
    public String toString() {

        STRING precision = getPrecision();
        String temp;

        if (precision.isDefault()) {
            temp = StringConstant.ASTERISK;
        } else {
            temp = precision.value;
        }

        String format = String.format(
            "#%s=%s(%s,%s,%s,%s,%s,%s,#%s,%s,%s,%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            getContextIdentifier().value,
            getContextType().value,
            Optional.ofNullable(getCoordinateSpaceDimension().getDimensionCount())
                .map(x -> getCoordinateSpaceDimension().getDimensionCount().toString())
                .orElse(StringConstant.ASTERISK),
            temp,
            Optional.ofNullable(getWorldCoordinateSystem())
                .map(x -> getWorldCoordinateSystem().toString())
                .orElse(StringConstant.ASTERISK),
            Optional.ofNullable(getTrueNorth().getDirectionRatios())
                .map(x -> getTrueNorth().toString())
                .orElse(StringConstant.ASTERISK),
            this.parentContext.stepNumber,
            Optional.ofNullable(this.targetScale)
                .map(x -> this.targetScale.getPositiveRatioMeasure().toString())
                .orElse(StringConstant.DOLLAR),
            StringConstant.DOT + this.targetView + StringConstant.DOT,
            Optional.ofNullable(this.userDefinedTargetView)
                .map(x -> this.userDefinedTargetView.value)
                .orElse(StringConstant.DOLLAR)
        );

        return format;
    }
}
