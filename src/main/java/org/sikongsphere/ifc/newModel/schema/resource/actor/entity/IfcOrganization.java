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
package org.sikongsphere.ifc.newModel.schema.resource.actor.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;

/**
 * This class is used to encapsulate organization information
 *
 * @author zaiyuan
 * @date 2022-08-30 18:30:00
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOrganization extends IfcAbstractClass implements IfcActorSelect {
    private IfcIdentifier id;
    private IfcLabel name;
    private IfcText description;
    private LIST<IfcActorRole> roles;
    private LIST<IfcAddress> addresses;

    // private SET<IfcOrganizationRelationship> isRelatedBy;
    // private SET<IfcOrganizationRelationship> relates;
    // private SET<IfcPersonAndOrganization> engages;

    @IfcParserConstructor
    public IfcOrganization(
        IfcIdentifier id,
        IfcLabel name,
        IfcText description,
        LIST<IfcActorRole> roles,
        LIST<IfcAddress> addresses
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.roles = roles;
        this.addresses = addresses;
    }

    public IfcIdentifier getId() {
        return id;
    }

    public void setId(IfcIdentifier id) {
        this.id = id;
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

    // public SET<IfcOrganizationRelationship> getIsRelatedBy() {
    // return isRelatedBy;
    // }

    // public void setIsRelatedBy(SET<IfcOrganizationRelationship> isRelatedBy) {
    // this.isRelatedBy = isRelatedBy;
    // }

    // public SET<IfcOrganizationRelationship> getRelates() {
    // return relates;
    // }

    // public void setRelates(SET<IfcOrganizationRelationship> relates) {
    // this.relates = relates;
    // }

    // public SET<IfcPersonAndOrganization> getEngages() {
    // return engages;
    // }

    // public void setEngages(SET<IfcPersonAndOrganization> engages) {
    // this.engages = engages;
    // }
}
