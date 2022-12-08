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
package org.sikongsphere.ifc.newModel.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcCShapeProfileDef defines a section profile that provides the defining parameters of a C-shaped section to be
 * used by the swept area solid. This section is typically produced by cold forming steel. Its parameters and
 * orientation relative to the position coordinate system are according to the following illustration.The centre of the
 * position coordinate system is in the profiles centre of the gravity bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCShapeProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure depth;
    private IfcPositiveLengthMeasure width;
    private IfcPositiveLengthMeasure wallThickness;
    private IfcPositiveLengthMeasure girth;
    @IfcOptionField
    private IfcPositiveLengthMeasure internalFilletRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure centreOfGravityInX;

    @IfcParserConstructor
    public IfcCShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure depth,
        IfcPositiveLengthMeasure width,
        IfcPositiveLengthMeasure wallThickness,
        IfcPositiveLengthMeasure girth,
        IfcPositiveLengthMeasure internalFilletRadius,
        IfcPositiveLengthMeasure centreOfGravityInX
    ) {
        super(profileType, profileName, position);
        this.depth = depth;
        this.width = width;
        this.wallThickness = wallThickness;
        this.girth = girth;
        this.internalFilletRadius = internalFilletRadius;
        this.centreOfGravityInX = centreOfGravityInX;
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

    public IfcPositiveLengthMeasure getWallThickness() {
        return wallThickness;
    }

    public void setWallThickness(IfcPositiveLengthMeasure wallThickness) {
        this.wallThickness = wallThickness;
    }

    public IfcPositiveLengthMeasure getGirth() {
        return girth;
    }

    public void setGirth(IfcPositiveLengthMeasure girth) {
        this.girth = girth;
    }

    public IfcPositiveLengthMeasure getInternalFilletRadius() {
        return internalFilletRadius;
    }

    public void setInternalFilletRadius(IfcPositiveLengthMeasure internalFilletRadius) {
        this.internalFilletRadius = internalFilletRadius;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInX() {
        return centreOfGravityInX;
    }

    public void setCentreOfGravityInX(IfcPositiveLengthMeasure centreOfGravityInX) {
        this.centreOfGravityInX = centreOfGravityInX;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
