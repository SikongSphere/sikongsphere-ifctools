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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianTransformationOperator2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcEllipseProfileDef defines an ellipse as the profile definition used by the swept surface geometry or the swept
 * area solid. It is given by its semi axis attributes and placed within the 2D position coordinate system, established
 * by the Position attribute.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDerivedProfileDef extends IfcProfileDef {
    private IfcProfileDef parentProfile;
    private IfcCartesianTransformationOperator2D operator;
    @IfcOptionField
    private IfcLabel label;

    @IfcParserConstructor
    public IfcDerivedProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcProfileDef parentProfile,
        IfcCartesianTransformationOperator2D operator,
        IfcLabel label
    ) {
        super(profileType, profileName);
        this.parentProfile = parentProfile;
        this.operator = operator;
        this.label = label;
    }

    public IfcProfileDef getParentProfile() {
        return parentProfile;
    }

    public void setParentProfile(IfcProfileDef parentProfile) {
        this.parentProfile = parentProfile;
    }

    public IfcCartesianTransformationOperator2D getOperator() {
        return operator;
    }

    public void setOperator(IfcCartesianTransformationOperator2D operator) {
        this.operator = operator;
    }

    public IfcLabel getLabel() {
        return label;
    }

    public void setLabel(IfcLabel label) {
        this.label = label;
    }

    @Override
    public boolean illegal() {
        return getProfileType() == parentProfile.getProfileType();
    }
}
