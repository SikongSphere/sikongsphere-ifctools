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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * An abstract generalization for all types of properties that can be associated with IFC objects through the property set mechanism.
 *
 * @author Wang Bohong
 * @date 2022/10/16 12:29
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcProperty extends IfcAbstractClass {
    private IfcIdentifier name;
    @IfcOptionField
    private IfcText description;
    @IfcInverseParameter
    private SET<IfcPropertyDependencyRelationship> propertyForDependance;
    @IfcInverseParameter
    private SET<IfcPropertyDependencyRelationship> propertyDependsOn;
    @IfcInverseParameter
    private SET<IfcComplexProperty> partOfComplex;

    public IfcProperty() {}

    @IfcParserConstructor
    public IfcProperty(IfcIdentifier name, IfcText description) {
        this.name = name;
        this.description = description;
    }

    public IfcIdentifier getName() {
        return name;
    }

    public void setName(IfcIdentifier name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public SET<IfcPropertyDependencyRelationship> getPropertyForDependance() {
        return propertyForDependance;
    }

    public void setPropertyForDependance(
        SET<IfcPropertyDependencyRelationship> propertyForDependance
    ) {
        this.propertyForDependance = propertyForDependance;
    }

    public SET<IfcPropertyDependencyRelationship> getPropertyDependsOn() {
        return propertyDependsOn;
    }

    public void setPropertyDependsOn(SET<IfcPropertyDependencyRelationship> propertyDependsOn) {
        this.propertyDependsOn = propertyDependsOn;
    }

    public SET<IfcComplexProperty> getPartOfComplex() {
        return partOfComplex;
    }

    public void setPartOfComplex(SET<IfcComplexProperty> partOfComplex) {
        this.partOfComplex = partOfComplex;
    }
}
