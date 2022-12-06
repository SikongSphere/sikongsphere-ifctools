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
package org.sikongsphere.ifc.newModel.schema.resource.datetime.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.defineType.IfcDaylightSavingHour;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.defineType.IfcHourInDay;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.defineType.IfcMinuteInHour;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.defineType.IfcSecondInMinute;

/**
 * @author zaiyuan
 * @date 2022/12/06 19:57
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcLocalTime extends IfcAbstractClass {
    private IfcHourInDay hourComponent;
    @IfcOptionField
    private IfcMinuteInHour minuteComponent;
    @IfcOptionField
    private IfcSecondInMinute secondComponent;
    @IfcOptionField
    private IfcCoordinatedUniversalTimeOffset zone;
    @IfcOptionField
    private IfcDaylightSavingHour daylightSavingOffset;

    @IfcParserConstructor
    public IfcLocalTime(
        IfcHourInDay hourComponent,
        IfcMinuteInHour minuteComponent,
        IfcSecondInMinute secondComponent,
        IfcCoordinatedUniversalTimeOffset zone,
        IfcDaylightSavingHour daylightSavingOffset
    ) {
        this.hourComponent = hourComponent;
        this.minuteComponent = minuteComponent;
        this.secondComponent = secondComponent;
        this.zone = zone;
        this.daylightSavingOffset = daylightSavingOffset;
    }

    public IfcHourInDay getHourComponent() {
        return hourComponent;
    }

    public void setHourComponent(IfcHourInDay hourComponent) {
        this.hourComponent = hourComponent;
    }

    public IfcMinuteInHour getMinuteComponent() {
        return minuteComponent;
    }

    public void setMinuteComponent(IfcMinuteInHour minuteComponent) {
        this.minuteComponent = minuteComponent;
    }

    public IfcSecondInMinute getSecondComponent() {
        return secondComponent;
    }

    public void setSecondComponent(IfcSecondInMinute secondComponent) {
        this.secondComponent = secondComponent;
    }

    public IfcCoordinatedUniversalTimeOffset getZone() {
        return zone;
    }

    public void setZone(IfcCoordinatedUniversalTimeOffset zone) {
        this.zone = zone;
    }

    public IfcDaylightSavingHour getDaylightSavingOffset() {
        return daylightSavingOffset;
    }

    public void setDaylightSavingOffset(IfcDaylightSavingHour daylightSavingOffset) {
        this.daylightSavingOffset = daylightSavingOffset;
    }
}
