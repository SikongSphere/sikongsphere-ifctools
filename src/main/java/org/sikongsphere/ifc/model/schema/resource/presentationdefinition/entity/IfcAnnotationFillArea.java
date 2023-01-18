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
package org.sikongsphere.ifc.model.schema.resource.presentationdefinition.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;

/**
 * An annotation fill area is a set of curves that may be filled with hatching, colour or tiling.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:03
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAnnotationFillArea extends IfcGeometricRepresentationItem {
    private IfcCurve outerBoundary;
    @IfcOptionField
    private SET<IfcCurve> innerBoundaries;

    @IfcParserConstructor
    public IfcAnnotationFillArea(IfcCurve outerBoundary, SET<IfcCurve> innerBoundaries) {
        this.outerBoundary = outerBoundary;
        this.innerBoundaries = innerBoundaries;
    }

    public IfcCurve getOuterBoundary() {
        return outerBoundary;
    }

    public void setOuterBoundary(IfcCurve outerBoundary) {
        this.outerBoundary = outerBoundary;
    }

    public SET<IfcCurve> getInnerBoundaries() {
        return innerBoundaries;
    }

    public void setInnerBoundaries(SET<IfcCurve> innerBoundaries) {
        this.innerBoundaries = innerBoundaries;
    }
}
