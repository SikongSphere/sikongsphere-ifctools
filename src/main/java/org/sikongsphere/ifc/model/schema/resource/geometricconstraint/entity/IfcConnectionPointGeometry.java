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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.selectType.IfcPointOrVertexPoint;

/**
 * The IfcConnectionPointGeometry is used to describe the geometric constraints that facilitate the physical connection
 * of two objects at a point (here IfcCartesianPoint) or at an vertex with point coordinates associated.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcConnectionPointGeometry extends IfcConnectionGeometry {
    private IfcPointOrVertexPoint pointOnRelatingElement;
    @IfcOptionField
    private IfcPointOrVertexPoint pointOnRelatedElement;

    @IfcParserConstructor
    public IfcConnectionPointGeometry(
        IfcPointOrVertexPoint pointOnRelatingElement,
        IfcPointOrVertexPoint pointOnRelatedElement
    ) {
        this.pointOnRelatingElement = pointOnRelatingElement;
        this.pointOnRelatedElement = pointOnRelatedElement;
    }

    public IfcPointOrVertexPoint getPointOnRelatingElement() {
        return pointOnRelatingElement;
    }

    public void setPointOnRelatingElement(IfcPointOrVertexPoint pointOnRelatingElement) {
        this.pointOnRelatingElement = pointOnRelatingElement;
    }

    public IfcPointOrVertexPoint getPointOnRelatedElement() {
        return pointOnRelatedElement;
    }

    public void setPointOnRelatedElement(IfcPointOrVertexPoint pointOnRelatedElement) {
        this.pointOnRelatedElement = pointOnRelatedElement;
    }
}
