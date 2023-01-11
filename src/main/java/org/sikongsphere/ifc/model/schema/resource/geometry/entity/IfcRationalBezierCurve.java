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
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.datatype.REAL;
import org.sikongsphere.ifc.model.schema.resource.geometry.enumeration.IfcBSplineCurveForm;

/**
 * A rational Bezier curve is a B-spline curve described in terms of control points and basic functions.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRationalBezierCurve extends IfcBezierCurve {
    private LIST<REAL> weightsData;
    @IfcDeriveParameter
    private REAL[] weights;

    @IfcParserConstructor
    public IfcRationalBezierCurve(
        INTEGER degree,
        LIST<IfcCartesianPoint> controlPointsList,
        IfcBSplineCurveForm curveForm,
        LOGICAL closedCurve,
        LOGICAL selfIntersect,
        LIST<REAL> weightsData
    ) {
        super(degree, controlPointsList, curveForm, closedCurve, selfIntersect);
        this.weightsData = weightsData;
    }

    public LIST<REAL> getWeightsData() {
        return weightsData;
    }

    public void setWeightsData(LIST<REAL> weightsData) {
        this.weightsData = weightsData;
    }

    public REAL[] getWeights() {
        return weights;
    }

    public void setWeights(REAL[] weights) {
        this.weights = weights;
    }
}
