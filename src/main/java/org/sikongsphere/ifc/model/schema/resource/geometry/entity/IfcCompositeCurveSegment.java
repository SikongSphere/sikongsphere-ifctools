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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.enumeration.IfcTransitionCode;

/**
 *  A composite curve segment (IfcCompositeCurveSegment) is a bounded curve together with transition information
 *  which is used to construct a composite curve (IfcCompositeCurve).
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCompositeCurveSegment extends IfcGeometricRepresentationItem {
    private IfcTransitionCode transition;
    private BOOLEAN sameSense;
    private IfcCurve parentCurve;
    @IfcDeriveParameter
    private IfcDimensionCount dim;
    @IfcInverseParameter
    private SET<IfcCompositeCurve> usingCurve;

    @IfcParserConstructor
    public IfcCompositeCurveSegment(
        IfcTransitionCode transition,
        BOOLEAN sameSense,
        IfcCurve parentCurve
    ) {
        this.transition = transition;
        this.sameSense = sameSense;
        this.parentCurve = parentCurve;
    }

    public IfcTransitionCode getTransition() {
        return transition;
    }

    public void setTransition(IfcTransitionCode transition) {
        this.transition = transition;
    }

    public BOOLEAN getSameSense() {
        return sameSense;
    }

    public void setSameSense(BOOLEAN sameSense) {
        this.sameSense = sameSense;
    }

    public IfcCurve getParentCurve() {
        return parentCurve;
    }

    public void setParentCurve(IfcCurve parentCurve) {
        this.parentCurve = parentCurve;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }

    public SET<IfcCompositeCurve> getUsingCurve() {
        return usingCurve;
    }

    public void setUsingCurve(SET<IfcCompositeCurve> usingCurve) {
        this.usingCurve = usingCurve;
    }
}
