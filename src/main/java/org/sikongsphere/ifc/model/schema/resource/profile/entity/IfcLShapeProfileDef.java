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
package org.sikongsphere.ifc.model.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcLShapeProfileDef defines a section profile that provides the defining parameters of an L-shaped section
 * (equilateral L profiles are also covered by this entity) to be used by the swept area solid. Its parameters and
 * orientation relative to the position coordinate system are according to the following illustration. The shorter leg
 * has the same direction as the positive x-axis, the longer or equal leg the same as the positive y-axis. The centre
 * of the position coordinate system is in the profiles centre of the gravity bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLShapeProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure depth;
    @IfcOptionField
    private IfcPositiveLengthMeasure width;
    private IfcPositiveLengthMeasure thickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure filletRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure edgeRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure legSlope;
    @IfcOptionField
    private IfcPositiveLengthMeasure centreOfGravityInX;
    @IfcOptionField
    private IfcPositiveLengthMeasure centreOfGravityInY;

    @IfcParserConstructor
    public IfcLShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure depth,
        IfcPositiveLengthMeasure width,
        IfcPositiveLengthMeasure thickness,
        IfcPositiveLengthMeasure filletRadius,
        IfcPositiveLengthMeasure edgeRadius,
        IfcPositiveLengthMeasure legSlope,
        IfcPositiveLengthMeasure centreOfGravityInX,
        IfcPositiveLengthMeasure centreOfGravityInY
    ) {
        super(profileType, profileName, position);
        this.depth = depth;
        this.width = width;
        this.thickness = thickness;
        this.filletRadius = filletRadius;
        this.edgeRadius = edgeRadius;
        this.legSlope = legSlope;
        this.centreOfGravityInX = centreOfGravityInX;
        this.centreOfGravityInY = centreOfGravityInY;
    }

    public IfcPositiveLengthMeasure getDepth() {
        return depth;
    }

    public void setDepth(IfcPositiveLengthMeasure depth) {
        this.depth = depth;
    }

    public IfcPositiveLengthMeasure getWidth() {
        return width;
    }

    public void setWidth(IfcPositiveLengthMeasure width) {
        this.width = width;
    }

    public IfcPositiveLengthMeasure getThickness() {
        return thickness;
    }

    public void setThickness(IfcPositiveLengthMeasure thickness) {
        this.thickness = thickness;
    }

    public IfcPositiveLengthMeasure getFilletRadius() {
        return filletRadius;
    }

    public void setFilletRadius(IfcPositiveLengthMeasure filletRadius) {
        this.filletRadius = filletRadius;
    }

    public IfcPositiveLengthMeasure getEdgeRadius() {
        return edgeRadius;
    }

    public void setEdgeRadius(IfcPositiveLengthMeasure edgeRadius) {
        this.edgeRadius = edgeRadius;
    }

    public IfcPositiveLengthMeasure getLegSlope() {
        return legSlope;
    }

    public void setLegSlope(IfcPositiveLengthMeasure legSlope) {
        this.legSlope = legSlope;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInX() {
        return centreOfGravityInX;
    }

    public void setCentreOfGravityInX(IfcPositiveLengthMeasure centreOfGravityInX) {
        this.centreOfGravityInX = centreOfGravityInX;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInY() {
        return centreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcPositiveLengthMeasure centreOfGravityInY) {
        this.centreOfGravityInY = centreOfGravityInY;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
