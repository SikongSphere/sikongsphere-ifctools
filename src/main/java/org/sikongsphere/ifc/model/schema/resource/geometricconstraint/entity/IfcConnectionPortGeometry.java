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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcConnectionPortGeometry extends IfcConnectionGeometry {
    private IfcAxis2Placement locationAtRelatingElement;
    @IfcOptionField
    private IfcAxis2Placement locationAtRelatedElement;
    private IfcProfileDef profileOfPort;

    @IfcParserConstructor
    public IfcConnectionPortGeometry(
        IfcAxis2Placement locationAtRelatingElement,
        IfcAxis2Placement locationAtRelatedElement,
        IfcProfileDef profileOfPort
    ) {
        this.locationAtRelatingElement = locationAtRelatingElement;
        this.locationAtRelatedElement = locationAtRelatedElement;
        this.profileOfPort = profileOfPort;
    }

    public IfcAxis2Placement getLocationAtRelatingElement() {
        return locationAtRelatingElement;
    }

    public void setLocationAtRelatingElement(IfcAxis2Placement locationAtRelatingElement) {
        this.locationAtRelatingElement = locationAtRelatingElement;
    }

    public IfcAxis2Placement getLocationAtRelatedElement() {
        return locationAtRelatedElement;
    }

    public void setLocationAtRelatedElement(IfcAxis2Placement locationAtRelatedElement) {
        this.locationAtRelatedElement = locationAtRelatedElement;
    }

    public IfcProfileDef getProfileOfPort() {
        return profileOfPort;
    }

    public void setProfileOfPort(IfcProfileDef profileOfPort) {
        this.profileOfPort = profileOfPort;
    }
}
