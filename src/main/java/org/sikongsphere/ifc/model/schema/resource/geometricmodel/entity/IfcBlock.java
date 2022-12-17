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
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * A block is a solid rectangular parallelepiped, defined with a location and placement coordinate system.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBlock extends IfcCsgPrimitive3D {
    private IfcPositiveLengthMeasure xLength;
    private IfcPositiveLengthMeasure yLength;
    private IfcPositiveLengthMeasure zLength;

    @IfcParserConstructor
    public IfcBlock(
        IfcAxis2Placement3D position,
        IfcPositiveLengthMeasure xLength,
        IfcPositiveLengthMeasure yLength,
        IfcPositiveLengthMeasure zLength
    ) {
        super(position);
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
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

    public IfcPositiveLengthMeasure getzLength() {
        return zLength;
    }

    public void setzLength(IfcPositiveLengthMeasure zLength) {
        this.zLength = zLength;
    }
}
