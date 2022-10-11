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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * IfcRepresentationContext
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRepresentationContext extends IfcBodyTemplate {
    private IfcLabel contextIdentifier;
    private IfcLabel contextType;

    public IfcRepresentationContext() {}

    public IfcRepresentationContext(IfcLabel contextIdentifier, IfcLabel contextType) {
        this.contextIdentifier = contextIdentifier;
        this.contextType = contextType;
    }

    public IfcLabel getContextIdentifier() {
        return contextIdentifier;
    }

    public void setContextIdentifier(IfcLabel contextIdentifier) {
        this.contextIdentifier = contextIdentifier;
    }

    public IfcLabel getContextType() {
        return contextType;
    }

    public void setContextType(IfcLabel contextType) {
        this.contextType = contextType;
    }
}
