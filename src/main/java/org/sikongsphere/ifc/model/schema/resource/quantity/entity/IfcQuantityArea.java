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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcAreaMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcNamedUnit;

/**
 * A physical quantity, IfcQuantityArea, that defines a derived area measure to provide an element's physical property.
 * It is normally derived from the physical properties of the element under the specific measure rules given by a method
 * of measurement.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcQuantityArea extends IfcPhysicalSimpleQuantity {
    private IfcAreaMeasure areaValue;

    @IfcParserConstructor
    public IfcQuantityArea(
        IfcLabel name,
        IfcText description,
        IfcNamedUnit unit,
        IfcAreaMeasure areaValue
    ) {
        super(name, description, unit);
        this.areaValue = areaValue;
    }

    public IfcAreaMeasure getAreaValue() {
        return areaValue;
    }

    public void setAreaValue(IfcAreaMeasure areaValue) {
        this.areaValue = areaValue;
    }
}
