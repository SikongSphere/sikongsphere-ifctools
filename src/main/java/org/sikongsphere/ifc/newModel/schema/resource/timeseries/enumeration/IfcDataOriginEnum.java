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
package org.sikongsphere.ifc.newModel.schema.resource.timeseries.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcTimeSeriesDataGeneratedByEnum identifies the origin of the time series data
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcDataOriginEnum {
    /**
     * The origin of the time series data is a measurement device.
     */
    MEASURED,
    /**
     * The time series data are a prediction.
     */
    PREDICTED,
    /**
     * The origin of the time series data is a simulation.
     */
    SIMULATED,
    /**
     * User-defined time series data origin.
     */
    USERDEFINED,
    /**
     * The origin of the time series data is undefined.
     */
    NOTDEFINED
}
