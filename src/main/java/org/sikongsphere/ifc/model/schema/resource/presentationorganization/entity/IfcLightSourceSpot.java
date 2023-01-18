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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcReal;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcColourRgb;

/**
 * The Spot light node defines a light source that emits light from a specific point along a specific direction vector and constrained within a solid angle.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLightSourceSpot extends IfcLightSourcePositional {
    private IfcDirection orientation;
    @IfcOptionField
    private IfcReal concentrationExponent;
    private IfcPositiveLengthMeasure spreadAngle;
    private IfcPositiveLengthMeasure beamWidthAngle;

    @IfcParserConstructor
    public IfcLightSourceSpot(
        IfcLabel name,
        IfcColourRgb lightColour,
        IfcNormalisedRatioMeasure ambientIntensity,
        IfcNormalisedRatioMeasure intensity,
        IfcCartesianPoint position,
        IfcPositiveLengthMeasure radius,
        IfcReal constantAttenuation,
        IfcReal distanceAttenuation,
        IfcReal quadricAttenuation,
        IfcDirection orientation,
        IfcReal concentrationExponent,
        IfcPositiveLengthMeasure spreadAngle,
        IfcPositiveLengthMeasure beamWidthAngle
    ) {
        super(
            name,
            lightColour,
            ambientIntensity,
            intensity,
            position,
            radius,
            constantAttenuation,
            distanceAttenuation,
            quadricAttenuation
        );
        this.orientation = orientation;
        this.concentrationExponent = concentrationExponent;
        this.spreadAngle = spreadAngle;
        this.beamWidthAngle = beamWidthAngle;
    }

    public IfcDirection getOrientation() {
        return orientation;
    }

    public void setOrientation(IfcDirection orientation) {
        this.orientation = orientation;
    }

    public IfcReal getConcentrationExponent() {
        return concentrationExponent;
    }

    public void setConcentrationExponent(IfcReal concentrationExponent) {
        this.concentrationExponent = concentrationExponent;
    }

    public IfcPositiveLengthMeasure getSpreadAngle() {
        return spreadAngle;
    }

    public void setSpreadAngle(IfcPositiveLengthMeasure spreadAngle) {
        this.spreadAngle = spreadAngle;
    }

    public IfcPositiveLengthMeasure getBeamWidthAngle() {
        return beamWidthAngle;
    }

    public void setBeamWidthAngle(IfcPositiveLengthMeasure beamWidthAngle) {
        this.beamWidthAngle = beamWidthAngle;
    }
}
