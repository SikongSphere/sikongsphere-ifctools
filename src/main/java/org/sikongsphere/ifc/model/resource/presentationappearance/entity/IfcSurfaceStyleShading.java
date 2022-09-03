package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.resource.presentation.entity.IfcColourRgb;

/**
 * The surface style rendering allows the realistic visualization of surfaces
 * refering to rendering techniques based on the laws of physics and mathematics.
 *
 * @author stan
 * @date 2022/09/02 13:17
 */
public class IfcSurfaceStyleShading {
    private IfcColourRgb surfaceColour;

    public IfcSurfaceStyleShading() {
    }

    public IfcSurfaceStyleShading(IfcColourRgb surfaceColour) {
        this.surfaceColour = surfaceColour;
    }

    public IfcColourRgb getSurfaceColour() {
        return surfaceColour;
    }

    public void setSurfaceColour(IfcColourRgb surfaceColour) {
        this.surfaceColour = surfaceColour;
    }
}
