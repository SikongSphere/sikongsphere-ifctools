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
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * This is a collection of properties applicable to all linear structural members having a profile definition.
 *
 * @author GaoSu
 * @date 2022/12/18 13:29
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcProfileProperties extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel profileName;
    @IfcOptionField
    private IfcProfileDef profileDefinition;

    @IfcParserConstructor
    public IfcProfileProperties(IfcLabel profileName, IfcProfileDef profileDefinition) {
        this.profileName = profileName;
        this.profileDefinition = profileDefinition;
    }

    public IfcLabel getProfileName() {
        return profileName;
    }

    public void setProfileName(IfcLabel profileName) {
        this.profileName = profileName;
    }

    public IfcProfileDef getProfileDefinition() {
        return profileDefinition;
    }

    public void setProfileDefinition(IfcProfileDef profileDefinition) {
        this.profileDefinition = profileDefinition;
    }
}
