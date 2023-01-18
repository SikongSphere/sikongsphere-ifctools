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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProduct;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public abstract class IfcPort extends IfcProduct {

    @IfcInverseParameter
    private IfcRelConnectsPortToElement containedIn;

    @IfcInverseParameter
    private SET<IfcRelConnectsPorts> connectedFrom;

    @IfcInverseParameter
    private SET<IfcRelConnectsPorts> connectedTo;

    @IfcParserConstructor
    public IfcPort(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation
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
    }

    public IfcRelConnectsPortToElement getContainedIn() {
        return containedIn;
    }

    public void setContainedIn(IfcRelConnectsPortToElement containedIn) {
        this.containedIn = containedIn;
    }
}
