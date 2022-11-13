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
package org.sikongsphere.ifc.sdk.factory;

import org.sikongsphere.ifc.common.environment.entity.*;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.resource.actor.entity.*;
import org.sikongsphere.ifc.model.resource.actor.enumeration.IfcAddressTypeEnum;
import org.sikongsphere.ifc.model.resource.actor.enumeration.IfcRoleEnum;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcTimeStamp;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcApplication;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.resource.utility.enumeration.IfcChangeActionEnum;
import org.sikongsphere.ifc.model.resource.utility.enumeration.IfcStateEnum;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * Abstract Factory
 *
 * @author zaiyuan
 * @date 2022/11/11 19:52
 */
public abstract class AbstractFactory<T> implements IFactory<T> {

    protected IfcOwnerHistory getOwnerHistory(Application application) {
        Person person = application.getPerson();
        List<Address> addresses = application.getAddresses();
        List<Role> roles = application.getRoles();
        Organization organization = application.getOrganization();
        long currentTimeMillis = System.currentTimeMillis();

        LIST<IfcActorRole> ifcRoles = convertRoles(roles);
        LIST<IfcAddress> ifcAddress = convertAddress(addresses);

        IfcPerson ifcPerson = convertPerson(person, ifcRoles, ifcAddress);
        IfcOrganization ifcOrganization = new IfcOrganization(
            new IfcIdentifier(""),
            new IfcLabel(organization.getName()),
            new IfcText(organization.getDescription()),
            ifcRoles,
            ifcAddress
        );
        IfcPersonAndOrganization ifcPersonAndOrganization = new IfcPersonAndOrganization(
            ifcPerson,
            ifcOrganization,
            ifcRoles
        );

        IfcApplication ifcApplication = new IfcApplication(
            ifcOrganization,
            new IfcLabel(application.getVersion()),
            new IfcLabel(application.getFullName()),
            ifcOrganization.getId()
        );

        return new IfcOwnerHistory(
            ifcPersonAndOrganization,
            ifcApplication,
            IfcStateEnum.READWRITE,
            IfcChangeActionEnum.NOCHANGE,
            new IfcTimeStamp(currentTimeMillis),
            ifcPersonAndOrganization,
            ifcApplication,
            new IfcTimeStamp(currentTimeMillis)
        );
    }

    protected LIST<IfcActorRole> convertRoles(List<Role> roles) {
        return new LIST<>(
            roles.stream()
                .map(
                    i -> new IfcActorRole(
                        IfcRoleEnum.valueOf(i.getRoleEnum().toUpperCase(Locale.ROOT)),
                        new IfcLabel(i.getUserDefinedRole()),
                        new IfcText(i.getDescription())
                    )
                )
                .collect(Collectors.toList())
        );
    }

    protected LIST<IfcAddress> convertAddress(List<Address> addresses) {
        return new LIST<>(
            addresses.stream()
                .map(
                    i -> new IfcAddress(
                        IfcAddressTypeEnum.valueOf(i.getPurpose().toUpperCase(Locale.ROOT)),
                        new IfcText(i.getDescription()),
                        new IfcLabel(i.getUserDefinedPurpose())
                    )
                )
                .collect(Collectors.toList())
        );
    }

    protected IfcPerson convertPerson(
        Person person,
        LIST<IfcActorRole> roles,
        LIST<IfcAddress> addresses
    ) {
        LIST<IfcLabel> middleNames = new LIST<>(
            Arrays.stream(person.getMiddleName()).map(IfcLabel::new).collect(Collectors.toList())
        );
        LIST<IfcLabel> prefixTitles = new LIST<>(
            Arrays.stream(person.getPrefixTitles()).map(IfcLabel::new).collect(Collectors.toList())
        );
        LIST<IfcLabel> suffixTitles = new LIST<>(
            Arrays.stream(person.getSuffixTitles()).map(IfcLabel::new).collect(Collectors.toList())
        );
        return new IfcPerson(
            new IfcIdentifier(""),
            new IfcLabel(person.getFamilyName()),
            new IfcLabel(person.getGivenName()),
            middleNames,
            prefixTitles,
            suffixTitles,
            roles,
            addresses
        );
    }
}
