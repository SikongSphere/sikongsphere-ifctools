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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.presentation.entity.IfcColourRgb;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSurfaceStyleElementSelect;

/**
 * IfcSurfaceStyleLighting is a container class
 * for properties for calculation of physically exact illuminance related to a particular surface style.
 *
 * @author stan
 * @date 2022/09/02 13:20
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceStyleLighting implements IfcSurfaceStyleElementSelect {
    private IfcColourRgb diffuseTransmissionColour;
    private IfcColourRgb diffuseReflectionColour;
    private IfcColourRgb transmissionColour;
    private IfcColourRgb reflectanceColour;

    public IfcSurfaceStyleLighting() {}

    @IfcParserConstructor
    public IfcSurfaceStyleLighting(
        IfcColourRgb diffuseTransmissionColour,
        IfcColourRgb diffuseReflectionColour,
        IfcColourRgb transmissionColour,
        IfcColourRgb reflectanceColour
    ) {
        this.diffuseTransmissionColour = diffuseTransmissionColour;
        this.diffuseReflectionColour = diffuseReflectionColour;
        this.transmissionColour = transmissionColour;
        this.reflectanceColour = reflectanceColour;
    }

    public IfcColourRgb getDiffuseReflectionColour() {
        return diffuseReflectionColour;
    }

    public void setDiffuseReflectionColour(IfcColourRgb diffuseReflectionColour) {
        this.diffuseReflectionColour = diffuseReflectionColour;
    }

    public IfcColourRgb getTransmissionColour() {
        return transmissionColour;
    }

    public void setTransmissionColour(IfcColourRgb transmissionColour) {
        this.transmissionColour = transmissionColour;
    }

    public IfcColourRgb getReflectanceColour() {
        return reflectanceColour;
    }

    public void setReflectanceColour(IfcColourRgb reflectanceColour) {
        this.reflectanceColour = reflectanceColour;
    }

    public IfcColourRgb getDiffuseTransmissionColour() {
        return diffuseTransmissionColour;
    }

    public void setDiffuseTransmissionColour(IfcColourRgb diffuseTransmissionColour) {
        this.diffuseTransmissionColour = diffuseTransmissionColour;
    }
}
