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
import org.sikongsphere.ifc.model.schema.resource.geometry.enumeration.IfcBSplineCurveForm;

/**
 * A B-spline curve is a piecewise parametric polynominal or rational curve described in terms of control points and
 * basis functions.
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcBSplineCurve extends IfcBoundedCurve {
    private INTEGER degree;
    private LIST<IfcCartesianPoint> controlPointsList;
    private IfcBSplineCurveForm curveForm;
    private LOGICAL closedCurve;
    private LOGICAL selfIntersect;
    @IfcDeriveParameter
    private IfcCartesianPoint[] controlPoints;
    @IfcDeriveParameter
    private INTEGER upperIndexOnControlPoints;

    @IfcParserConstructor
    public IfcBSplineCurve(
        INTEGER degree,
        LIST<IfcCartesianPoint> controlPointsList,
        IfcBSplineCurveForm curveForm,
        LOGICAL closedCurve,
        LOGICAL selfIntersect
    ) {
        this.degree = degree;
        this.controlPointsList = controlPointsList;
        this.curveForm = curveForm;
        this.closedCurve = closedCurve;
        this.selfIntersect = selfIntersect;
    }

    public INTEGER getDegree() {
        return degree;
    }

    public void setDegree(INTEGER degree) {
        this.degree = degree;
    }

    public LIST<IfcCartesianPoint> getControlPointsList() {
        return controlPointsList;
    }

    public void setControlPointsList(LIST<IfcCartesianPoint> controlPointsList) {
        this.controlPointsList = controlPointsList;
    }

    public IfcBSplineCurveForm getCurveForm() {
        return curveForm;
    }

    public void setCurveForm(IfcBSplineCurveForm curveForm) {
        this.curveForm = curveForm;
    }

    public LOGICAL getClosedCurve() {
        return closedCurve;
    }

    public void setClosedCurve(LOGICAL closedCurve) {
        this.closedCurve = closedCurve;
    }

    public LOGICAL getSelfIntersect() {
        return selfIntersect;
    }

    public void setSelfIntersect(LOGICAL selfIntersect) {
        this.selfIntersect = selfIntersect;
    }

    public IfcCartesianPoint[] getControlPoints() {
        return controlPoints;
    }

    public void setControlPoints(IfcCartesianPoint[] controlPoints) {
        this.controlPoints = controlPoints;
    }

    public INTEGER getUpperIndexOnControlPoints() {
        return upperIndexOnControlPoints;
    }

    public void setUpperIndexOnControlPoints(INTEGER upperIndexOnControlPoints) {
        this.upperIndexOnControlPoints = upperIndexOnControlPoints;
    }
}
