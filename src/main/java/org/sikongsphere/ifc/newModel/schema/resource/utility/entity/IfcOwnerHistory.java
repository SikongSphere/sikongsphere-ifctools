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
package org.sikongsphere.ifc.newModel.schema.resource.utility.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.actor.entity.IfcPersonAndOrganization;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcTimeStamp;
import org.sikongsphere.ifc.newModel.schema.resource.utility.enumeration.IfcChangeActionEnum;
import org.sikongsphere.ifc.newModel.schema.resource.utility.enumeration.IfcStateEnum;

import java.util.Locale;
import java.util.Optional;

/**
 * This class defines all history and identification related information.
 *
 * @author Wang Bohong
 * @date 2022/8/31 21:07
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOwnerHistory extends IfcAbstractClass {
    private IfcPersonAndOrganization owningUser;

    private IfcApplication owningApplication;

    private IfcStateEnum state;

    private IfcChangeActionEnum changeAction;

    private IfcTimeStamp lastModifiedDate;

    private IfcPersonAndOrganization lastModifyingUser;

    private IfcApplication lastModifyingApplication;

    private IfcTimeStamp creationDate;

    public IfcOwnerHistory() {}

    public IfcOwnerHistory(
        IfcPersonAndOrganization owningUser,
        IfcApplication owningApplication,
        IfcChangeActionEnum changeAction,
        IfcTimeStamp creationDate
    ) {
        this.owningUser = owningUser;
        this.owningApplication = owningApplication;
        this.changeAction = changeAction;
        this.creationDate = creationDate;
    }

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

    @Override
    public String toIfc() {
        String format = String.format(
            "#%s=%s(#%s,#%s,%s,.%s.,%s,%s,%s,%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            this.owningUser.getStepNumber(),
            this.owningApplication.getStepNumber(),
            Optional.ofNullable(this.state).map(x -> this.state).orElse(IfcStateEnum.$),
            Optional.ofNullable(this.changeAction)
                .map(x -> this.changeAction)
                .orElse(IfcChangeActionEnum.$),
            Optional.ofNullable(this.lastModifiedDate)
                .map(x -> this.lastModifiedDate.toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(this.lastModifyingUser)
                .map(x -> this.lastModifyingUser.toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(this.lastModifyingApplication)
                .map(x -> this.lastModifyingApplication.toString())
                .orElse(StringConstant.DOLLAR),
            Optional.ofNullable(this.creationDate)
                .map(x -> this.creationDate.toString())
                .orElse(StringConstant.DOLLAR)
        );

        return format;
    }
}
