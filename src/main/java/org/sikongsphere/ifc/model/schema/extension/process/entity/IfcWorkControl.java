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
package org.sikongsphere.ifc.model.schema.extension.process.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.process.enumeration.IfcWorkControlTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPerson;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeMeasure;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcWorkControl extends IfcControl {
    private IfcIdentifier identifier;
    private IfcDateTimeSelect creationDate;
    @IfcOptionField
    private SET<IfcPerson> creators;
    @IfcOptionField
    private IfcLabel purpose;
    @IfcOptionField
    private IfcTimeMeasure duration;
    @IfcOptionField
    private IfcTimeMeasure totalFloat;
    private IfcDateTimeSelect startTime;
    @IfcOptionField
    private IfcDateTimeSelect finishTime;
    @IfcOptionField
    private IfcWorkControlTypeEnum workControlType;
    @IfcOptionField
    private IfcLabel userDefinedControlType;

    @IfcParserConstructor
    public IfcWorkControl(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcIdentifier identifier,
        IfcDateTimeSelect creationDate,
        SET<IfcPerson> creators,
        IfcLabel purpose,
        IfcTimeMeasure duration,
        IfcTimeMeasure totalFloat,
        IfcDateTimeSelect startTime,
        IfcDateTimeSelect finishTime,
        IfcWorkControlTypeEnum workControlType,
        IfcLabel userDefinedControlType
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.identifier = identifier;
        this.creationDate = creationDate;
        this.creators = creators;
        this.purpose = purpose;
        this.duration = duration;
        this.totalFloat = totalFloat;
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.workControlType = workControlType;
        this.userDefinedControlType = userDefinedControlType;
    }

    public IfcIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(IfcIdentifier identifier) {
        this.identifier = identifier;
    }

    public IfcDateTimeSelect getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(IfcDateTimeSelect creationDate) {
        this.creationDate = creationDate;
    }

    public SET<IfcPerson> getCreators() {
        return creators;
    }

    public void setCreators(SET<IfcPerson> creators) {
        this.creators = creators;
    }

    public IfcLabel getPurpose() {
        return purpose;
    }

    public void setPurpose(IfcLabel purpose) {
        this.purpose = purpose;
    }

    public IfcTimeMeasure getDuration() {
        return duration;
    }

    public void setDuration(IfcTimeMeasure duration) {
        this.duration = duration;
    }

    public IfcTimeMeasure getTotalFloat() {
        return totalFloat;
    }

    public void setTotalFloat(IfcTimeMeasure totalFloat) {
        this.totalFloat = totalFloat;
    }

    public IfcDateTimeSelect getStartTime() {
        return startTime;
    }

    public void setStartTime(IfcDateTimeSelect startTime) {
        this.startTime = startTime;
    }

    public IfcDateTimeSelect getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(IfcDateTimeSelect finishTime) {
        this.finishTime = finishTime;
    }

    public IfcWorkControlTypeEnum getWorkControlType() {
        return workControlType;
    }

    public void setWorkControlType(IfcWorkControlTypeEnum workControlType) {
        this.workControlType = workControlType;
    }

    public IfcLabel getUserDefinedControlType() {
        return userDefinedControlType;
    }

    public void setUserDefinedControlType(IfcLabel userDefinedControlType) {
        this.userDefinedControlType = userDefinedControlType;
    }
}
