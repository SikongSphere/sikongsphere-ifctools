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
package org.sikongsphere.ifc.model.resource.actor.entity;

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.basic.LIST;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;

/**
 * This class is used to encapsulate person information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
public class IfcPerson extends IfcBodyTemplate {
    private IfcIdentifier id;
    private IfcLabel familyName;
    private IfcLabel givenName;
    private LIST<IfcLabel> middleName;
    private LIST<IfcLabel> prefixTitles;
    private LIST<IfcLabel> suffixTitles;
    private LIST<IfcActorRole> roles;
    private LIST<IfcAddress> addresses;

    /**
     * Inverse
     */
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
}
