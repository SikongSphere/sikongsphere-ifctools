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
import org.sikongsphere.ifc.model.schema.resource.actor.enumeration.IfcAddressTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;

/**
 * IfcPostalAddress
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcPostalAddress extends IfcAddress {

    private IfcLabel internalLocation;
    private LIST<IfcLabel> AddressLines;
    private IfcLabel PostalBox;
    private IfcLabel Town;
    private IfcLabel Region;
    private IfcLabel PostalCode;
    private IfcLabel Country;

    public IfcPostalAddress() {}

    @IfcParserConstructor
    public IfcPostalAddress(
        IfcAddressTypeEnum purpose,
        IfcText description,
        IfcLabel userDefinedPurpose,
        IfcLabel internalLocation,
        LIST<IfcLabel> addressLines,
        IfcLabel postalBox,
        IfcLabel town,
        IfcLabel region,
        IfcLabel postalCode,
        IfcLabel country
    ) {
        super(purpose, description, userDefinedPurpose);
        this.internalLocation = internalLocation;
        AddressLines = addressLines;
        PostalBox = postalBox;
        Town = town;
        Region = region;
        PostalCode = postalCode;
        Country = country;
    }

    public IfcLabel getInternalLocation() {
        return internalLocation;
    }

    public void setInternalLocation(IfcLabel internalLocation) {
        this.internalLocation = internalLocation;
    }

    public LIST<IfcLabel> getAddressLines() {
        return AddressLines;
    }

    public void setAddressLines(LIST<IfcLabel> addressLines) {
        AddressLines = addressLines;
    }

    public IfcLabel getPostalBox() {
        return PostalBox;
    }

    public void setPostalBox(IfcLabel postalBox) {
        PostalBox = postalBox;
    }

    public IfcLabel getTown() {
        return Town;
    }

    public void setTown(IfcLabel town) {
        Town = town;
    }

    public IfcLabel getRegion() {
        return Region;
    }

    public void setRegion(IfcLabel region) {
        Region = region;
    }

    public IfcLabel getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(IfcLabel postalCode) {
        PostalCode = postalCode;
    }

    public IfcLabel getCountry() {
        return Country;
    }

    public void setCountry(IfcLabel country) {
        Country = country;
    }

}