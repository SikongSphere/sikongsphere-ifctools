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
 * The IfcTShapeProfileDef defines a section profile that provides the defining parameters of a T-shaped section to be
 * used by the swept area solid. Its parameters and orientation relative to the position coordinate system are according
 * to the following illustration. The centre of the position coordinate system is in the profiles centre of the gravity
 * bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTShapeProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure depth;
    private IfcPositiveLengthMeasure flangeWidth;
    private IfcPositiveLengthMeasure webThickness;
    private IfcPositiveLengthMeasure flangeThickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure filletRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure flangeEdgeRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure webEdgeRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure webSlope;
    @IfcOptionField
    private IfcPositiveLengthMeasure flangeSlope;
    @IfcOptionField
    private IfcPositiveLengthMeasure centreOfGravityInY;

    @IfcParserConstructor
    public IfcTShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure depth,
        IfcPositiveLengthMeasure flangeWidth,
        IfcPositiveLengthMeasure webThickness,
        IfcPositiveLengthMeasure flangeThickness,
        IfcPositiveLengthMeasure filletRadius,
        IfcPositiveLengthMeasure flangeEdgeRadius,
        IfcPositiveLengthMeasure webEdgeRadius,
        IfcPositiveLengthMeasure webSlope,
        IfcPositiveLengthMeasure flangeSlope,
        IfcPositiveLengthMeasure centreOfGravityInY
    ) {
        super(profileType, profileName, position);
        this.depth = depth;
        this.flangeWidth = flangeWidth;
        this.webThickness = webThickness;
        this.flangeThickness = flangeThickness;
        this.filletRadius = filletRadius;
        this.flangeEdgeRadius = flangeEdgeRadius;
        this.webEdgeRadius = webEdgeRadius;
        this.webSlope = webSlope;
        this.flangeSlope = flangeSlope;
        this.centreOfGravityInY = centreOfGravityInY;
    }

    public IfcPositiveLengthMeasure getDepth() {
        return depth;
    }

    public void setDepth(IfcPositiveLengthMeasure depth) {
        this.depth = depth;
    }

    public IfcPositiveLengthMeasure getFlangeWidth() {
        return flangeWidth;
    }

    public void setFlangeWidth(IfcPositiveLengthMeasure flangeWidth) {
        this.flangeWidth = flangeWidth;
    }

    public IfcPositiveLengthMeasure getWebThickness() {
        return webThickness;
    }

    public void setWebThickness(IfcPositiveLengthMeasure webThickness) {
        this.webThickness = webThickness;
    }

    public IfcPositiveLengthMeasure getFlangeThickness() {
        return flangeThickness;
    }

    public void setFlangeThickness(IfcPositiveLengthMeasure flangeThickness) {
        this.flangeThickness = flangeThickness;
    }

    public IfcPositiveLengthMeasure getFilletRadius() {
        return filletRadius;
    }

    public void setFilletRadius(IfcPositiveLengthMeasure filletRadius) {
        this.filletRadius = filletRadius;
    }

    public IfcPositiveLengthMeasure getFlangeEdgeRadius() {
        return flangeEdgeRadius;
    }

    public void setFlangeEdgeRadius(IfcPositiveLengthMeasure flangeEdgeRadius) {
        this.flangeEdgeRadius = flangeEdgeRadius;
    }

    public IfcPositiveLengthMeasure getWebEdgeRadius() {
        return webEdgeRadius;
    }

    public void setWebEdgeRadius(IfcPositiveLengthMeasure webEdgeRadius) {
        this.webEdgeRadius = webEdgeRadius;
    }

    public IfcPositiveLengthMeasure getWebSlope() {
        return webSlope;
    }

    public void setWebSlope(IfcPositiveLengthMeasure webSlope) {
        this.webSlope = webSlope;
    }

    public IfcPositiveLengthMeasure getFlangeSlope() {
        return flangeSlope;
    }

    public void setFlangeSlope(IfcPositiveLengthMeasure flangeSlope) {
        this.flangeSlope = flangeSlope;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInY() {
        return centreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcPositiveLengthMeasure centreOfGravityInY) {
        this.centreOfGravityInY = centreOfGravityInY;
    }

    @Override
    public boolean illegal() {
        return (flangeThickness.value < depth.value) && (webThickness.value < flangeWidth.value);
    }
}
