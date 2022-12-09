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
package org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.presentation.entity.IfcColourRgb;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.definedtype.IfcSpecularExponent;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.enumeration.IfcReflectanceMethodEnum;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcColourOrFactor;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcSpecularHighlightSelect;

import java.util.Locale;
import java.util.Optional;

/**
 * @author Yiwei
 * @date 2022/10/23
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceStyleRendering extends IfcSurfaceStyleShading {
    private IfcNormalisedRatioMeasure transparency;
    private IfcColourOrFactor diffuseColour;
    private IfcColourOrFactor transmissionColour;
    private IfcColourOrFactor diffuseTransmissionColour;
    private IfcColourOrFactor reflectionColour;
    private IfcColourOrFactor specularColour;
    private IfcSpecularHighlightSelect specularHighlight;
    private IfcReflectanceMethodEnum reflectanceMethod;

    public IfcSurfaceStyleRendering() {}

    @IfcParserConstructor
    public IfcSurfaceStyleRendering(
        IfcColourRgb surfaceColour,
        IfcNormalisedRatioMeasure transparency,
        IfcColourOrFactor diffuseColour,
        IfcColourOrFactor transmissionColour,
        IfcColourOrFactor diffuseTransmissionColour,
        IfcColourOrFactor reflectionColour,
        IfcColourOrFactor specularColour,
        IfcSpecularHighlightSelect specularHighlight,
        IfcReflectanceMethodEnum reflectanceMethod
    ) {
        super(surfaceColour);
        this.transparency = transparency;
        this.diffuseColour = diffuseColour;
        this.transmissionColour = transmissionColour;
        this.diffuseTransmissionColour = diffuseTransmissionColour;
        this.reflectionColour = reflectionColour;
        this.specularColour = specularColour;
        this.specularHighlight = specularHighlight;
        this.reflectanceMethod = reflectanceMethod;
    }

    public IfcNormalisedRatioMeasure getTransparency() {
        return transparency;
    }

    public void setTransparency(IfcNormalisedRatioMeasure transparency) {
        this.transparency = transparency;
    }

    public IfcColourOrFactor getDiffuseColour() {
        return diffuseColour;
    }

    public void setDiffuseColour(IfcColourOrFactor diffuseColour) {
        this.diffuseColour = diffuseColour;
    }

    public IfcColourOrFactor getTransmissionColour() {
        return transmissionColour;
    }

    public void setTransmissionColour(IfcColourOrFactor transmissionColour) {
        this.transmissionColour = transmissionColour;
    }

    public IfcColourOrFactor getDiffuseTransmissionColour() {
        return diffuseTransmissionColour;
    }

    public void setDiffuseTransmissionColour(IfcColourOrFactor diffuseTransmissionColour) {
        this.diffuseTransmissionColour = diffuseTransmissionColour;
    }

    public IfcColourOrFactor getReflectionColour() {
        return reflectionColour;
    }

    public void setReflectionColour(IfcColourOrFactor reflectionColour) {
        this.reflectionColour = reflectionColour;
    }

    public String getSpecularColour() {
        String format = String.format(
            "%s(%s)",
            specularColour.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            specularColour
        );

        return format;
    }

    public void setSpecularColour(IfcColourOrFactor specularColour) {
        this.specularColour = specularColour;
    }

    public String getSpecularHighlight() {
        String format = String.format(
            "%s(%s)",
            specularHighlight.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            specularHighlight
        );

        return format;
    }

    public void setSpecularHighlight(IfcSpecularHighlightSelect specularHighlight) {
        this.specularHighlight = specularHighlight;
    }

    public IfcReflectanceMethodEnum getReflectanceMethod() {
        return reflectanceMethod;
    }

    public void setReflectanceMethod(IfcReflectanceMethodEnum reflectanceMethod) {
        this.reflectanceMethod = reflectanceMethod;
    }

    @Override
    public String toIfc() {

        String format = String.format(
            "#%s=%s(%s,%s,%s,%s,%s,%s,%s,%s,%s)",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            StringConstant.WELL + getSurfaceColour().getStepNumber(),
            getTransparency(),
            Optional.ofNullable(getDiffuseColour())
                .map(x -> getDiffuseColour().toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(getTransmissionColour())
                .map(x -> getTransmissionColour().toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(getDiffuseTransmissionColour())
                .map(x -> getDiffuseTransmissionColour().toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(getReflectionColour())
                .map(x -> getReflectionColour().toString())
                .orElse(StringConstant.DOLLAR),
            getSpecularColour(),
            getSpecularHighlight(),
            StringConstant.DOT + getReflectanceMethod() + StringConstant.DOT
        );

        return format;
    }
}
