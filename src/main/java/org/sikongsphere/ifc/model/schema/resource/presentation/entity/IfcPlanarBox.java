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
package org.sikongsphere.ifc.model.schema.resource.presentation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;

/**
 * A planar box specifies an arbitrary rectangular box and its location in a two dimensional Cartesian coordinate system.
 *
 * @author zaiyuan
 * @date 2022/12/17 13:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPlanarBox extends IfcPlanarExtent {
    private IfcAxis2Placement placement;

    @IfcParserConstructor
    public IfcPlanarBox(
        IfcLengthMeasure sizeInX,
        IfcLengthMeasure sizeInY,
        IfcAxis2Placement placement
    ) {
        super(sizeInX, sizeInY);
        this.placement = placement;
    }

    public IfcAxis2Placement getPlacement() {
        return placement;
    }

    public void setPlacement(IfcAxis2Placement placement) {
        this.placement = placement;
    }
}
