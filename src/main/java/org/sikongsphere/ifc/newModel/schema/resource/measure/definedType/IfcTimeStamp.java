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
package org.sikongsphere.ifc.newModel.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.INTEGER;
import org.sikongsphere.ifc.newModel.datatype.STRING;

/**
 * IfcTimeStamp
 *
 * @author Wang Bohong
 * @date 2022/8/31 21:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcTimeStamp extends INTEGER {

    private Long timestamp;

    public IfcTimeStamp(Integer value) {
        super(value);
    }

    // public IfcTimeStamp(Long timestamp) {
    // super((Integer) timestamp.longValue());
    // this.timestamp = timestamp;
    // }

    public IfcTimeStamp(INTEGER timestamp) {
        super(timestamp);
        this.timestamp = (long) timestamp.value;
    }

    public IfcTimeStamp(STRING timestamp) {
        super(Integer.parseInt(timestamp.value));
        this.timestamp = Long.parseLong(timestamp.value);
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return String.valueOf(timestamp);
    }
}
