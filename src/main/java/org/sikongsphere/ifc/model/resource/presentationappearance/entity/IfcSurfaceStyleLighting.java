package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.resource.presentation.entity.IfcColourRgb;

/**
 * IfcSurfaceStyleLighting is a container class
 * for properties for calculation of physically exact illuminance related to a particular surface style.
 *
 * @author stan
 * @date 2022/09/02 13:20
 */
public class IfcSurfaceStyleLighting {
    private IfcColourRgb diffusetransmissionColor;
    private IfcColourRgb diffuseReflectionColour;
    private IfcColourRgb transmissionColour;
    private IfcColourRgb reflectanceColour;

    public IfcSurfaceStyleLighting() {
    }

    public IfcSurfaceStyleLighting(IfcColourRgb diffusetransmissionColor, IfcColourRgb diffuseReflectionColour, IfcColourRgb transmissionColour, IfcColourRgb reflectanceColour) {
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
