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
package org.sikongsphere.ifc.model.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.core.productextension.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLengthMeasure;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.resource.utility.entity.IfcOwnerHistory;

/**
 * The building storey has an elevation and typically represents a (nearly) horizontal aggregation
 * of spaces that are vertically bound.
 *
 * @author stan
 * @date 2022/09/01 23:06
 */

@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcBuildingStorey extends IfcSpatialStructureElement {
    private IfcLengthMeasure elevation;

    public IfcBuildingStorey() {}

    @IfcParserConstructor
    public IfcBuildingStorey(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcLabel longName,
        IfcElementCompositionEnum compositionType,
        IfcLengthMeasure elevation
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            longName,
            compositionType
        );
        this.elevation = elevation;
    }

    public IfcBuildingStorey(IfcLengthMeasure elevation) {
        this.elevation = elevation;
    }

    public IfcLengthMeasure getElevation() {
        return elevation;
    }

    public void setElevation(IfcLengthMeasure elevation) {
        this.elevation = elevation;
    }
}
