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
package org.sikongsphere.ifc.model.schema.resource.property.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * A property with a bounded value (IfcPropertyBoundedValue) defines a property object which has a maximum of two
 * (numeric or descriptive) values assigned, the first value specifying the upper bound and the second value specifying
 * the lower bound. It defines a property - value bound (min-max) combination for which the property name, the upper
 * bound value with measure type, the lower bound value with measure type (and optional the unit) is given.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyBoundedValue extends IfcSimpleProperty {
    @IfcOptionField
    private IfcValue upperBoundValue;
    @IfcOptionField
    private IfcValue lowerBoundValue;
    private IfcUnit unit;

    @IfcParserConstructor
    public IfcPropertyBoundedValue(
        IfcIdentifier name,
        IfcText description,
        IfcValue upperBoundValue,
        IfcValue lowerBoundValue,
        IfcUnit unit
    ) {
        super(name, description);
        this.upperBoundValue = upperBoundValue;
        this.lowerBoundValue = lowerBoundValue;
        this.unit = unit;
    }

    public IfcValue getUpperBoundValue() {
        return upperBoundValue;
    }

    public void setUpperBoundValue(IfcValue upperBoundValue) {
        this.upperBoundValue = upperBoundValue;
    }

    public IfcValue getLowerBoundValue() {
        return lowerBoundValue;
    }

    public void setLowerBoundValue(IfcValue lowerBoundValue) {
        this.lowerBoundValue = lowerBoundValue;
    }

    public IfcUnit getUnit() {
        return unit;
    }

    public void setUnit(IfcUnit unit) {
        this.unit = unit;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
