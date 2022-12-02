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
package org.sikongsphere.ifc.newModel.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.core.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.newModel.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.newModel.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.resource.utility.entity.IfcOwnerHistory;

/**
 * @author Wang Bohong
 * @date 2022/10/13 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcElement extends IfcProduct {
    private IfcIdentifier tag;
    // ToDO Inverse 属性

    public IfcElement() {}

    @IfcParserConstructor
    public IfcElement(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation
        );
        this.tag = tag;
    }

    public IfcIdentifier getTag() {
        return tag;
    }

    public void setTag(IfcIdentifier tag) {
        this.tag = tag;
    }
}
