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
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcTransportElementTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcTransportElement extends IfcElement {
    @IfcOptionField
    private IfcTransportElementTypeEnum operationType;
    @IfcOptionField
    private IfcMassMeasure capacityByWeight;
    @IfcOptionField
    private IfcCountMeasure capacityByNumber;

    @IfcParserConstructor
    public IfcTransportElement(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcTransportElementTypeEnum operationType,
        IfcMassMeasure capacityByWeight,
        IfcCountMeasure capacityByNumber
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag
        );
        this.operationType = operationType;
        this.capacityByWeight = capacityByWeight;
        this.capacityByNumber = capacityByNumber;
    }

    public IfcTransportElementTypeEnum getOperationType() {
        return operationType;
    }

    public void setOperationType(IfcTransportElementTypeEnum operationType) {
        this.operationType = operationType;
    }

    public IfcMassMeasure getCapacityByWeight() {
        return capacityByWeight;
    }

    public void setCapacityByWeight(IfcMassMeasure capacityByWeight) {
        this.capacityByWeight = capacityByWeight;
    }

    public IfcCountMeasure getCapacityByNumber() {
        return capacityByNumber;
    }

    public void setCapacityByNumber(IfcCountMeasure capacityByNumber) {
        this.capacityByNumber = capacityByNumber;
    }
}
