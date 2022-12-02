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
package org.sikongsphere.ifc.newModel.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.presentation.entity.IfcColourRgb;

/**
 * IfcSurfaceStyleLighting is a container class
 * for properties for calculation of physically exact illuminance related to a particular surface style.
 *
 * @author stan
 * @date 2022/09/02 13:20
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceStyleLighting {
    private IfcColourRgb diffusetransmissionColor;
    private IfcColourRgb diffuseReflectionColour;
    private IfcColourRgb transmissionColour;
    private IfcColourRgb reflectanceColour;

    public IfcSurfaceStyleLighting() {}

    public IfcSurfaceStyleLighting(
        IfcColourRgb diffusetransmissionColor,
        IfcColourRgb diffuseReflectionColour,
        IfcColourRgb transmissionColour,
        IfcColourRgb reflectanceColour
    ) {
        this.diffusetransmissionColor = diffusetransmissionColor;
        this.diffuseReflectionColour = diffuseReflectionColour;
        this.transmissionColour = transmissionColour;
        this.reflectanceColour = reflectanceColour;
    }

    public IfcColourRgb getDiffusetransmissionColor() {
        return diffusetransmissionColor;
    }

    public void setDiffusetransmissionColor(IfcColourRgb diffusetransmissionColor) {
        this.diffusetransmissionColor = diffusetransmissionColor;
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
}
