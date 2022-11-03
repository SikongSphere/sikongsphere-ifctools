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

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.actor.enumeration.IfcAddressTypeEnum;

/**
 * This class is used to encapsulate address information
 *
 * @author zaiyuan
 * @date 2022-08-13 11:44:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAddress extends IfcBodyTemplate {
    private IfcAddressTypeEnum purpose;
    private IfcText description;
    private IfcLabel userDefinedPurpose;

    // private SET<IfcPerson> ofPerson;
    // private SET<IfcOrganization> ofOrganization;

    public IfcAddress() {}

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
