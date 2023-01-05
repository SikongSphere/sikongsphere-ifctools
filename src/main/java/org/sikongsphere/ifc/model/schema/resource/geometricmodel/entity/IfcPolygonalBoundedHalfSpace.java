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
package org.sikongsphere.ifc.model.schema.resource.geometricmodel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcBoundedCurve;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcSurface;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcBoolean;

/**
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPolygonalBoundedHalfSpace extends IfcHalfSpaceSolid {

    private IfcAxis2Placement3D position;
    private IfcBoundedCurve polygonalBoundary;


    @IfcParserConstructor
    public IfcPolygonalBoundedHalfSpace(IfcSurface baseSurface, IfcBoolean agreementFlag, IfcAxis2Placement3D position, IfcBoundedCurve polygonalBoundary) {
        super(baseSurface, agreementFlag);
        this.position = position;
        this.polygonalBoundary = polygonalBoundary;
    }

    public IfcAxis2Placement3D getPosition() {
        return position;
    }

    public void setPosition(IfcAxis2Placement3D position) {
        this.position = position;
    }

    public IfcBoundedCurve getPolygonalBoundary() {
        return polygonalBoundary;
    }

    public void setPolygonalBoundary(IfcBoundedCurve polygonalBoundary) {
        this.polygonalBoundary = polygonalBoundary;
    }
}
