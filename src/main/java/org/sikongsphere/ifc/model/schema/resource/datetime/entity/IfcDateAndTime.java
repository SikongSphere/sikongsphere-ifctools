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
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * @author zaiyuan
 * @date 2022/12/06 19:57
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcDateAndTime extends IfcAbstractClass implements IfcObjectReferenceSelect {
    private IfcCalendarDate dateComponent;
    private IfcLocalTime timeComponent;

    @IfcParserConstructor
    public IfcDateAndTime(IfcCalendarDate dateComponent, IfcLocalTime timeComponent) {
        this.dateComponent = dateComponent;
        this.timeComponent = timeComponent;
    }

    public IfcCalendarDate getDateComponent() {
        return dateComponent;
    }

    public void setDateComponent(IfcCalendarDate dateComponent) {
        this.dateComponent = dateComponent;
    }

    public IfcLocalTime getTimeComponent() {
        return timeComponent;
    }

    public void setTimeComponent(IfcLocalTime timeComponent) {
        this.timeComponent = timeComponent;
    }
}
