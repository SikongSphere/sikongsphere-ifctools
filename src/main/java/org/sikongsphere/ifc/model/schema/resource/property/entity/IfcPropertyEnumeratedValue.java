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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * A property with an enumerated value (IfcPropertyEnumeratedValue) defines a property object which has a value
 * assigned which is chosen from an enumeration. It defines a property - value combination for which the property name,
 * the value with measure type (and optional the unit) are given.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyEnumeratedValue extends IfcSimpleProperty {
    private LIST<IfcValue> enumerationValues;
    @IfcOptionField
    private IfcPropertyEnumeration enumerationReference;

    @IfcParserConstructor
    public IfcPropertyEnumeratedValue(
        IfcIdentifier name,
        IfcText description,
        LIST<IfcValue> enumerationValues,
        IfcPropertyEnumeration enumerationReference
    ) {
        super(name, description);
        this.enumerationValues = enumerationValues;
        this.enumerationReference = enumerationReference;
    }

    public LIST<IfcValue> getEnumerationValues() {
        return enumerationValues;
    }

    public void setEnumerationValues(LIST<IfcValue> enumerationValues) {
        this.enumerationValues = enumerationValues;
    }

    public IfcPropertyEnumeration getEnumerationReference() {
        return enumerationReference;
    }

    public void setEnumerationReference(IfcPropertyEnumeration enumerationReference) {
        this.enumerationReference = enumerationReference;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
