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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * A collection of simple or measure values that define a prescribed set of alternatives from which 'enumeration values'
 * are selected. This enables inclusion of enumeration values in property sets. IfcPropertyEnumeration provides a name
 * for the enumeration as well as a list of unique (numeric or descriptive) values (that may have a measure type
 * assigned). The entity defines the list of potential enumerators to be exchanged together (or separately) with
 * properties of type IfcPropertyEnumeratedValue that selects their actual property values from this enumeration.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyEnumeration extends IfcAbstractClass {
    // TODO UNIQUE
    private IfcLabel name;
    // TODO UNIQUE
    private LIST<IfcValue> enumerationValues;
    @IfcOptionField
    private IfcUnit unit;

    @IfcParserConstructor
    public IfcPropertyEnumeration(IfcLabel name, LIST<IfcValue> enumerationValues, IfcUnit unit) {
        this.name = name;
        this.enumerationValues = enumerationValues;
        this.unit = unit;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public LIST<IfcValue> getEnumerationValues() {
        return enumerationValues;
    }

    public void setEnumerationValues(LIST<IfcValue> enumerationValues) {
        this.enumerationValues = enumerationValues;
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
