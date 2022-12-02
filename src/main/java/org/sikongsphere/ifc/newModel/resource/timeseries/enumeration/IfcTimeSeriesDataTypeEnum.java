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
package org.sikongsphere.ifc.newModel.resource.timeseries.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcTimeSeriesDataTypeEnum describes a type of time series data and is used to determine a value during the time
 * series which is not explicitly specified:
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcTimeSeriesDataTypeEnum {
    /**
     * The time series data is continuous.
     */
    CONTINUOUS,
    /**
     * The time series data is discrete.
     */
    DISCRETE,
    /**
     * The time series data is discrete binary.
     */
    DISCRETEBINARY,
    /**
     * The time series data is piecewise binary.
     */
    PIECEWISEBINARY,
    /**
     * The time series data is piecewise constant.
     */
    PIECEWISECONSTANT,
    /**
     * The time series data is piecewise continuous.
     */
    PIECEWISECONTINUOUS,
    /**
     * The time series data is user defined.
     */
    USERDEFINED,
    /**
     * The time series data is not defined.
     */
    NOTDEFINED
}
