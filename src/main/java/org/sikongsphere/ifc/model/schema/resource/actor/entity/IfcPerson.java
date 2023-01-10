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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * An individual human being.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022-08-13 11:44:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPerson extends IfcAbstractClass
    implements
        IfcActorSelect,
        IfcObjectReferenceSelect {
    @IfcOptionField
    private IfcIdentifier id;
    @IfcOptionField
    private IfcLabel familyName;
    @IfcOptionField
    private IfcLabel givenName;
    @IfcOptionField
    private LIST<IfcLabel> middleName;
    @IfcOptionField
    private LIST<IfcLabel> prefixTitles;
    @IfcOptionField
    private LIST<IfcLabel> suffixTitles;
    @IfcOptionField
    private LIST<IfcActorRole> roles;
    @IfcOptionField
    private LIST<IfcAddress> addresses;

    public IfcPerson() {}

    @IfcParserConstructor
    public IfcPerson(
        IfcIdentifier id,
        IfcLabel familyName,
        IfcLabel givenName,
        LIST<IfcLabel> middleName,
        LIST<IfcLabel> prefixTitles,
        LIST<IfcLabel> suffixTitles,
        LIST<IfcActorRole> roles,
        LIST<IfcAddress> addresses
    ) {
        this.id = id;
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleName = middleName;
        this.prefixTitles = prefixTitles;
        this.suffixTitles = suffixTitles;
        this.roles = roles;
        this.addresses = addresses;
    }

    @IfcInverseParameter
    private SET<IfcPersonAndOrganization> engagedIn;

    public IfcIdentifier getId() {
        return id;
    }

    public void setId(IfcIdentifier id) {
        this.id = id;
    }

    public IfcLabel getFamilyName() {
        return familyName;
    }

    public void setFamilyName(IfcLabel familyName) {
        this.familyName = familyName;
    }

    public IfcLabel getGivenName() {
        return givenName;
    }

    public void setGivenName(IfcLabel givenName) {
        this.givenName = givenName;
    }

    public LIST<IfcLabel> getMiddleName() {
        return middleName;
    }

    public void setMiddleName(LIST<IfcLabel> middleName) {
        this.middleName = middleName;
    }

    public LIST<IfcLabel> getPrefixTitles() {
        return prefixTitles;
    }

    public void setPrefixTitles(LIST<IfcLabel> prefixTitles) {
        this.prefixTitles = prefixTitles;
    }

    public LIST<IfcLabel> getSuffixTitles() {
        return suffixTitles;
    }

    public void setSuffixTitles(LIST<IfcLabel> suffixTitles) {
        this.suffixTitles = suffixTitles;
    }

    public LIST<IfcActorRole> getRoles() {
        return roles;
    }

    public void setRoles(LIST<IfcActorRole> roles) {
        this.roles = roles;
    }

    public LIST<IfcAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(LIST<IfcAddress> addresses) {
        this.addresses = addresses;
    }

    public SET<IfcPersonAndOrganization> getEngagedIn() {
        return engagedIn;
    }

    public void setEngagedIn(SET<IfcPersonAndOrganization> engagedIn) {
        this.engagedIn = engagedIn;
    }
}
