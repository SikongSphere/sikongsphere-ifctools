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
package org.sikongsphere.ifc.model.schema.resource.approval.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcActorRole;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcApprovalActorRelationship extends IfcAbstractClass {
    private IfcActorSelect actor;
    private IfcApproval approval;
    private IfcActorRole role;

    @IfcParserConstructor
    public IfcApprovalActorRelationship(IfcActorSelect actor, IfcApproval approval, IfcActorRole role) {
        this.actor = actor;
        this.approval = approval;
        this.role = role;
    }

    public IfcActorSelect getActor() {
        return actor;
    }

    public void setActor(IfcActorSelect actor) {
        this.actor = actor;
    }

    public IfcApproval getApproval() {
        return approval;
    }

    public void setApproval(IfcApproval approval) {
        this.approval = approval;
    }

    public IfcActorRole getRole() {
        return role;
    }

    public void setRole(IfcActorRole role) {
        this.role = role;
    }
}
