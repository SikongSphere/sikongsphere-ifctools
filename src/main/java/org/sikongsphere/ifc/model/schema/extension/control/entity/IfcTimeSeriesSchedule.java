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
package org.sikongsphere.ifc.model.schema.extension.control.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.control.enumeration.IfcTimeSeriesScheduleTypeEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssociates;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.timeseries.entity.IfcTimeSeries;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 23:15
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcTimeSeriesSchedule extends IfcControl {
    @IfcOptionField
    private IfcDateTimeSelect applicableDates;
    private IfcTimeSeriesScheduleTypeEnum timeSeriesScheduleType;
    private IfcTimeSeries timeSeries;

    @IfcParserConstructor
    public IfcTimeSeriesSchedule(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcDateTimeSelect applicableDates,
        IfcTimeSeriesScheduleTypeEnum timeSeriesScheduleType,
        IfcTimeSeries timeSeries
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.applicableDates = applicableDates;
        this.timeSeriesScheduleType = timeSeriesScheduleType;
        this.timeSeries = timeSeries;
    }

    public IfcDateTimeSelect getApplicableDates() {
        return applicableDates;
    }

    public void setApplicableDates(IfcDateTimeSelect applicableDates) {
        this.applicableDates = applicableDates;
    }

    public IfcTimeSeriesScheduleTypeEnum getTimeSeriesScheduleType() {
        return timeSeriesScheduleType;
    }

    public void setTimeSeriesScheduleType(IfcTimeSeriesScheduleTypeEnum timeSeriesScheduleType) {
        this.timeSeriesScheduleType = timeSeriesScheduleType;
    }

    public IfcTimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(IfcTimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }
}
