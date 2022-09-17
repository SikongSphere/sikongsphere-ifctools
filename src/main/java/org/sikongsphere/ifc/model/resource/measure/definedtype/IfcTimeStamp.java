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
package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.model.basic.STRING;

/**
 * IfcTimeStamp
 *
 * @author Wang Bohong
 * @date 2022/8/31 21:15
 */
public class IfcTimeStamp {

    private Long timestamp;

    public IfcTimeStamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public IfcTimeStamp(STRING timestamp) {
        this.timestamp = Long.parseLong(timestamp.value);
    }

    public IfcTimeStamp() {}

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
