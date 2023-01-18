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
 * A point on curve is a point which lies on a curve.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPointOnCurve extends IfcPoint {
    private IfcCurve basisCurve;
    private IfcParameterValue pointParameter;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcPointOnCurve(IfcCurve basisCurve, IfcParameterValue pointParameter) {
        this.basisCurve = basisCurve;
        this.pointParameter = pointParameter;
    }

    public IfcCurve getBasisCurve() {
        return basisCurve;
    }

    public void setBasisCurve(IfcCurve basisCurve) {
        this.basisCurve = basisCurve;
    }

    public IfcParameterValue getPointParameter() {
        return pointParameter;
    }

    public void setPointParameter(IfcParameterValue pointParameter) {
        this.pointParameter = pointParameter;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
