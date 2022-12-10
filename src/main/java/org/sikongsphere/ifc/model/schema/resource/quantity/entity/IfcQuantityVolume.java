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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcVolumeMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcNamedUnit;

/**
 * A physical quantity that defines a derived volume measure to provide an element's physical property. It is normally
 * derived from the physical properties of the element under the specific measure rules given by a method of measurement.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcQuantityVolume extends IfcPhysicalSimpleQuantity {
    private IfcVolumeMeasure volumneValue;

    public IfcQuantityVolume(IfcLabel name, IfcText description, IfcNamedUnit unit) {
        super(name, description, unit);
    }

    @IfcParserConstructor
    public IfcQuantityVolume(
        IfcLabel name,
        IfcText description,
        IfcNamedUnit unit,
        IfcVolumeMeasure volumneValue
    ) {
        super(name, description, unit);
        this.volumneValue = volumneValue;
    }

    public IfcVolumeMeasure getVolumneValue() {
        return volumneValue;
    }

    public void setVolumneValue(IfcVolumeMeasure volumneValue) {
        this.volumneValue = volumneValue;
    }
}
