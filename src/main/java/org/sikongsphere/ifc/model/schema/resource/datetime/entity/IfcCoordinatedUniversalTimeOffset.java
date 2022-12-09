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
package org.sikongsphere.ifc.model.schema.resource.datetime.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.datetime.defineType.IfcHourInDay;
import org.sikongsphere.ifc.model.schema.resource.datetime.defineType.IfcMinuteInHour;
import org.sikongsphere.ifc.model.schema.resource.datetime.enumeration.IfcAheadOrBehind;

/**
 * @author zaiyuan
 * @date 2022/12/06 19:57
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcCoordinatedUniversalTimeOffset extends IfcAbstractClass {
    private IfcHourInDay hourInDay;
    @IfcOptionField
    private org.sikongsphere.ifc.model.schema.resource.datetime.defineType.IfcMinuteInHour minuteInHour;
    private IfcAheadOrBehind sense;

    @IfcParserConstructor
    public IfcCoordinatedUniversalTimeOffset(
        IfcHourInDay hourInDay,
        IfcMinuteInHour minuteInHour,
        IfcAheadOrBehind sense
    ) {
        this.hourInDay = hourInDay;
        this.minuteInHour = minuteInHour;
        this.sense = sense;
    }

    public IfcHourInDay getHourInDay() {
        return hourInDay;
    }

    public void setHourInDay(IfcHourInDay hourInDay) {
        this.hourInDay = hourInDay;
    }

    public IfcMinuteInHour getMinuteInHour() {
        return minuteInHour;
    }

    public void setMinuteInHour(IfcMinuteInHour minuteInHour) {
        this.minuteInHour = minuteInHour;
    }

    public IfcAheadOrBehind getSense() {
        return sense;
    }

    public void setSense(IfcAheadOrBehind sense) {
        this.sense = sense;
    }
}
