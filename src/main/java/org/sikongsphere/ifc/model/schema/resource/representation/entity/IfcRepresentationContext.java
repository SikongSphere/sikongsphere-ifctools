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
package org.sikongsphere.ifc.model.schema.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * The IfcRepresentationContext defines the context to which the IfcRepresentation of a product is related.
 *
 * @author zaiyuan
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRepresentationContext extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel contextIdentifier;
    @IfcOptionField
    private IfcLabel contextType;

    @IfcInverseParameter
    private SET<IfcRepresentation> representationsInContext;

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

    public SET<IfcRepresentation> getRepresentationsInContext() {
        return representationsInContext;
    }

    public void setRepresentationsInContext(SET<IfcRepresentation> representationsInContext) {
        this.representationsInContext = representationsInContext;
    }
}
