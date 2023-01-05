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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.datatype.SET;

/**
 * IfcOrganizationRelationship establishes an association between one relating organization, and one or more related organizations.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022-08-30 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOrganizationRelationship extends IfcAbstractClass {
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    private IfcOrganization relatingOrganization;
    private SET<IfcOrganization> relatedOrganizations;

    @IfcParserConstructor
    public IfcOrganizationRelationship(IfcLabel name, IfcText description, IfcOrganization relatingOrganization, SET<IfcOrganization> relatedOrganizations) {
        this.name = name;
        this.description = description;
        this.relatingOrganization = relatingOrganization;
        this.relatedOrganizations = relatedOrganizations;
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

    public IfcOrganization getRelatingOrganization() {
        return relatingOrganization;
    }

    public void setRelatingOrganization(IfcOrganization relatingOrganization) {
        this.relatingOrganization = relatingOrganization;
    }

    public SET<IfcOrganization> getRelatedOrganizations() {
        return relatedOrganizations;
    }

    public void setRelatedOrganizations(SET<IfcOrganization> relatedOrganizations) {
        this.relatedOrganizations = relatedOrganizations;
    }
}
