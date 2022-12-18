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
package org.sikongsphere.ifc.model.schema.shared.management.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.management.enumeration.IfcCostScheduleTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcCostSchedule extends IfcControl {
    @IfcOptionField
    private IfcActorSelect submittedBy;
    @IfcOptionField
    private IfcActorSelect preparedBy;
    @IfcOptionField
    private IfcDateTimeSelect submittedOn;
    @IfcOptionField
    private IfcLabel status;
    @IfcOptionField
    private SET<IfcActorSelect> targetUsers;
    @IfcOptionField
    private IfcDateTimeSelect updateDate;
    private IfcIdentifier iD;
    private IfcCostScheduleTypeEnum predefinedType;

    @IfcParserConstructor
    public IfcCostSchedule(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcActorSelect submittedBy,
        IfcActorSelect preparedBy,
        IfcDateTimeSelect submittedOn,
        IfcLabel status,
        SET<IfcActorSelect> targetUsers,
        IfcDateTimeSelect updateDate,
        IfcIdentifier iD,
        IfcCostScheduleTypeEnum predefinedType
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.submittedBy = submittedBy;
        this.preparedBy = preparedBy;
        this.submittedOn = submittedOn;
        this.status = status;
        this.targetUsers = targetUsers;
        this.updateDate = updateDate;
        this.iD = iD;
        this.predefinedType = predefinedType;
    }

    public IfcActorSelect getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(IfcActorSelect submittedBy) {
        this.submittedBy = submittedBy;
    }

    public IfcActorSelect getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(IfcActorSelect preparedBy) {
        this.preparedBy = preparedBy;
    }

    public IfcDateTimeSelect getSubmittedOn() {
        return submittedOn;
    }

    public void setSubmittedOn(IfcDateTimeSelect submittedOn) {
        this.submittedOn = submittedOn;
    }

    public IfcLabel getStatus() {
        return status;
    }

    public void setStatus(IfcLabel status) {
        this.status = status;
    }

    public SET<IfcActorSelect> getTargetUsers() {
        return targetUsers;
    }

    public void setTargetUsers(SET<IfcActorSelect> targetUsers) {
        this.targetUsers = targetUsers;
    }

    public IfcDateTimeSelect getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(IfcDateTimeSelect updateDate) {
        this.updateDate = updateDate;
    }

    public IfcIdentifier getiD() {
        return iD;
    }

    public void setiD(IfcIdentifier iD) {
        this.iD = iD;
    }

    public IfcCostScheduleTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcCostScheduleTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }
}
