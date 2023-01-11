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
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcParameterValue;

/**
 * The trimmed surface is a simple bounded surface in which the boundaries are the constant parametric
 * lines u1 = u1, u2 = u2, v1 = v1 and v2 = v2.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRectangularTrimmedSurface extends IfcBoundedSurface {
    private IfcSurface basisSurface;
    private IfcParameterValue u1;
    private IfcParameterValue v1;
    private IfcParameterValue u2;
    private IfcParameterValue v2;
    private BOOLEAN usense;
    private BOOLEAN vsense;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcRectangularTrimmedSurface(
        IfcSurface basisSurface,
        IfcParameterValue u1,
        IfcParameterValue v1,
        IfcParameterValue u2,
        IfcParameterValue v2,
        BOOLEAN usense,
        BOOLEAN vsense
    ) {
        this.basisSurface = basisSurface;
        this.u1 = u1;
        this.v1 = v1;
        this.u2 = u2;
        this.v2 = v2;
        this.usense = usense;
        this.vsense = vsense;
    }

    public IfcSurface getBasisSurface() {
        return basisSurface;
    }

    public void setBasisSurface(IfcSurface basisSurface) {
        this.basisSurface = basisSurface;
    }

    public IfcParameterValue getU1() {
        return u1;
    }

    public void setU1(IfcParameterValue u1) {
        this.u1 = u1;
    }

    public IfcParameterValue getV1() {
        return v1;
    }

    public void setV1(IfcParameterValue v1) {
        this.v1 = v1;
    }

    public IfcParameterValue getU2() {
        return u2;
    }

    public void setU2(IfcParameterValue u2) {
        this.u2 = u2;
    }

    public IfcParameterValue getV2() {
        return v2;
    }

    public void setV2(IfcParameterValue v2) {
        this.v2 = v2;
    }

    public BOOLEAN getUsense() {
        return usense;
    }

    public void setUsense(BOOLEAN usense) {
        this.usense = usense;
    }

    public BOOLEAN getVsense() {
        return vsense;
    }

    public void setVsense(BOOLEAN vsense) {
        this.vsense = vsense;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
