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
import org.sikongsphere.ifc.newModel.datatype.SET;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcCartesianTransformationOperator2D;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcCompositeProfileDef defines the profile by composition of other profiles. The composition is given by a set
 * of at least two other profile definitions. Any profile definition (except for another composite profile) can be used
 * to construct the composite.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCompositeProfileDef extends IfcProfileDef {
    private SET<IfcProfileDef> profiles;
    @IfcOptionField
    private IfcLabel label;

    @IfcParserConstructor
    public IfcCompositeProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        SET<IfcProfileDef> profiles,
        IfcLabel label
    ) {
        super(profileType, profileName);
        this.profiles = profiles;
        this.label = label;
    }

    public SET<IfcProfileDef> getProfiles() {
        return profiles;
    }

    public void setProfiles(SET<IfcProfileDef> profiles) {
        this.profiles = profiles;
    }

    public IfcLabel getLabel() {
        return label;
    }

    public void setLabel(IfcLabel label) {
        this.label = label;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
