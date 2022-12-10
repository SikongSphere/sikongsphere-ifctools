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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcConnectionGeometry;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcRelConnectsWithRealizingElements extends IfcRelConnectsElements {
    private SET<IfcElement> realizingElements;
    @IfcOptionField
    private IfcLabel connectionType;

    @IfcParserConstructor
    public IfcRelConnectsWithRealizingElements(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcConnectionGeometry connectionGeometry,
        IfcElement relatingElement,
        IfcElement relatedElement,
        SET<IfcElement> realizingElements,
        IfcLabel connectionType
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            connectionGeometry,
            relatingElement,
            relatedElement
        );
        this.realizingElements = realizingElements;
        this.connectionType = connectionType;
    }

    public SET<IfcElement> getRealizingElements() {
        return realizingElements;
    }

    public void setRealizingElements(SET<IfcElement> realizingElements) {
        this.realizingElements = realizingElements;
    }

    public IfcLabel getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(IfcLabel connectionType) {
        this.connectionType = connectionType;
    }
}
