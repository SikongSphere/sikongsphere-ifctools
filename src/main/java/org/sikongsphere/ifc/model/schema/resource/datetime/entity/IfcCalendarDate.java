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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.datetime.defineType.IfcDayInMonthNumber;
import org.sikongsphere.ifc.model.schema.resource.datetime.defineType.IfcMonthInYearNumber;
import org.sikongsphere.ifc.model.schema.resource.datetime.defineType.IfcYearNumber;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * @author Wang Bohong
 * @date 2022/10/28 09:57
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcCalendarDate extends IfcAbstractClass
    implements
        IfcObjectReferenceSelect,
        IfcDateTimeSelect {
    private IfcDayInMonthNumber dayComponent;
    private IfcMonthInYearNumber monthComponent;
    private IfcYearNumber yearComponent;

    public IfcCalendarDate() {}

    @IfcParserConstructor
    public IfcCalendarDate(
        IfcDayInMonthNumber dayComponent,
        IfcMonthInYearNumber monthComponent,
        IfcYearNumber yearComponent
    ) {
        this.dayComponent = dayComponent;
        this.monthComponent = monthComponent;
        this.yearComponent = yearComponent;
    }

    public IfcDayInMonthNumber getDayComponent() {
        return dayComponent;
    }

    public void setDayComponent(IfcDayInMonthNumber dayComponent) {
        this.dayComponent = dayComponent;
    }

    public IfcMonthInYearNumber getMonthComponent() {
        return monthComponent;
    }

    public void setMonthComponent(IfcMonthInYearNumber monthComponent) {
        this.monthComponent = monthComponent;
    }

    public IfcYearNumber getYearComponent() {
        return yearComponent;
    }

    public void setYearComponent(IfcYearNumber yearComponent) {
        this.yearComponent = yearComponent;
    }
}
