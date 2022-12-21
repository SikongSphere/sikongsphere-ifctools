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
package org.sikongsphere.ifc.model.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationorganization.selecttype.IfcLightDistributionDataSourceSelect;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * This class is the identification of information that is not explicitly represented in the current model or in the project database .
 * @author Wang Bohong
 * @date 2022/9/1 16:32
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcExternalReference extends IfcAbstractClass
    implements
        IfcObjectReferenceSelect,
        IfcLightDistributionDataSourceSelect {
    @IfcOptionField
    private IfcLabel location;
    @IfcOptionField
    private IfcIdentifier itemReference;
    @IfcOptionField
    private IfcLabel name;

    public IfcExternalReference() {}

    // ToDO WR1 One of the attributes of IfcExternalReference should have a value assigned.
    @IfcParserConstructor
    public IfcExternalReference(IfcLabel location, IfcIdentifier itemReference, IfcLabel name) {
        this.location = location;
        this.itemReference = itemReference;
        this.name = name;
    }

    public IfcLabel getLocation() {
        return location;
    }

    public void setLocation(IfcLabel location) {
        this.location = location;
    }

    public IfcIdentifier getItemReference() {
        return itemReference;
    }

    public void setItemReference(IfcIdentifier itemReference) {
        this.itemReference = itemReference;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
