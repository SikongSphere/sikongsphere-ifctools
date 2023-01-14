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
package org.sikongsphere.ifc.model.schema.resource.profileproperty.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcRibPlateDirectionEnum;
import org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration.IfcSectionTypeEnum;

/**
 * An IfcSectionProperties defines the cross section properties for a single longitudinal piece of a cross section.
 *
 * @author GaoSu
 * @date 2022/12/18 14:51
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSectionProperties extends IfcAbstractClass {
    private IfcSectionTypeEnum sectionType;
    private IfcProfileDef startProfile;
    @IfcOptionField
    private IfcProfileDef endProfile;

    @IfcParserConstructor
    public IfcSectionProperties(
        IfcSectionTypeEnum sectionType,
        IfcProfileDef startProfile,
        IfcProfileDef endProfile
    ) {
        this.sectionType = sectionType;
        this.startProfile = startProfile;
        this.endProfile = endProfile;
    }

    public IfcSectionTypeEnum getSectionType() {
        return sectionType;
    }

    public void setSectionType(IfcSectionTypeEnum sectionType) {
        this.sectionType = sectionType;
    }

    public IfcProfileDef getStartProfile() {
        return startProfile;
    }

    public void setStartProfile(IfcProfileDef startProfile) {
        this.startProfile = startProfile;
    }

    public IfcProfileDef getEndProfile() {
        return endProfile;
    }

    public void setEndProfile(IfcProfileDef endProfile) {
        this.endProfile = endProfile;
    }
}
