package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.IfcNonLeafNode;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcReal;

/**
 * IfcSurfaceStyleRefraction extends the surface style lighting, or the surface style rendering definition
 * for properties for calculation of physically exact illuminance by adding seldomly used properties.
 *
 * @author stan
 * @date 2022/09/02 13:26
 */
public class IfcSurfaceStyleRefraction {
    private IfcReal refractionIndex;
    private IfcReal dispersionFactor;

    public IfcSurfaceStyleRefraction() {
    }

    public IfcSurfaceStyleRefraction(IfcReal refractionIndex, IfcReal dispersionFactor) {
        this.refractionIndex = refractionIndex;
        this.dispersionFactor = dispersionFactor;
    }

    public IfcReal getRefractionIndex() {
        return refractionIndex;
    }

    public void setRefractionIndex(IfcReal refractionIndex) {
        this.refractionIndex = refractionIndex;
    }

    public IfcReal getDispersionFactor() {
        return dispersionFactor;
    }

    public void setDispersionFactor(IfcReal dispersionFactor) {
        this.dispersionFactor = dispersionFactor;
    }
}
