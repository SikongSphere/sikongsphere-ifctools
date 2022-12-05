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
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LIST;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;

import java.util.Locale;
import java.util.Optional;

/**
 * This class is used to encapsulate actor person and organization information
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPersonAndOrganization extends IfcAbstractClass implements IfcActorSelect {

    /**
     * @
     */
    private IfcPerson thePerson;
    private IfcOrganization theOrganization;
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

    @Override
    public String toString() {
        String format = String.format("#%s=%s(#%s,#%s,%s);",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                this.thePerson.getStepNumber(),
                this.theOrganization.getStepNumber(),
                Optional.ofNullable(this.roles).map(x -> this.roles.toString()).orElse(StringConstant.DOLLAR)
        );

        return format;
    }
}
