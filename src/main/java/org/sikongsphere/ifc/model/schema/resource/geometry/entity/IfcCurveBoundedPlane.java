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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;

/**
 * The curve bounded surface is a parametric surface with curved boundaries defined by one or more boundary curves.
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCurveBoundedPlane extends IfcBoundedSurface {
    private IfcPlane basisSurface;
    private IfcCurve outerBoundary;
    private SET<IfcCurve> innerBoundaries;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcCurveBoundedPlane(
        IfcPlane basisSurface,
        IfcCurve outerBoundary,
        SET<IfcCurve> innerBoundaries
    ) {
        this.basisSurface = basisSurface;
        this.outerBoundary = outerBoundary;
        this.innerBoundaries = innerBoundaries;
    }

    public IfcPlane getBasisSurface() {
        return basisSurface;
    }

    public void setBasisSurface(IfcPlane basisSurface) {
        this.basisSurface = basisSurface;
    }

    public IfcCurve getOuterBoundary() {
        return outerBoundary;
    }

    public void setOuterBoundary(IfcCurve outerBoundary) {
        this.outerBoundary = outerBoundary;
    }

    public SET<IfcCurve> getInnerBoundaries() {
        return innerBoundaries;
    }

    public void setInnerBoundaries(SET<IfcCurve> innerBoundaries) {
        this.innerBoundaries = innerBoundaries;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
