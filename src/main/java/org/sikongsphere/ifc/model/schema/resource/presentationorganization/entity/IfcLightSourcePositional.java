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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcReal;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcColourRgb;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLightSourcePositional extends IfcLightSource {
    private IfcCartesianPoint position;
    private IfcPositiveLengthMeasure redius;
    private IfcReal constantAttenuation;
    private IfcReal distanceAttenuation;
    private IfcReal quadricAttenuation;

    @IfcParserConstructor
    public IfcLightSourcePositional(
        IfcLabel name,
        IfcColourRgb lightColour,
        IfcNormalisedRatioMeasure ambientIntensity,
        IfcNormalisedRatioMeasure intensity,
        IfcCartesianPoint position,
        IfcPositiveLengthMeasure redius,
        IfcReal constantAttenuation,
        IfcReal distanceAttenuation,
        IfcReal quadricAttenuation
    ) {
        super(name, lightColour, ambientIntensity, intensity);
        this.position = position;
        this.redius = redius;
        this.constantAttenuation = constantAttenuation;
        this.distanceAttenuation = distanceAttenuation;
        this.quadricAttenuation = quadricAttenuation;
    }

    public IfcCartesianPoint getPosition() {
        return position;
    }

    public void setPosition(IfcCartesianPoint position) {
        this.position = position;
    }

    public IfcPositiveLengthMeasure getRedius() {
        return redius;
    }

    public void setRedius(IfcPositiveLengthMeasure redius) {
        this.redius = redius;
    }

    public IfcReal getConstantAttenuation() {
        return constantAttenuation;
    }

    public void setConstantAttenuation(IfcReal constantAttenuation) {
        this.constantAttenuation = constantAttenuation;
    }

    public IfcReal getDistanceAttenuation() {
        return distanceAttenuation;
    }

    public void setDistanceAttenuation(IfcReal distanceAttenuation) {
        this.distanceAttenuation = distanceAttenuation;
    }

    public IfcReal getQuadricAttenuation() {
        return quadricAttenuation;
    }

    public void setQuadricAttenuation(IfcReal quadricAttenuation) {
        this.quadricAttenuation = quadricAttenuation;
    }
}
