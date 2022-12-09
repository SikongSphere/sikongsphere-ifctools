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
public class IfcCraneRailAShapeProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure overalHeight;
    private IfcPositiveLengthMeasure BaseWidth2;
    @IfcOptionField
    private IfcPositiveLengthMeasure Radius;
    private IfcPositiveLengthMeasure HeadDepth2;
    private IfcPositiveLengthMeasure HeadDepth3;
    private IfcPositiveLengthMeasure WebThickness;
    private IfcPositiveLengthMeasure BaseWidth4;
    private IfcPositiveLengthMeasure BaseDepth1;
    private IfcPositiveLengthMeasure BaseDepth2;
    private IfcPositiveLengthMeasure BaseDepth3;
    @IfcOptionField
    private IfcPositiveLengthMeasure CentreOfGravityInY;

    @IfcParserConstructor
    public IfcCraneRailAShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure overalHeight,
        IfcPositiveLengthMeasure baseWidth2,
        IfcPositiveLengthMeasure radius,
        IfcPositiveLengthMeasure headDepth2,
        IfcPositiveLengthMeasure headDepth3,
        IfcPositiveLengthMeasure webThickness,
        IfcPositiveLengthMeasure baseWidth4,
        IfcPositiveLengthMeasure baseDepth1,
        IfcPositiveLengthMeasure baseDepth2,
        IfcPositiveLengthMeasure baseDepth3,
        IfcPositiveLengthMeasure centreOfGravityInY
    ) {
        super(profileType, profileName, position);
        this.overalHeight = overalHeight;
        BaseWidth2 = baseWidth2;
        Radius = radius;
        HeadDepth2 = headDepth2;
        HeadDepth3 = headDepth3;
        WebThickness = webThickness;
        BaseWidth4 = baseWidth4;
        BaseDepth1 = baseDepth1;
        BaseDepth2 = baseDepth2;
        BaseDepth3 = baseDepth3;
        CentreOfGravityInY = centreOfGravityInY;
    }

    public IfcPositiveLengthMeasure getOveralHeight() {
        return overalHeight;
    }

    public void setOveralHeight(IfcPositiveLengthMeasure overalHeight) {
        this.overalHeight = overalHeight;
    }

    public IfcPositiveLengthMeasure getBaseWidth2() {
        return BaseWidth2;
    }

    public void setBaseWidth2(IfcPositiveLengthMeasure baseWidth2) {
        BaseWidth2 = baseWidth2;
    }

    public IfcPositiveLengthMeasure getRadius() {
        return Radius;
    }

    public void setRadius(IfcPositiveLengthMeasure radius) {
        Radius = radius;
    }

    public IfcPositiveLengthMeasure getHeadDepth2() {
        return HeadDepth2;
    }

    public void setHeadDepth2(IfcPositiveLengthMeasure headDepth2) {
        HeadDepth2 = headDepth2;
    }

    public IfcPositiveLengthMeasure getHeadDepth3() {
        return HeadDepth3;
    }

    public void setHeadDepth3(IfcPositiveLengthMeasure headDepth3) {
        HeadDepth3 = headDepth3;
    }

    public IfcPositiveLengthMeasure getWebThickness() {
        return WebThickness;
    }

    public void setWebThickness(IfcPositiveLengthMeasure webThickness) {
        WebThickness = webThickness;
    }

    public IfcPositiveLengthMeasure getBaseWidth4() {
        return BaseWidth4;
    }

    public void setBaseWidth4(IfcPositiveLengthMeasure baseWidth4) {
        BaseWidth4 = baseWidth4;
    }

    public IfcPositiveLengthMeasure getBaseDepth1() {
        return BaseDepth1;
    }

    public void setBaseDepth1(IfcPositiveLengthMeasure baseDepth1) {
        BaseDepth1 = baseDepth1;
    }

    public IfcPositiveLengthMeasure getBaseDepth2() {
        return BaseDepth2;
    }

    public void setBaseDepth2(IfcPositiveLengthMeasure baseDepth2) {
        BaseDepth2 = baseDepth2;
    }

    public IfcPositiveLengthMeasure getBaseDepth3() {
        return BaseDepth3;
    }

    public void setBaseDepth3(IfcPositiveLengthMeasure baseDepth3) {
        BaseDepth3 = baseDepth3;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInY() {
        return CentreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcPositiveLengthMeasure centreOfGravityInY) {
        CentreOfGravityInY = centreOfGravityInY;
    }
}
