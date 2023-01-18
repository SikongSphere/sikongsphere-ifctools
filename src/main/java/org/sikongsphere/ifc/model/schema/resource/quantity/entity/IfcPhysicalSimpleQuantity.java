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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcNamedUnit;

/**
 * The physical quantity, IfcPhysicalSimpleQuantity, is an entity that holds a single quantity measure value (as
 * defined at the subtypes of IfcPhysicalSimpleQuantity) together with a semantic definition of the usage for the
 * measure value.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public abstract class IfcPhysicalSimpleQuantity extends IfcPhysicalQuantity {
    @IfcOptionField
    private IfcNamedUnit unit;

    public IfcPhysicalSimpleQuantity(IfcLabel name, IfcText description) {
        super(name, description);
    }

    @IfcParserConstructor
    public IfcPhysicalSimpleQuantity(IfcLabel name, IfcText description, IfcNamedUnit unit) {
        super(name, description);
        this.unit = unit;
    }

    public IfcNamedUnit getUnit() {
        return unit;
    }

    public void setUnit(IfcNamedUnit unit) {
        this.unit = unit;
    }
}
