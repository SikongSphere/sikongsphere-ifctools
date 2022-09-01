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
package org.sikongsphere.ifc.model.resource.measure.defined_type;

/**
 * IfcTimeStamp
 *
 * @author Wang Bohong
 * @date 2022/8/31 21:15
 */
public class IfcTimeStamp {

    private Integer timestamp;

    public IfcTimeStamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public IfcTimeStamp() {}

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }
}
