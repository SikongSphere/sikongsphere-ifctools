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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * A property with a range value (IfcPropertyTableValue) defines a property object which has two lists of (numeric or
 * descriptive) values assigned, the values specifying a table with two columns. The defining values provide the first
 * column and establish the scope for the defined values (the second column). Interpolations are out of scope of the
 * IfcPropertyTableValue. An optional Expression attribute may give the equation used for deriving the range value,
 * which is for information purposes only.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyTableValue extends IfcSimpleProperty {
    // TODO UNIQUE
    private LIST<IfcValue> definingValues;
    private LIST<IfcValue> definedValues;
    @IfcOptionField
    private IfcText expression;
    @IfcOptionField
    private IfcUnit definingUnit;
    @IfcOptionField
    private IfcUnit definedUnit;

    @IfcParserConstructor
    public IfcPropertyTableValue(
        IfcIdentifier name,
        IfcText description,
        LIST<IfcValue> definingValues,
        LIST<IfcValue> definedValues,
        IfcText expression,
        IfcUnit definingUnit,
        IfcUnit definedUnit
    ) {
        super(name, description);
        this.definingValues = definingValues;
        this.definedValues = definedValues;
        this.expression = expression;
        this.definingUnit = definingUnit;
        this.definedUnit = definedUnit;
    }

    public LIST<IfcValue> getDefiningValues() {
        return definingValues;
    }

    public void setDefiningValues(LIST<IfcValue> definingValues) {
        this.definingValues = definingValues;
    }

    public LIST<IfcValue> getDefinedValues() {
        return definedValues;
    }

    public void setDefinedValues(LIST<IfcValue> definedValues) {
        this.definedValues = definedValues;
    }

    public IfcText getExpression() {
        return expression;
    }

    public void setExpression(IfcText expression) {
        this.expression = expression;
    }

    public IfcUnit getDefiningUnit() {
        return definingUnit;
    }

    public void setDefiningUnit(IfcUnit definingUnit) {
        this.definingUnit = definingUnit;
    }

    public IfcUnit getDefinedUnit() {
        return definedUnit;
    }

    public void setDefinedUnit(IfcUnit definedUnit) {
        this.definedUnit = definedUnit;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
