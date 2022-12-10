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
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * @author yiwei
 * @date 2022/11/01 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcIrregularTimeSeriesValue extends IfcAbstractClass {
    private IfcDateTimeSelect timeStamp;
    private LIST<IfcValue> listValues;

    @IfcParserConstructor
    public IfcIrregularTimeSeriesValue(IfcDateTimeSelect timeStamp, LIST<IfcValue> listValues) {
        this.timeStamp = timeStamp;
        this.listValues = listValues;
    }

    public IfcDateTimeSelect getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(IfcDateTimeSelect timeStamp) {
        this.timeStamp = timeStamp;
    }

    public LIST<IfcValue> getListValues() {
        return listValues;
    }

    public void setListValues(LIST<IfcValue> listValues) {
        this.listValues = listValues;
    }
}
