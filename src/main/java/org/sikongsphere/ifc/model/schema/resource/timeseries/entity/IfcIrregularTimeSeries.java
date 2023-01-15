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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;
import org.sikongsphere.ifc.model.schema.resource.timeseries.enumeration.IfcDataOriginEnum;
import org.sikongsphere.ifc.model.schema.resource.timeseries.enumeration.IfcTimeSeriesDataTypeEnum;

/**
 * In an irregular time series, unpredictable bursts of data arrive at unspecified points in time, or most time stamps
 * cannot be characterized by a repeating pattern.
 *
 * @author yiwei
 * @date 2022/11/01 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcIrregularTimeSeries extends IfcTimeSeries {
    private LIST<IfcIrregularTimeSeriesValue> values;

    @IfcParserConstructor
    public IfcIrregularTimeSeries(
        IfcLabel name,
        IfcText description,
        IfcDateTimeSelect startTime,
        IfcDateTimeSelect endTime,
        IfcTimeSeriesDataTypeEnum timeSeriesDataType,
        IfcDataOriginEnum dataOrigin,
        IfcLabel userDefinedDataOrigin,
        IfcUnit unit,
        LIST<IfcIrregularTimeSeriesValue> values
    ) {
        super(
            name,
            description,
            startTime,
            endTime,
            timeSeriesDataType,
            dataOrigin,
            userDefinedDataOrigin,
            unit
        );
        this.values = values;
    }

    public LIST<IfcIrregularTimeSeriesValue> getValues() {
        return values;
    }

    public void setValues(LIST<IfcIrregularTimeSeriesValue> values) {
        this.values = values;
    }
}
