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
package org.sikongsphere.ifc.model.schema.extension.product.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelConnects;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelConnectsPorts extends IfcRelConnects {
    private IfcPort relatingPort;
    private IfcPort relatedPort;
    @IfcOptionField
    private IfcElement realizingElement;

    @IfcParserConstructor
    public IfcRelConnectsPorts(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPort relatingPort,
        IfcPort relatedPort,
        IfcElement realizingElement
    ) {
        super(globalId, ownerHistory, name, description);
        this.relatingPort = relatingPort;
        this.relatedPort = relatedPort;
        this.realizingElement = realizingElement;
    }

    public IfcPort getRelatingPort() {
        return relatingPort;
    }

    public void setRelatingPort(IfcPort relatingPort) {
        this.relatingPort = relatingPort;
    }

    public IfcPort getRelatedPort() {
        return relatedPort;
    }

    public void setRelatedPort(IfcPort relatedPort) {
        this.relatedPort = relatedPort;
    }

    public IfcElement getRealizingElement() {
        return realizingElement;
    }

    public void setRealizingElement(IfcElement realizingElement) {
        this.realizingElement = realizingElement;
    }
}
