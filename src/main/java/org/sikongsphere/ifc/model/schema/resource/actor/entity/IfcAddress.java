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
package org.sikongsphere.ifc.model.schema.resource.actor.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.actor.enumeration.IfcAddressTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * This class is used to encapsulate address information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAddress extends IfcAbstractClass implements IfcObjectReferenceSelect {
    private IfcAddressTypeEnum purpose;
    private IfcText description;
    private IfcLabel userDefinedPurpose;

    // private SET<IfcPerson> ofPerson;
    // private SET<IfcOrganization> ofOrganization;

    public IfcAddress() {}

    public IfcAddressTypeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(IfcAddressTypeEnum purpose) {
        this.purpose = purpose;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcLabel getUserDefinedPurpose() {
        return userDefinedPurpose;
    }

    public void setUserDefinedPurpose(IfcLabel userDefinedPurpose) {
        this.userDefinedPurpose = userDefinedPurpose;
    }

    @IfcParserConstructor
    public IfcAddress(
        IfcAddressTypeEnum purpose,
        IfcText description,
        IfcLabel userDefinedPurpose
    ) {
        this.purpose = purpose;
        this.description = description;
        this.userDefinedPurpose = userDefinedPurpose;
    }
}
