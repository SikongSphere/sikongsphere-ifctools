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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcPort;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcFlowDirectionEnum;

/**
 * The product IfcDistributionPort defines the occurrence of a specialized port for use within the context of distribution elements. Its type is defined by IfcDistributionPortType or its subtypes.
 * @author zaiyuan
 * @modify GaoSu
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcDistributionPort extends IfcPort {

    @IfcOptionField
    private IfcFlowDirectionEnum flowDirection;

    @IfcParserConstructor
    public IfcDistributionPort(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcFlowDirectionEnum flowDirection
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
        this.flowDirection = flowDirection;
    }

    public IfcFlowDirectionEnum getFlowDirection() {
        return flowDirection;
    }

    public void setFlowDirection(IfcFlowDirectionEnum flowDirection) {
        this.flowDirection = flowDirection;
    }
}
