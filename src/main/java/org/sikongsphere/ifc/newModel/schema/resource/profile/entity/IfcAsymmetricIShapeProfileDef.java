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
 * The IfcAsymmetricIShapeProfileDef defines a section profile that provides the defining parameters of an asymmetric
 * I-shaped section to be used by the swept area solid. The bottom flange is always wider than the top flange. Its
 * parameters and orientation relative to the position coordinate system are according to the following illustration.
 * The centre of the position coordinate system is in the profiles centre of the gravity bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAsymmetricIShapeProfileDef extends IfcIShapeProfileDef {
    private IfcPositiveLengthMeasure topFlangeWidth;
    @IfcOptionField
    private IfcPositiveLengthMeasure topFlangeThickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure topFlangeFilletRadius;
    @IfcOptionField
    private IfcPositiveLengthMeasure centreOfGravityInY;

    @IfcParserConstructor
    public IfcAsymmetricIShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure overallWidth,
        IfcPositiveLengthMeasure overallDepth,
        IfcPositiveLengthMeasure webThickness,
        IfcPositiveLengthMeasure flangeThickness,
        IfcPositiveLengthMeasure filletRadius,
        IfcPositiveLengthMeasure topFlangeWidth,
        IfcPositiveLengthMeasure topFlangeThickness,
        IfcPositiveLengthMeasure topFlangeFilletRadius,
        IfcPositiveLengthMeasure centreOfGravityInY
    ) {
        super(
            profileType,
            profileName,
            position,
            overallWidth,
            overallDepth,
            webThickness,
            flangeThickness,
            filletRadius
        );
        this.topFlangeWidth = topFlangeWidth;
        this.topFlangeThickness = topFlangeThickness;
        this.topFlangeFilletRadius = topFlangeFilletRadius;
        this.centreOfGravityInY = centreOfGravityInY;
    }

    public IfcPositiveLengthMeasure getTopFlangeWidth() {
        return topFlangeWidth;
    }

    public void setTopFlangeWidth(IfcPositiveLengthMeasure topFlangeWidth) {
        this.topFlangeWidth = topFlangeWidth;
    }

    public IfcPositiveLengthMeasure getTopFlangeThickness() {
        return topFlangeThickness;
    }

    public void setTopFlangeThickness(IfcPositiveLengthMeasure topFlangeThickness) {
        this.topFlangeThickness = topFlangeThickness;
    }

    public IfcPositiveLengthMeasure getTopFlangeFilletRadius() {
        return topFlangeFilletRadius;
    }

    public void setTopFlangeFilletRadius(IfcPositiveLengthMeasure topFlangeFilletRadius) {
        this.topFlangeFilletRadius = topFlangeFilletRadius;
    }

    public IfcPositiveLengthMeasure getCentreOfGravityInY() {
        return centreOfGravityInY;
    }

    public void setCentreOfGravityInY(IfcPositiveLengthMeasure centreOfGravityInY) {
        this.centreOfGravityInY = centreOfGravityInY;
    }
}
