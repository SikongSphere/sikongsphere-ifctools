package org.sikongsphere.ifc.model.resource.presentation.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcColourSpecification;

/**
 * A colour rgb as a subtype of colour specifications is defined
 * by three colour component values for red, green, and blue in the RGB colour model.
 *
 * @author stan
 * @date 2022/09/02 13:18
 */
public class IfcColourRgb extends IfcColourSpecification {
    private IfcNormalisedRatioMeasure red;
    private IfcNormalisedRatioMeasure green;
    private IfcNormalisedRatioMeasure blue;

    public IfcColourRgb() {
    }

    public IfcColourRgb(IfcNormalisedRatioMeasure red, IfcNormalisedRatioMeasure green, IfcNormalisedRatioMeasure blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public IfcNormalisedRatioMeasure getRed() {
        return red;
    }

    public void setRed(IfcNormalisedRatioMeasure red) {
        this.red = red;
    }

    public IfcNormalisedRatioMeasure getGreen() {
        return green;
    }

    public void setGreen(IfcNormalisedRatioMeasure green) {
        this.green = green;
    }

    public IfcNormalisedRatioMeasure getBlue() {
        return blue;
    }

    public void setBlue(IfcNormalisedRatioMeasure blue) {
        this.blue = blue;
    }
}
