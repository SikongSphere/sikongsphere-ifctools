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
 * The IfcPropertyReferenceValue allows a property value to be given by referencing other entities within the resource
 * definitions of IFC. Those other entities are regarded as predefined complex properties and can be aggregated within
 * a property set (IfcPropertySet). The allowable entities to be used as value references are given by the
 * IfcObjectReferenceSelect.
 *
 * @author zaiyuan
 * @date 2022/12/10 12:37
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertyReferenceValue extends IfcSimpleProperty {
    @IfcOptionField
    private IfcLabel usageName;
    private IfcObjectReferenceSelect propertyReference;

    @IfcParserConstructor
    public IfcPropertyReferenceValue(
        IfcIdentifier name,
        IfcText description,
        IfcLabel usageName,
        IfcObjectReferenceSelect propertyReference
    ) {
        super(name, description);
        this.usageName = usageName;
        this.propertyReference = propertyReference;
    }

    public IfcLabel getUsageName() {
        return usageName;
    }

    public void setUsageName(IfcLabel usageName) {
        this.usageName = usageName;
    }

    public IfcObjectReferenceSelect getPropertyReference() {
        return propertyReference;
    }

    public void setPropertyReference(IfcObjectReferenceSelect propertyReference) {
        this.propertyReference = propertyReference;
    }
}
