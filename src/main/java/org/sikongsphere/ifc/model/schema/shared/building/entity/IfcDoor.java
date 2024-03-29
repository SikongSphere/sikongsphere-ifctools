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
package org.sikongsphere.ifc.model.schema.shared.building.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuildingElement;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * Construction for closing an opening, intended primarily for access with hinged, pivoted or sliding operation.
 * @author Wang Bohong
 * @date 2022/10/25 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcDoor extends IfcBuildingElement {

    @IfcOptionField
    private IfcPositiveLengthMeasure overallHeight;

    @IfcOptionField
    private IfcPositiveLengthMeasure overallWidth;

    public IfcDoor() {}

    @IfcParserConstructor
    public IfcDoor(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcPositiveLengthMeasure overallHeight,
        IfcPositiveLengthMeasure overallWidth
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
        this.overallHeight = overallHeight;
        this.overallWidth = overallWidth;
    }

    public IfcPositiveLengthMeasure getOverallHeight() {
        return overallHeight;
    }

    public void setOverallHeight(IfcPositiveLengthMeasure overallHeight) {
        this.overallHeight = overallHeight;
    }

    public IfcPositiveLengthMeasure getOverallWidth() {
        return overallWidth;
    }

    public void setOverallWidth(IfcPositiveLengthMeasure overallWidth) {
        this.overallWidth = overallWidth;
    }
}
