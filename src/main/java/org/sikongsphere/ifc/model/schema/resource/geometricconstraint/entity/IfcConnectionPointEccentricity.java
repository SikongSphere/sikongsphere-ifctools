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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;

/**
 * The IfcConnectionPointEccentricity is used to describe the geometric constraints that facilitate the physical
 * connection of two objects at a point or vertex point with associated point coordinates.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcConnectionPointEccentricity extends IfcConnectionPointGeometry {
    @IfcOptionField
    private IfcLengthMeasure eccentricityInX;
    @IfcOptionField
    private IfcLengthMeasure eccentricityInY;
    @IfcOptionField
    private IfcLengthMeasure eccentricityInZ;

    @IfcParserConstructor
    public IfcConnectionPointEccentricity(
        IfcPointOrVertexPoint pointOnRelatingElement,
        IfcPointOrVertexPoint pointOnRelatedElement,
        IfcLengthMeasure eccentricityInX,
        IfcLengthMeasure eccentricityInY,
        IfcLengthMeasure eccentricityInZ
    ) {
        super(pointOnRelatingElement, pointOnRelatedElement);
        this.eccentricityInX = eccentricityInX;
        this.eccentricityInY = eccentricityInY;
        this.eccentricityInZ = eccentricityInZ;
    }

    public IfcLengthMeasure getEccentricityInX() {
        return eccentricityInX;
    }

    public void setEccentricityInX(IfcLengthMeasure eccentricityInX) {
        this.eccentricityInX = eccentricityInX;
    }

    public IfcLengthMeasure getEccentricityInY() {
        return eccentricityInY;
    }

    public void setEccentricityInY(IfcLengthMeasure eccentricityInY) {
        this.eccentricityInY = eccentricityInY;
    }

    public IfcLengthMeasure getEccentricityInZ() {
        return eccentricityInZ;
    }

    public void setEccentricityInZ(IfcLengthMeasure eccentricityInZ) {
        this.eccentricityInZ = eccentricityInZ;
    }
}
