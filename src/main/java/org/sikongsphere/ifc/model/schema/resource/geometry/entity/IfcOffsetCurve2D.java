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
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * An offset curve 2d (IfcOffsetCurve2d) is a curve at a constant distance from a basis curve in two-dimensional space.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOffsetCurve2D extends IfcCurve {
    private IfcCurve basisCurve;
    private IfcLengthMeasure distance;
    private LOGICAL selfIntersect;

    @IfcParserConstructor
    public IfcOffsetCurve2D(IfcCurve basisCurve, IfcLengthMeasure distance, LOGICAL selfIntersect) {
        this.basisCurve = basisCurve;
        this.distance = distance;
        this.selfIntersect = selfIntersect;
    }

    public IfcCurve getBasisCurve() {
        return basisCurve;
    }

    public void setBasisCurve(IfcCurve basisCurve) {
        this.basisCurve = basisCurve;
    }

    public IfcLengthMeasure getDistance() {
        return distance;
    }

    public void setDistance(IfcLengthMeasure distance) {
        this.distance = distance;
    }

    public LOGICAL getSelfIntersect() {
        return selfIntersect;
    }

    public void setSelfIntersect(LOGICAL selfIntersect) {
        this.selfIntersect = selfIntersect;
    }
}
