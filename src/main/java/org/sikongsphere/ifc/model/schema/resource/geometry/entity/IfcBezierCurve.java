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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.schema.resource.geometry.enumeration.IfcBSplineCurveForm;

/**
 * This is a special type of curve which can be represented as a type of B-spline curve in which the knots are evenly
 * spaced and have high multiplicities.
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBezierCurve extends IfcBSplineCurve {
    @IfcParserConstructor
    public IfcBezierCurve(
        INTEGER degree,
        LIST<IfcCartesianPoint> controlPointsList,
        IfcBSplineCurveForm curveForm,
        LOGICAL closedCurve,
        LOGICAL selfIntersect
    ) {
        super(degree, controlPointsList, curveForm, closedCurve, selfIntersect);
    }
}
