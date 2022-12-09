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
 * The IfcCraneRailFShapeProfileDef defines a section profile that provides the defining parameters of a crane rail to
 * be used by the swept surface geometry or the swept area solid. Its parameters and orientation relative to the
 * position coordinate system are according to the following illustration. The centre of the position coordinate system
 * is in the profiles centre of the gravity bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCraneRailFShapeProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure overalHeight;
    private IfcPositiveLengthMeasure headWidth;
    @IfcOptionField
    private IfcPositiveLengthMeasure radius;
    private IfcPositiveLengthMeasure headDepth2;
    private IfcPositiveLengthMeasure headDepth3;
    private IfcPositiveLengthMeasure webThickness;
    private IfcPositiveLengthMeasure baseDepth1;
    private IfcPositiveLengthMeasure baseDepth2;
    @IfcOptionField
    private IfcPositiveLengthMeasure centreOfGravityInY;

    @IfcParserConstructor
    public IfcCraneRailFShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure overalHeight,
        IfcPositiveLengthMeasure headWidth,
        IfcPositiveLengthMeasure radius,
        IfcPositiveLengthMeasure headDepth2,
        IfcPositiveLengthMeasure headDepth3,
        IfcPositiveLengthMeasure webThickness,
        IfcPositiveLengthMeasure baseDepth1,
        IfcPositiveLengthMeasure baseDepth2,
        IfcPositiveLengthMeasure centreOfGravityInY
    ) {
        super(profileType, profileName, position);
        this.overalHeight = overalHeight;
        this.headWidth = headWidth;
        this.radius = radius;
        this.headDepth2 = headDepth2;
        this.headDepth3 = headDepth3;
        this.webThickness = webThickness;
        this.baseDepth1 = baseDepth1;
        this.baseDepth2 = baseDepth2;
        this.centreOfGravityInY = centreOfGravityInY;
    }

    public IfcPositiveLengthMeasure getOveralHeight() {
        return overalHeight;
    }

    public void setOveralHeight(IfcPositiveLengthMeasure overalHeight) {
        this.overalHeight = overalHeight;
    }

    public IfcPositiveLengthMeasure getHeadWidth() {
        return headWidth;
    }

    public void setHeadWidth(IfcPositiveLengthMeasure headWidth) {
        this.headWidth = headWidth;
    }

    public IfcPositiveLengthMeasure getRadius() {
        return radius;
    }

    public void setRadius(IfcPositiveLengthMeasure radius) {
        this.radius = radius;
    }

    public IfcPositiveLengthMeasure getHeadDepth2() {
        return headDepth2;
    }

    public void setHeadDepth2(IfcPositiveLengthMeasure headDepth2) {
        this.headDepth2 = headDepth2;
    }

    public IfcPositiveLengthMeasure getHeadDepth3() {
        return headDepth3;
    }

    public void setHeadDepth3(IfcPositiveLengthMeasure headDepth3) {
        this.headDepth3 = headDepth3;
    }

    public IfcPositiveLengthMeasure getWebThickness() {
        return webThickness;
    }

    public void setWebThickness(IfcPositiveLengthMeasure webThickness) {
        this.webThickness = webThickness;
    }

    public IfcPositiveLengthMeasure getBaseDepth1() {
        return baseDepth1;
    }

    public void setBaseDepth1(IfcPositiveLengthMeasure baseDepth1) {
        this.baseDepth1 = baseDepth1;
    }

    public IfcPositiveLengthMeasure getBaseDepth2() {
        return baseDepth2;
    }

    public void setBaseDepth2(IfcPositiveLengthMeasure baseDepth2) {
        this.baseDepth2 = baseDepth2;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInY() {
        return centreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcPositiveLengthMeasure centreOfGravityInY) {
        this.centreOfGravityInY = centreOfGravityInY;
    }
}
