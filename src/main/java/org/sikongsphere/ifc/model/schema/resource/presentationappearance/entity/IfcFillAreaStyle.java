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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcFillStyleSelect;

/**
 * An IfcFillAreaStyle provides the style table for presentation information assigned
 * to annotation fill areas or surfaces for hatching and tiling.
 *
 * @author stan
 * @date 2022/09/01 23:51
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFillAreaStyle extends IfcPresentationStyle {
    private SET<IfcFillStyleSelect> fillStyles;

    public IfcFillAreaStyle(SET<IfcFillStyleSelect> fillStyles) {
        this.fillStyles = fillStyles;
    }

    public SET<IfcFillStyleSelect> getFillStyles() {
        return fillStyles;
    }

    public void setFillStyles(SET<IfcFillStyleSelect> fillStyles) {
        this.fillStyles = fillStyles;
    }
}
