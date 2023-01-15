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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;
import org.sikongsphere.ifc.model.schema.resource.topology.entity.IfcConnectedFaceSet;
import org.sikongsphere.ifc.model.schema.resource.topology.entity.IfcFace;

/**
 * A time series value is a list of values that comprise the time series. At least one value must be supplied.
 *
 * @author yiwei
 * @date 2022/11/01 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTimeSeriesValue extends IfcAbstractClass {
    private LIST<IfcValue> listValues;

    @IfcParserConstructor
    public IfcTimeSeriesValue(LIST<IfcValue> listValues) {
        this.listValues = listValues;
    }

    public LIST<IfcValue> getListValues() {
        return listValues;
    }

    public void setListValues(LIST<IfcValue> listValues) {
        this.listValues = listValues;
    }
}
