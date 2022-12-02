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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * @author Wang Bohong
 * @date 2022/10/28 10:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcProfileDef extends IfcAbstractClass {
    private IfcProfileTypeEnum profileType;
    private IfcLabel profileName;

    public IfcProfileDef() {}

    @IfcParserConstructor
    public IfcProfileDef(IfcProfileTypeEnum profileType, IfcLabel profileName) {
        this.profileType = profileType;
        this.profileName = profileName;
    }

    public IfcProfileTypeEnum getProfileType() {
        return profileType;
    }

    public void setProfileType(IfcProfileTypeEnum profileType) {
        this.profileType = profileType;
    }

    public IfcLabel getProfileName() {
        return profileName;
    }

    public void setProfileName(IfcLabel profileName) {
        this.profileName = profileName;
    }
}
