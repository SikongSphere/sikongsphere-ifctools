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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcBoundedCurve;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRectangularPyramid extends IfcCsgPrimitive3D {
    private IfcPositiveLengthMeasure xLength;
    private IfcPositiveLengthMeasure yLength;
    private IfcPositiveLengthMeasure height;

    @IfcParserConstructor
    public IfcRectangularPyramid(
        IfcAxis2Placement3D position,
        IfcPositiveLengthMeasure xLength,
        IfcPositiveLengthMeasure yLength,
        IfcPositiveLengthMeasure height
    ) {
        super(position);
        this.xLength = xLength;
        this.yLength = yLength;
        this.height = height;
    }

    public IfcPositiveLengthMeasure getxLength() {
        return xLength;
    }

    public void setxLength(IfcPositiveLengthMeasure xLength) {
        this.xLength = xLength;
    }

    public IfcPositiveLengthMeasure getyLength() {
        return yLength;
    }

    public void setyLength(IfcPositiveLengthMeasure yLength) {
        this.yLength = yLength;
    }

    public IfcPositiveLengthMeasure getHeight() {
        return height;
    }

    public void setHeight(IfcPositiveLengthMeasure height) {
        this.height = height;
    }
}
