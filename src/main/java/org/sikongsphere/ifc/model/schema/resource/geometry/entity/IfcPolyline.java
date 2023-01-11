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
import org.sikongsphere.ifc.model.datatype.LIST;

/**
 * An IfcPolyline is a bounded curve of n -1 linear segments, defined by a list of n points, P1, P2 ... Pn.
 *
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

}
