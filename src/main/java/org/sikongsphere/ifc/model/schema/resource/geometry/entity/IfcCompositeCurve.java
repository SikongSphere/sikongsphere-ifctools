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

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCompositeCurve extends IfcBoundedCurve {
    private LIST<IfcCompositeCurveSegment> segments;
    private LOGICAL selfIntersect;
    @IfcDeriveParameter
    private INTEGER nSegments;
    @IfcDeriveParameter
    private LOGICAL closedCurve;

    @IfcParserConstructor
    public IfcCompositeCurve(LIST<IfcCompositeCurveSegment> segments, LOGICAL selfIntersect) {
        this.segments = segments;
        this.selfIntersect = selfIntersect;
    }

    public LIST<IfcCompositeCurveSegment> getSegments() {
        return segments;
    }

    public void setSegments(LIST<IfcCompositeCurveSegment> segments) {
        this.segments = segments;
    }

    public LOGICAL getSelfIntersect() {
        return selfIntersect;
    }

    public void setSelfIntersect(LOGICAL selfIntersect) {
        this.selfIntersect = selfIntersect;
    }

    public INTEGER getnSegments() {
        return nSegments;
    }

    public void setnSegments(INTEGER nSegments) {
        this.nSegments = nSegments;
    }

    public LOGICAL getClosedCurve() {
        return closedCurve;
    }

    public void setClosedCurve(LOGICAL closedCurve) {
        this.closedCurve = closedCurve;
    }
}
