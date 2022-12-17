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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * A box domain is an orthogonal box parallel to the axes of the geometric coordinate system which may be used to limit
 * the domain of a half space solid.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBoundingBox extends IfcGeometricRepresentationItem {
    private IfcCartesianPoint corner;
    private IfcPositiveLengthMeasure xDim;
    private IfcPositiveLengthMeasure yDim;
    private IfcPositiveLengthMeasure zDim;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcBoundingBox(
        IfcCartesianPoint corner,
        IfcPositiveLengthMeasure xDim,
        IfcPositiveLengthMeasure yDim,
        IfcPositiveLengthMeasure zDim
    ) {
        this.corner = corner;
        this.xDim = xDim;
        this.yDim = yDim;
        this.zDim = zDim;
    }

    public IfcCartesianPoint getCorner() {
        return corner;
    }

    public void setCorner(IfcCartesianPoint corner) {
        this.corner = corner;
    }

    public IfcPositiveLengthMeasure getxDim() {
        return xDim;
    }

    public void setxDim(IfcPositiveLengthMeasure xDim) {
        this.xDim = xDim;
    }

    public IfcPositiveLengthMeasure getyDim() {
        return yDim;
    }

    public void setyDim(IfcPositiveLengthMeasure yDim) {
        this.yDim = yDim;
    }

    public IfcPositiveLengthMeasure getzDim() {
        return zDim;
    }

    public void setzDim(IfcPositiveLengthMeasure zDim) {
        this.zDim = zDim;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
