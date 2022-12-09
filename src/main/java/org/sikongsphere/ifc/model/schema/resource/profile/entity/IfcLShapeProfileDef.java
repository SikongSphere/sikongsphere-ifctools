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
    private IfcPositiveLengthMeasure Width;
    private IfcPositiveLengthMeasure Thickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure FilletRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure EdgeRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure LegSlope;
    @IfcOptionField
    private IfcPositiveLengthMeasure CentreOfGravityInX;
    @IfcOptionField
    private IfcPositiveLengthMeasure CentreOfGravityInY;

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
        Width = width;
        Thickness = thickness;
        FilletRadius = filletRadius;
        EdgeRadius = edgeRadius;
        LegSlope = legSlope;
        CentreOfGravityInX = centreOfGravityInX;
        CentreOfGravityInY = centreOfGravityInY;
    }

    public IfcPositiveLengthMeasure getDepth() {
        return depth;
    }

    public void setDepth(IfcPositiveLengthMeasure depth) {
        this.depth = depth;
    }

    public IfcPositiveLengthMeasure getWidth() {
        return Width;
    }

    public void setWidth(IfcPositiveLengthMeasure width) {
        Width = width;
    }

    public IfcPositiveLengthMeasure getThickness() {
        return Thickness;
    }

    public void setThickness(IfcPositiveLengthMeasure thickness) {
        Thickness = thickness;
    }

    public IfcPositiveLengthMeasure getFilletRadius() {
        return FilletRadius;
    }

    public void setFilletRadius(IfcPositiveLengthMeasure filletRadius) {
        FilletRadius = filletRadius;
    }

    public IfcPositiveLengthMeasure getEdgeRadius() {
        return EdgeRadius;
    }

    public void setEdgeRadius(IfcPositiveLengthMeasure edgeRadius) {
        EdgeRadius = edgeRadius;
    }

    public IfcPositiveLengthMeasure getLegSlope() {
        return LegSlope;
    }

    public void setLegSlope(IfcPositiveLengthMeasure legSlope) {
        LegSlope = legSlope;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInX() {
        return CentreOfGravityInX;
    }

    public void setCentreOfGravityInX(IfcPositiveLengthMeasure centreOfGravityInX) {
        CentreOfGravityInX = centreOfGravityInX;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInY() {
        return CentreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcPositiveLengthMeasure centreOfGravityInY) {
        CentreOfGravityInY = centreOfGravityInY;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
