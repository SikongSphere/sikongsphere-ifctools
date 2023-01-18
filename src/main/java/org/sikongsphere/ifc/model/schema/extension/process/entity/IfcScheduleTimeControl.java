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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeMeasure;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcScheduleTimeControl extends IfcControl {
    @IfcOptionField
    private IfcDateTimeSelect actualStart;
    @IfcOptionField
    private IfcDateTimeSelect earlyStart;
    @IfcOptionField
    private IfcDateTimeSelect lateStart;
    @IfcOptionField
    private IfcDateTimeSelect scheduleStart;
    @IfcOptionField
    private IfcDateTimeSelect actualFinish;
    @IfcOptionField
    private IfcDateTimeSelect earlyFinish;
    @IfcOptionField
    private IfcDateTimeSelect lateFinish;
    @IfcOptionField
    private IfcDateTimeSelect scheduleFinish;
    @IfcOptionField
    private IfcTimeMeasure scheduleDuration;
    @IfcOptionField
    private IfcTimeMeasure actualDuration;
    @IfcOptionField
    private IfcTimeMeasure remainingTime;
    @IfcOptionField
    private IfcTimeMeasure freeFloat;
    @IfcOptionField
    private IfcTimeMeasure totalFloat;
    @IfcOptionField
    private BOOLEAN isCritical;
    @IfcOptionField
    private IfcDateTimeSelect statusTime;
    @IfcOptionField
    private IfcTimeMeasure startFloat;
    @IfcOptionField
    private IfcTimeMeasure finishFloat;
    @IfcOptionField
    private IfcPositiveRatioMeasure completion;
    @IfcInverseParameter
    private IfcRelAssignsTasks scheduleTimeControlAssigned;

    @IfcParserConstructor
    public IfcScheduleTimeControl(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcDateTimeSelect actualStart,
        IfcDateTimeSelect earlyStart,
        IfcDateTimeSelect lateStart,
        IfcDateTimeSelect scheduleStart,
        IfcDateTimeSelect actualFinish,
        IfcDateTimeSelect earlyFinish,
        IfcDateTimeSelect lateFinish,
        IfcDateTimeSelect scheduleFinish,
        IfcTimeMeasure scheduleDuration,
        IfcTimeMeasure actualDuration,
        IfcTimeMeasure remainingTime,
        IfcTimeMeasure freeFloat,
        IfcTimeMeasure totalFloat,
        BOOLEAN isCritical,
        IfcDateTimeSelect statusTime,
        IfcTimeMeasure startFloat,
        IfcTimeMeasure finishFloat,
        IfcPositiveRatioMeasure completion
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.actualStart = actualStart;
        this.earlyStart = earlyStart;
        this.lateStart = lateStart;
        this.scheduleStart = scheduleStart;
        this.actualFinish = actualFinish;
        this.earlyFinish = earlyFinish;
        this.lateFinish = lateFinish;
        this.scheduleFinish = scheduleFinish;
        this.scheduleDuration = scheduleDuration;
        this.actualDuration = actualDuration;
        this.remainingTime = remainingTime;
        this.freeFloat = freeFloat;
        this.totalFloat = totalFloat;
        this.isCritical = isCritical;
        this.statusTime = statusTime;
        this.startFloat = startFloat;
        this.finishFloat = finishFloat;
        this.completion = completion;
    }

    public IfcDateTimeSelect getActualStart() {
        return actualStart;
    }

    public void setActualStart(IfcDateTimeSelect actualStart) {
        this.actualStart = actualStart;
    }

    public IfcDateTimeSelect getEarlyStart() {
        return earlyStart;
    }

    public void setEarlyStart(IfcDateTimeSelect earlyStart) {
        this.earlyStart = earlyStart;
    }

    public IfcDateTimeSelect getLateStart() {
        return lateStart;
    }

    public void setLateStart(IfcDateTimeSelect lateStart) {
        this.lateStart = lateStart;
    }

    public IfcDateTimeSelect getScheduleStart() {
        return scheduleStart;
    }

    public void setScheduleStart(IfcDateTimeSelect scheduleStart) {
        this.scheduleStart = scheduleStart;
    }

    public IfcDateTimeSelect getActualFinish() {
        return actualFinish;
    }

    public void setActualFinish(IfcDateTimeSelect actualFinish) {
        this.actualFinish = actualFinish;
    }

    public IfcDateTimeSelect getEarlyFinish() {
        return earlyFinish;
    }

    public void setEarlyFinish(IfcDateTimeSelect earlyFinish) {
        this.earlyFinish = earlyFinish;
    }

    public IfcDateTimeSelect getLateFinish() {
        return lateFinish;
    }

    public void setLateFinish(IfcDateTimeSelect lateFinish) {
        this.lateFinish = lateFinish;
    }

    public IfcDateTimeSelect getScheduleFinish() {
        return scheduleFinish;
    }

    public void setScheduleFinish(IfcDateTimeSelect scheduleFinish) {
        this.scheduleFinish = scheduleFinish;
    }

    public IfcTimeMeasure getScheduleDuration() {
        return scheduleDuration;
    }

    public void setScheduleDuration(IfcTimeMeasure scheduleDuration) {
        this.scheduleDuration = scheduleDuration;
    }

    public IfcTimeMeasure getActualDuration() {
        return actualDuration;
    }

    public void setActualDuration(IfcTimeMeasure actualDuration) {
        this.actualDuration = actualDuration;
    }

    public IfcTimeMeasure getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(IfcTimeMeasure remainingTime) {
        this.remainingTime = remainingTime;
    }

    public IfcTimeMeasure getFreeFloat() {
        return freeFloat;
    }

    public void setFreeFloat(IfcTimeMeasure freeFloat) {
        this.freeFloat = freeFloat;
    }

    public IfcTimeMeasure getTotalFloat() {
        return totalFloat;
    }

    public void setTotalFloat(IfcTimeMeasure totalFloat) {
        this.totalFloat = totalFloat;
    }

    public BOOLEAN getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(BOOLEAN isCritical) {
        this.isCritical = isCritical;
    }

    public IfcDateTimeSelect getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(IfcDateTimeSelect statusTime) {
        this.statusTime = statusTime;
    }

    public IfcTimeMeasure getStartFloat() {
        return startFloat;
    }

    public void setStartFloat(IfcTimeMeasure startFloat) {
        this.startFloat = startFloat;
    }

    public IfcTimeMeasure getFinishFloat() {
        return finishFloat;
    }

    public void setFinishFloat(IfcTimeMeasure finishFloat) {
        this.finishFloat = finishFloat;
    }

    public IfcPositiveRatioMeasure getCompletion() {
        return completion;
    }

    public void setCompletion(IfcPositiveRatioMeasure completion) {
        this.completion = completion;
    }

    public IfcRelAssignsTasks getScheduleTimeControlAssigned() {
        return scheduleTimeControlAssigned;
    }

    public void setScheduleTimeControlAssigned(IfcRelAssignsTasks scheduleTimeControlAssigned) {
        this.scheduleTimeControlAssigned = scheduleTimeControlAssigned;
    }
}
