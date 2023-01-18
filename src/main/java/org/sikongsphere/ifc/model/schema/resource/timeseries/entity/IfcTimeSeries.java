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
package org.sikongsphere.ifc.model.schema.resource.timeseries.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.constraint.selectType.IfcMetricValueSelect;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;
import org.sikongsphere.ifc.model.schema.resource.timeseries.enumeration.IfcDataOriginEnum;
import org.sikongsphere.ifc.model.schema.resource.timeseries.enumeration.IfcTimeSeriesDataTypeEnum;

/**
 * A time series is a set of a time-stamped data entries.
 *
 * @author yiwei
 * @date 2022/11/01 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTimeSeries extends IfcAbstractClass
    implements
        IfcMetricValueSelect,
        IfcObjectReferenceSelect {
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private IfcDateTimeSelect startTime;
    private IfcDateTimeSelect endTime;
    private IfcTimeSeriesDataTypeEnum timeSeriesDataType;
    private IfcDataOriginEnum dataOrigin;
    @IfcOptionField
    private IfcLabel userDefinedDataOrigin;
    @IfcOptionField
    private IfcUnit unit;
    @IfcInverseParameter
    private SET<IfcTimeSeriesReferenceRelationship> documentedBy;

    @IfcParserConstructor
    public IfcTimeSeries(
        IfcLabel name,
        IfcText description,
        IfcDateTimeSelect startTime,
        IfcDateTimeSelect endTime,
        IfcTimeSeriesDataTypeEnum timeSeriesDataType,
        IfcDataOriginEnum dataOrigin,
        IfcLabel userDefinedDataOrigin,
        IfcUnit unit
    ) {
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeSeriesDataType = timeSeriesDataType;
        this.dataOrigin = dataOrigin;
        this.userDefinedDataOrigin = userDefinedDataOrigin;
        this.unit = unit;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcDateTimeSelect getStartTime() {
        return startTime;
    }

    public void setStartTime(IfcDateTimeSelect startTime) {
        this.startTime = startTime;
    }

    public IfcDateTimeSelect getEndTime() {
        return endTime;
    }

    public void setEndTime(IfcDateTimeSelect endTime) {
        this.endTime = endTime;
    }

    public IfcTimeSeriesDataTypeEnum getTimeSeriesDataType() {
        return timeSeriesDataType;
    }

    public void setTimeSeriesDataType(IfcTimeSeriesDataTypeEnum timeSeriesDataType) {
        this.timeSeriesDataType = timeSeriesDataType;
    }

    public IfcDataOriginEnum getDataOrigin() {
        return dataOrigin;
    }

    public void setDataOrigin(IfcDataOriginEnum dataOrigin) {
        this.dataOrigin = dataOrigin;
    }

    public IfcLabel getUserDefinedDataOrigin() {
        return userDefinedDataOrigin;
    }

    public void setUserDefinedDataOrigin(IfcLabel userDefinedDataOrigin) {
        this.userDefinedDataOrigin = userDefinedDataOrigin;
    }

    public IfcUnit getUnit() {
        return unit;
    }

    public void setUnit(IfcUnit unit) {
        this.unit = unit;
    }

    public SET<IfcTimeSeriesReferenceRelationship> getDocumentedBy() {
        return documentedBy;
    }

    public void setDocumentedBy(SET<IfcTimeSeriesReferenceRelationship> documentedBy) {
        this.documentedBy = documentedBy;
    }
}
