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
package org.sikongsphere.ifc.newModel.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;

import java.util.List;
import java.util.Locale;

/**
 * @author Yiwei
 * @date 2022/10/23
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPolyline extends IfcBoundedCurve {
    private LIST<IfcCartesianPoint> points;

    public IfcPolyline() {}

    @IfcParserConstructor
    public IfcPolyline(LIST<IfcCartesianPoint> points) {
        this.points = points;
    }

    public LIST<IfcCartesianPoint> getPoints() {
        return points;
    }

    public void setPoints(LIST<IfcCartesianPoint> points) {
        this.points = points;
    }

    @Override
    public String toIfc() {

        String format = String.format(
            "#%s=%s(%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            getPoints()
        );

        return format;
    }
}
