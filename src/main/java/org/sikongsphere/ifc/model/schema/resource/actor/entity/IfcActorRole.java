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
package org.sikongsphere.ifc.model.schema.resource.actor.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.actor.enumeration.IfcRoleEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * A role which is performed by an actor, either a person, an organization or a person related to an organization.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcActorRole extends IfcAbstractClass {
    private IfcRoleEnum role;
    @IfcOptionField
    private IfcLabel userDefinedRole;
    @IfcOptionField
    private IfcText description;

    @IfcParserConstructor
    public IfcActorRole(IfcRoleEnum role, IfcLabel userDefinedRole, IfcText description) {
        this.role = role;
        this.userDefinedRole = userDefinedRole;
        this.description = description;
    }

    public IfcRoleEnum getRole() {
        return role;
    }

    public void setRole(IfcRoleEnum role) {
        this.role = role;
    }

    public IfcLabel getUserDefinedRole() {
        return userDefinedRole;
    }

    public void setUserDefinedRole(IfcLabel userDefinedRole) {
        this.userDefinedRole = userDefinedRole;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }
}
