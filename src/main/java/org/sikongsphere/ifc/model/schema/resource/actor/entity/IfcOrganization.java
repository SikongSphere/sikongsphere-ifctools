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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * A named and structured grouping with a corporate identity.
 *
 * @author zaiyuan
 * @date 2022-08-30 18:30:00
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOrganization extends IfcAbstractClass
    implements
        IfcActorSelect,
        IfcObjectReferenceSelect {
    @IfcOptionField
    private IfcIdentifier id;
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    @IfcOptionField
    private LIST<IfcActorRole> roles;
    @IfcOptionField
    private LIST<IfcAddress> addresses;

    @IfcInverseParameter
    private SET<IfcOrganizationRelationship> isRelatedBy;
    @IfcInverseParameter
    private SET<IfcOrganizationRelationship> relates;
    @IfcInverseParameter
    private SET<IfcPersonAndOrganization> engages;

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

    public IfcOrganization() {}

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

    public SET<IfcOrganizationRelationship> getIsRelatedBy() {
        return isRelatedBy;
    }

    public void setIsRelatedBy(SET<IfcOrganizationRelationship> isRelatedBy) {
        this.isRelatedBy = isRelatedBy;
    }

    public SET<IfcOrganizationRelationship> getRelates() {
        return relates;
    }

    public void setRelates(SET<IfcOrganizationRelationship> relates) {
        this.relates = relates;
    }

    public SET<IfcPersonAndOrganization> getEngages() {
        return engages;
    }

    public void setEngages(SET<IfcPersonAndOrganization> engages) {
        this.engages = engages;
    }
}
