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
package org.sikongsphere.ifc.model.schema.resource.quantity.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTimeMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcNamedUnit;

/**
 * An element quantity that defines a time measure to provide an property of time related to an element. It is normally
 * given by the recipe information of the element under the specific measure rules given by a method of measurement.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcQuantityTime extends IfcPhysicalSimpleQuantity {
    private IfcTimeMeasure timeValue;

    public IfcQuantityTime(IfcLabel name, IfcText description, IfcNamedUnit unit) {
        super(name, description, unit);
    }

    @IfcParserConstructor
    public IfcQuantityTime(
        IfcLabel name,
        IfcText description,
        IfcNamedUnit unit,
        IfcTimeMeasure timeValue
    ) {
        super(name, description, unit);
        this.timeValue = timeValue;
    }

    public IfcTimeMeasure getTimeValue() {
        return timeValue;
    }

    public void setTimeValue(IfcTimeMeasure timeValue) {
        this.timeValue = timeValue;
    }
}
