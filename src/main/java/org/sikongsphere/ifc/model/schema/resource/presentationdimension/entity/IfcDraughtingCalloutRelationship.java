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
package org.sikongsphere.ifc.model.schema.resource.presentationdimension.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype.IfcDraughtingCalloutElement;

/**
 *
 *
 * @author GaoSu
 * @date 2022/12/11 19:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDraughtingCalloutRelationship extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private IfcDraughtingCallout relatingDraughtingCallout;
    private IfcDraughtingCallout relatedDraughtingCallout;

    @IfcParserConstructor
    public IfcDraughtingCalloutRelationship(
        IfcLabel name,
        IfcText description,
        IfcDraughtingCallout relatingDraughtingCallout,
        IfcDraughtingCallout relatedDraughtingCallout
    ) {
        this.name = name;
        this.description = description;
        this.relatingDraughtingCallout = relatingDraughtingCallout;
        this.relatedDraughtingCallout = relatedDraughtingCallout;
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

    public IfcDraughtingCallout getRelatingDraughtingCallout() {
        return relatingDraughtingCallout;
    }

    public void setRelatingDraughtingCallout(IfcDraughtingCallout relatingDraughtingCallout) {
        this.relatingDraughtingCallout = relatingDraughtingCallout;
    }

    public IfcDraughtingCallout getRelatedDraughtingCallout() {
        return relatedDraughtingCallout;
    }

    public void setRelatedDraughtingCallout(IfcDraughtingCallout relatedDraughtingCallout) {
        this.relatedDraughtingCallout = relatedDraughtingCallout;
    }
}
