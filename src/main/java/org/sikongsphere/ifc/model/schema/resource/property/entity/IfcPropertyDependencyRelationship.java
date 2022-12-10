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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * An IfcPropertyDependencyRelationship describes an identified dependency between the value of one property and that
 * of another.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyDependencyRelationship extends IfcAbstractClass {
    private IfcProperty dependingProperty;
    private IfcProperty dependantProperty;
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    @IfcOptionField
    private IfcText expression;

    @IfcParserConstructor
    public IfcPropertyDependencyRelationship(
        IfcProperty dependingProperty,
        IfcProperty dependantProperty,
        IfcLabel name,
        IfcText description,
        IfcText expression
    ) {
        this.dependingProperty = dependingProperty;
        this.dependantProperty = dependantProperty;
        this.name = name;
        this.description = description;
        this.expression = expression;
    }

    public IfcProperty getDependingProperty() {
        return dependingProperty;
    }

    public void setDependingProperty(IfcProperty dependingProperty) {
        this.dependingProperty = dependingProperty;
    }

    public IfcProperty getDependantProperty() {
        return dependantProperty;
    }

    public void setDependantProperty(IfcProperty dependantProperty) {
        this.dependantProperty = dependantProperty;
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

    public IfcText getExpression() {
        return expression;
    }

    public void setExpression(IfcText expression) {
        this.expression = expression;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
