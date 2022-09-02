package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcSurfaceStyleElementSelect;
import org.sikongsphere.ifc.model.resource.representation.enumeration.IfcSurfaceSide;

/**
 * An assignment of one or many surface style elements to a surface,
 * defined by subtypes of IfcSurface, IfcFaceBasedSurfaceModel, IfcShellBasedSurfaceModel, or by subtypes of IfcSolidModel.
 *
 * @author stan
 * @date 2022/09/02 13:16
 */
public class IfcSurfaceStyle extends IfcPresentationStyle{
    private IfcSurfaceSide side;
    private SET<IfcSurfaceStyleElementSelect> styles;

    public IfcSurfaceStyle() {
    }

    public IfcSurfaceStyle(IfcSurfaceSide side, SET<IfcSurfaceStyleElementSelect> styles) {
        this.side = side;
        this.styles = styles;
    }

    public IfcSurfaceSide getSide() {
        return side;
    }

    public void setSide(IfcSurfaceSide side) {
        this.side = side;
    }

    public SET<IfcSurfaceStyleElementSelect> getStyles() {
        return styles;
    }

    public void setStyles(SET<IfcSurfaceStyleElementSelect> styles) {
        this.styles = styles;
    }
}
