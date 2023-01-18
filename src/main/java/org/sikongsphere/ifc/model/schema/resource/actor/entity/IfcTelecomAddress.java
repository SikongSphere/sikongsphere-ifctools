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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * Address to which telephone, electronic mail and other forms of telecommunications should be addressed.
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTelecomAddress extends IfcAddress {

    @IfcOptionField
    private LIST<IfcLabel> telephoneNumbers;
    @IfcOptionField
    private LIST<IfcLabel> facsimileNumbers;
    @IfcOptionField
    private IfcLabel pagerNumber;
    @IfcOptionField
    private LIST<IfcLabel> electronicMailAddresses;
    @IfcOptionField
    private IfcLabel wWWHomePageURL;

    public IfcTelecomAddress() {}

    @IfcParserConstructor
    public IfcTelecomAddress(
        LIST<IfcLabel> telephoneNumbers,
        LIST<IfcLabel> facsimileNumbers,
        IfcLabel pagerNumber,
        LIST<IfcLabel> electronicMailAddresses,
        IfcLabel wWWHomePageURL
    ) {
        this.telephoneNumbers = telephoneNumbers;
        this.facsimileNumbers = facsimileNumbers;
        this.pagerNumber = pagerNumber;
        this.electronicMailAddresses = electronicMailAddresses;
        this.wWWHomePageURL = wWWHomePageURL;
    }

    public LIST<IfcLabel> getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void setTelephoneNumbers(LIST<IfcLabel> telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public LIST<IfcLabel> getFacsimileNumbers() {
        return facsimileNumbers;
    }

    public void setFacsimileNumbers(LIST<IfcLabel> facsimileNumbers) {
        this.facsimileNumbers = facsimileNumbers;
    }

    public IfcLabel getPagerNumber() {
        return pagerNumber;
    }

    public void setPagerNumber(IfcLabel pagerNumber) {
        this.pagerNumber = pagerNumber;
    }

    public LIST<IfcLabel> getElectronicMailAddresses() {
        return electronicMailAddresses;
    }

    public void setElectronicMailAddresses(LIST<IfcLabel> electronicMailAddresses) {
        this.electronicMailAddresses = electronicMailAddresses;
    }

    public IfcLabel getwWWHomePageURL() {
        return wWWHomePageURL;
    }

    public void setwWWHomePageURL(IfcLabel wWWHomePageURL) {
        this.wWWHomePageURL = wWWHomePageURL;
    }
}
