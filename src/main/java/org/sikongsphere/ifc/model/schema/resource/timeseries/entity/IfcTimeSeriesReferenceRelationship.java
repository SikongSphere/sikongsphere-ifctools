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
import org.sikongsphere.ifc.model.schema.resource.externalreference.selectType.IfcDocumentSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * Relationship assigning documentation references to time series.
 *
 * @author yiwei
 * @date 2022/11/01 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcTimeSeriesReferenceRelationship extends IfcAbstractClass {
    private IfcTimeSeries referencedTimeSeries;
    private SET<IfcDocumentSelect> timeSeriesReferences;

    @IfcParserConstructor
    public IfcTimeSeriesReferenceRelationship(
        IfcTimeSeries referencedTimeSeries,
        SET<IfcDocumentSelect> timeSeriesReferences
    ) {
        this.referencedTimeSeries = referencedTimeSeries;
        this.timeSeriesReferences = timeSeriesReferences;
    }

    public IfcTimeSeries getReferencedTimeSeries() {
        return referencedTimeSeries;
    }

    public void setReferencedTimeSeries(IfcTimeSeries referencedTimeSeries) {
        this.referencedTimeSeries = referencedTimeSeries;
    }

    public SET<IfcDocumentSelect> getTimeSeriesReferences() {
        return timeSeriesReferences;
    }

    public void setTimeSeriesReferences(SET<IfcDocumentSelect> timeSeriesReferences) {
        this.timeSeriesReferences = timeSeriesReferences;
    }
}
