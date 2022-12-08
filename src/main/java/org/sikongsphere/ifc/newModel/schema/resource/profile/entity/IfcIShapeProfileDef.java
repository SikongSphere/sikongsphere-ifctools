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
 * The IfcIShapeProfileDef defines a section profile that provides the defining parameters of a symmetrical 'I' section
 * to be used by the swept surface geometry or the swept area solid. The I-shape profile has values for its overall
 * depth, width and its web and flange thickness. Additionally a fillet radius may be given. It represents a I-section
 * that is symmetrical about its major and minor axes; and that has both top and bottom flanges being equal and centred
 * on the web.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcIShapeProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure overallWidth;
    private IfcPositiveLengthMeasure overallDepth;
    private IfcPositiveLengthMeasure webThickness;
    private IfcPositiveLengthMeasure flangeThickness;
    @IfcOptionField
    private IfcPositiveLengthMeasure filletRadius;

    @IfcParserConstructor
    public IfcIShapeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure overallWidth,
        IfcPositiveLengthMeasure overallDepth,
        IfcPositiveLengthMeasure webThickness,
        IfcPositiveLengthMeasure flangeThickness,
        IfcPositiveLengthMeasure filletRadius
    ) {
        super(profileType, profileName, position);
        this.overallWidth = overallWidth;
        this.overallDepth = overallDepth;
        this.webThickness = webThickness;
        this.flangeThickness = flangeThickness;
        this.filletRadius = filletRadius;
    }

    public IfcPositiveLengthMeasure getOverallWidth() {
        return overallWidth;
    }

    public void setOverallWidth(IfcPositiveLengthMeasure overallWidth) {
        this.overallWidth = overallWidth;
    }

    public IfcPositiveLengthMeasure getOverallDepth() {
        return overallDepth;
    }

    public void setOverallDepth(IfcPositiveLengthMeasure overallDepth) {
        this.overallDepth = overallDepth;
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

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
