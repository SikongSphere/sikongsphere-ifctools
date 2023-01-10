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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.actor.enumeration.IfcAddressTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * An abstract entity type for various kinds of postal and telecom addresses.
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAddress extends IfcAbstractClass implements IfcObjectReferenceSelect {
    @IfcOptionField
    private IfcAddressTypeEnum purpose;
    @IfcOptionField
    private IfcText description;
    @IfcOptionField
    private IfcLabel userDefinedPurpose;

    @IfcInverseParameter
    private SET<IfcPerson> ofPerson;
    @IfcInverseParameter
    private SET<IfcOrganization> ofOrganization;

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

    public SET<IfcPerson> getOfPerson() {
        return ofPerson;
    }

    public void setOfPerson(SET<IfcPerson> ofPerson) {
        this.ofPerson = ofPerson;
    }

    public SET<IfcOrganization> getOfOrganization() {
        return ofOrganization;
    }

    public void setOfOrganization(SET<IfcOrganization> ofOrganization) {
        this.ofOrganization = ofOrganization;
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
