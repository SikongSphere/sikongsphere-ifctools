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
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcParameterValue;

/**
 *  A point on surface is a point which lies on a parametric surface.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPointOnSurface extends IfcPoint {
    private IfcSurface basisSurface;
    private IfcParameterValue pointParameterU;
    private IfcParameterValue pointParameterV;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcPointOnSurface(
        IfcSurface basisSurface,
        IfcParameterValue pointParameterU,
        IfcParameterValue pointParameterV
    ) {
        this.basisSurface = basisSurface;
        this.pointParameterU = pointParameterU;
        this.pointParameterV = pointParameterV;
    }

    public IfcSurface getBasisSurface() {
        return basisSurface;
    }

    public void setBasisSurface(IfcSurface basisSurface) {
        this.basisSurface = basisSurface;
    }

    public IfcParameterValue getPointParameterU() {
        return pointParameterU;
    }

    public void setPointParameterU(IfcParameterValue pointParameterU) {
        this.pointParameterU = pointParameterU;
    }

    public IfcParameterValue getPointParameterV() {
        return pointParameterV;
    }

    public void setPointParameterV(IfcParameterValue pointParameterV) {
        this.pointParameterV = pointParameterV;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
