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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.actor.selectType.IfcActorSelect;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * Identification of a person within an organization.
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPersonAndOrganization extends IfcAbstractClass
    implements
        IfcActorSelect,
        IfcObjectReferenceSelect {

    private IfcPerson thePerson;
    private IfcOrganization theOrganization;
    @IfcOptionField
    private LIST<IfcActorRole> roles;

    public IfcPersonAndOrganization() {}

    @IfcParserConstructor
    public IfcPersonAndOrganization(
        IfcPerson thePerson,
        IfcOrganization theOrganization,
        LIST<IfcActorRole> roles
    ) {
        this.thePerson = thePerson;
        this.theOrganization = theOrganization;
        this.roles = roles;
    }

    public IfcPerson getThePerson() {
        return thePerson;
    }

    public void setThePerson(IfcPerson thePerson) {
        this.thePerson = thePerson;
    }

    public IfcOrganization getTheOrganization() {
        return theOrganization;
    }

    public void setTheOrganization(IfcOrganization theOrganization) {
        this.theOrganization = theOrganization;
    }

    public LIST<IfcActorRole> getRoles() {
        return roles;
    }

    public void setRoles(LIST<IfcActorRole> roles) {
        this.roles = roles;
    }

}
