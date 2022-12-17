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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcColourRgb;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcLightSource extends IfcGeometricRepresentationItem {
    @IfcOptionField
    private IfcLabel name;
    private IfcColourRgb lightColour;
    @IfcOptionField
    private IfcNormalisedRatioMeasure ambientIntensity;
    @IfcOptionField
    private IfcNormalisedRatioMeasure intensity;

    @IfcParserConstructor
    public IfcLightSource(
        IfcLabel name,
        IfcColourRgb lightColour,
        IfcNormalisedRatioMeasure ambientIntensity,
        IfcNormalisedRatioMeasure intensity
    ) {
        this.name = name;
        this.lightColour = lightColour;
        this.ambientIntensity = ambientIntensity;
        this.intensity = intensity;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcColourRgb getLightColour() {
        return lightColour;
    }

    public void setLightColour(IfcColourRgb lightColour) {
        this.lightColour = lightColour;
    }

    public IfcNormalisedRatioMeasure getAmbientIntensity() {
        return ambientIntensity;
    }

    public void setAmbientIntensity(IfcNormalisedRatioMeasure ambientIntensity) {
        this.ambientIntensity = ambientIntensity;
    }

    public IfcNormalisedRatioMeasure getIntensity() {
        return intensity;
    }

    public void setIntensity(IfcNormalisedRatioMeasure intensity) {
        this.intensity = intensity;
    }
}
