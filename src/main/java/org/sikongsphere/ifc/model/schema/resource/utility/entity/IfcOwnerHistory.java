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
package org.sikongsphere.ifc.model.schema.resource.utility.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPersonAndOrganization;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeStamp;
import org.sikongsphere.ifc.model.schema.resource.utility.enumeration.IfcChangeActionEnum;
import org.sikongsphere.ifc.model.schema.resource.utility.enumeration.IfcStateEnum;

/**
 * IfcOwnerHistory defines all history and identification related information. In order to provide fast access it is directly attached to all independent objects, relationships and properties.
 *
 * @author Wang Bohong
 * @date 2022/8/31 21:07
 * @modified stan
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOwnerHistory extends IfcAbstractClass {
    private IfcPersonAndOrganization owningUser;

    private IfcApplication owningApplication;

    @IfcOptionField
    private IfcStateEnum state;

    private IfcChangeActionEnum changeAction;

    @IfcOptionField
    private IfcTimeStamp lastModifiedDate;

    @IfcOptionField
    private IfcPersonAndOrganization lastModifyingUser;

    @IfcOptionField
    private IfcApplication lastModifyingApplication;

    private IfcTimeStamp creationDate;

    public IfcOwnerHistory() {}

    @IfcParserConstructor
    public IfcOwnerHistory(
        IfcPersonAndOrganization owningUser,
        IfcApplication owningApplication,
        IfcStateEnum state,
        IfcChangeActionEnum changeAction,
        IfcTimeStamp lastModifiedDate,
        IfcPersonAndOrganization lastModifyingUser,
        IfcApplication lastModifyingApplication,
        IfcTimeStamp creationDate
    ) {
        this.owningUser = owningUser;
        this.owningApplication = owningApplication;
        this.state = state;
        this.changeAction = changeAction;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifyingUser = lastModifyingUser;
        this.lastModifyingApplication = lastModifyingApplication;
        this.creationDate = creationDate;
    }

    public IfcPersonAndOrganization getOwningUser() {
        return owningUser;
    }

    public void setOwningUser(IfcPersonAndOrganization owningUser) {
        this.owningUser = owningUser;
    }

    public IfcApplication getOwningApplication() {
        return owningApplication;
    }

    public void setOwningApplication(IfcApplication owningApplication) {
        this.owningApplication = owningApplication;
    }

    public IfcStateEnum getState() {
        return state;
    }

    public void setState(IfcStateEnum state) {
        this.state = state;
    }

    public IfcChangeActionEnum getChangeAction() {
        return changeAction;
    }

    public void setChangeAction(IfcChangeActionEnum changeAction) {
        this.changeAction = changeAction;
    }

    public IfcTimeStamp getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(IfcTimeStamp lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public IfcPersonAndOrganization getLastModifyingUser() {
        return lastModifyingUser;
    }

    public void setLastModifyingUser(IfcPersonAndOrganization lastModifyingUser) {
        this.lastModifyingUser = lastModifyingUser;
    }

    public IfcApplication getLastModifyingApplication() {
        return lastModifyingApplication;
    }

    public void setLastModifyingApplication(IfcApplication lastModifyingApplication) {
        this.lastModifyingApplication = lastModifyingApplication;
    }

    public IfcTimeStamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(IfcTimeStamp creationDate) {
        this.creationDate = creationDate;
    }
    public void setCreationDate(INTEGER creationDate) {
        this.creationDate = new IfcTimeStamp(creationDate);
    }
}
