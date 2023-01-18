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
package org.sikongsphere.ifc.model.schema.resource.utility.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcOrganization;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * IfcApplication holds the information about an IFC compliant application developed by an application developer who is a member of the IAI.
 * The IfcApplication utilizes a short identifying name as provided by the application developer.
 *
 * @author Wang Bohong
 * @date 2022/8/31 18:44
 * @modified stan
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcApplication extends IfcAbstractClass {

    private IfcOrganization applicationDeveloper;

    private IfcLabel version;

    private IfcLabel applicationFullName;

    private IfcIdentifier applicationIdentifier;

    @IfcParserConstructor
    public IfcApplication(
        IfcOrganization applicationDeveloper,
        IfcLabel version,
        IfcLabel applicationFullName,
        IfcIdentifier applicationIdentifier
    ) {
        this.applicationDeveloper = applicationDeveloper;
        this.version = version;
        this.applicationFullName = applicationFullName;
        this.applicationIdentifier = applicationIdentifier;
    }

    public IfcOrganization getApplicationDeveloper() {
        return applicationDeveloper;
    }

    public void setApplicationDeveloper(IfcOrganization applicationDeveloper) {
        this.applicationDeveloper = applicationDeveloper;
    }

    public IfcLabel getVersion() {
        return version;
    }

    public void setVersion(IfcLabel version) {
        this.version = version;
    }

    public IfcLabel getApplicationFullName() {
        return applicationFullName;
    }

    public void setApplicationFullName(IfcLabel applicationFullName) {
        this.applicationFullName = applicationFullName;
    }

    public IfcIdentifier getApplicationIdentifier() {
        return applicationIdentifier;
    }

    public void setApplicationIdentifier(IfcIdentifier applicationIdentifier) {
        this.applicationIdentifier = applicationIdentifier;
    }
}
