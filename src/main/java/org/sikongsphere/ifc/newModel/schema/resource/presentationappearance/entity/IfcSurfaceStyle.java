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
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.selecttype.IfcSurfaceStyleElementSelect;
import org.sikongsphere.ifc.newModel.schema.resource.presentationappearance.enumeration.IfcSurfaceSide;

import java.util.List;
import java.util.Locale;
import java.util.Set;

/**
 * An assignment of one or many surface style elements to a surface,
 * defined by subtypes of IfcSurface, IfcFaceBasedSurfaceModel, IfcShellBasedSurfaceModel, or by subtypes of IfcSolidModel.
 *
 * @author stan
 * @date 2022/09/02 13:16
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceStyle extends IfcPresentationStyle {
    private IfcSurfaceSide side;
    private SET<IfcSurfaceStyleElementSelect> styles;

    public IfcSurfaceStyle() {}

    @IfcParserConstructor
    public IfcSurfaceStyle(
        IfcLabel name,
        IfcSurfaceSide side,
        SET<IfcSurfaceStyleElementSelect> styles
    ) {
        super(name);
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
