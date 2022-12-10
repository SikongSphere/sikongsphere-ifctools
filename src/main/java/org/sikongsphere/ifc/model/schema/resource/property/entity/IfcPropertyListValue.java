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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * An IfcPropertyListValue defines a property that has several (numeric or descriptive) values assigned, these values
 * are given by an ordered list.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyListValue extends IfcSimpleProperty {
    private LIST<IfcValue> listValues;
    @IfcOptionField
    private IfcUnit unit;

    @IfcParserConstructor
    public IfcPropertyListValue(
        IfcIdentifier name,
        IfcText description,
        LIST<IfcValue> listValues,
        IfcUnit unit
    ) {
        super(name, description);
        this.listValues = listValues;
        this.unit = unit;
    }

    public LIST<IfcValue> getListValues() {
        return listValues;
    }

    public void setListValues(LIST<IfcValue> listValues) {
        this.listValues = listValues;
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
