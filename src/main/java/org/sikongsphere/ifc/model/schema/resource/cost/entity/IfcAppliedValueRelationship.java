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
package org.sikongsphere.ifc.model.schema.resource.cost.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.cost.enumeration.IfcArithmeticOperatorEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 *  An IfcAppliedValueRelationship is a relationship class that enables applied values of cost or environmental impact
 *  to be aggregated together as components of another applied value.
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAppliedValueRelationship extends IfcAbstractClass {
    private IfcAppliedValue componentOfTotal;
    private SET<IfcAppliedValue> components;
    private IfcArithmeticOperatorEnum arithmeticOperator;
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;

    @IfcParserConstructor
    public IfcAppliedValueRelationship(
        IfcAppliedValue componentOfTotal,
        SET<IfcAppliedValue> components,
        IfcArithmeticOperatorEnum arithmeticOperator,
        IfcLabel name,
        IfcText description
    ) {
        this.componentOfTotal = componentOfTotal;
        this.components = components;
        this.arithmeticOperator = arithmeticOperator;
        this.name = name;
        this.description = description;
    }

    public IfcAppliedValue getComponentOfTotal() {
        return componentOfTotal;
    }

    public void setComponentOfTotal(IfcAppliedValue componentOfTotal) {
        this.componentOfTotal = componentOfTotal;
    }

    public SET<IfcAppliedValue> getComponents() {
        return components;
    }

    public void setComponents(SET<IfcAppliedValue> components) {
        this.components = components;
    }

    public IfcArithmeticOperatorEnum getArithmeticOperator() {
        return arithmeticOperator;
    }

    public void setArithmeticOperator(IfcArithmeticOperatorEnum arithmeticOperator) {
        this.arithmeticOperator = arithmeticOperator;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }
}
