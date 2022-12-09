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
package org.sikongsphere.ifc.model.schema.resource.externalreference.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcOrganization;
import org.sikongsphere.ifc.model.schema.resource.datetime.entity.IfcCalendarDate;
import org.sikongsphere.ifc.model.schema.resource.externalreference.selectType.IfcLibrarySelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * @author zaiyuan
 * @date 2022/10/26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLibraryInformation extends IfcExternalReference implements IfcLibrarySelect {
    private IfcLabel name;
    @IfcOptionField
    private IfcLabel version;
    @IfcOptionField
    private IfcOrganization publisher;
    @IfcOptionField
    private IfcCalendarDate versionDate;
    @IfcOptionField
    private SET<IfcLibraryReference> libraryReference;

    @IfcParserConstructor
    public IfcLibraryInformation(
        IfcLabel name,
        IfcLabel version,
        IfcOrganization publisher,
        IfcCalendarDate versionDate,
        SET<IfcLibraryReference> libraryReference
    ) {
        this.name = name;
        this.version = version;
        this.publisher = publisher;
        this.versionDate = versionDate;
        this.libraryReference = libraryReference;
    }

    @Override
    public IfcLabel getName() {
        return name;
    }

    @Override
    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcLabel getVersion() {
        return version;
    }

    public void setVersion(IfcLabel version) {
        this.version = version;
    }

    public IfcOrganization getPublisher() {
        return publisher;
    }

    public void setPublisher(IfcOrganization publisher) {
        this.publisher = publisher;
    }

    public IfcCalendarDate getVersionDate() {
        return versionDate;
    }

    public void setVersionDate(IfcCalendarDate versionDate) {
        this.versionDate = versionDate;
    }

    public SET<IfcLibraryReference> getLibraryReference() {
        return libraryReference;
    }

    public void setLibraryReference(SET<IfcLibraryReference> libraryReference) {
        this.libraryReference = libraryReference;
    }
}
