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
package org.sikongsphere.ifc.model.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * @author GaoSU
 * @date 2022/10/25 13:26
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcProfileDef extends IfcBodyTemplate {
    private IfcProfileTypeEnum ProfileType;
    private IfcLabel ProfileName;

    public IfcProfileDef() {}

    @IfcParserConstructor

    public IfcProfileDef(IfcProfileTypeEnum profileType, IfcLabel profileName) {
        ProfileType = profileType;
        ProfileName = profileName;
    }

    public IfcProfileTypeEnum getProfileType() {
        return ProfileType;
    }

    public void setProfileType(IfcProfileTypeEnum profileType) {
        ProfileType = profileType;
    }

    public IfcLabel getProfileName() {
        return ProfileName;
    }

    public void setProfileName(IfcLabel profileName) {
        ProfileName = profileName;
    }
}
