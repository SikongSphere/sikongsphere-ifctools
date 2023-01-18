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
package org.sikongsphere.ifc.model.schema.resource.geometricmodel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * A right circular cone is a CSG primitive in the form of a cone. It is defined by an axis, a point on the axis, (...)
 * and a distance giving the location along the axis from the point to the base of the cone.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRightCircularCone extends IfcCsgPrimitive3D {
    private IfcPositiveLengthMeasure height;
    private IfcPositiveLengthMeasure bottomRadius;

    @IfcParserConstructor
    public IfcRightCircularCone(
        IfcAxis2Placement3D position,
        IfcPositiveLengthMeasure height,
        IfcPositiveLengthMeasure bottomRadius
    ) {
        super(position);
        this.height = height;
        this.bottomRadius = bottomRadius;
    }

    public IfcPositiveLengthMeasure getHeight() {
        return height;
    }

    public void setHeight(IfcPositiveLengthMeasure height) {
        this.height = height;
    }

    public IfcPositiveLengthMeasure getBottomRadius() {
        return bottomRadius;
    }

    public void setBottomRadius(IfcPositiveLengthMeasure bottomRadius) {
        this.bottomRadius = bottomRadius;
    }
}
