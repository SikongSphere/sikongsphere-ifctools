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
package org.sikongsphere.ifc.newModel.schema.core.productextension.entities;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.core.productextension.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.newModel.schema.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.newModel.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * Construction work that has the provision of shelter for its occupants or contents
 * as one of its main purpose and is normally designed to stand permanently in one place.
 *
 * @author stan
 * @date 2022/09/01 23:15
 */
@IfcClass(layer = IfcLayer.CORE, type = IfcType.ENTITY)
public class IfcBuilding extends IfcSpatialStructureElement {
    private IfcLengthMeasure elevationOfRefHeight;
    private IfcLengthMeasure elevationOfRefTerrain;
    private IfcPostalAddress buildingAddress;

    public IfcBuilding() {}

    public IfcBuilding(
        IfcLengthMeasure elevationOfRefHeight,
        IfcLengthMeasure elevationOfRefTerrain,
        IfcPostalAddress buildingAddress
    ) {
        this.elevationOfRefHeight = elevationOfRefHeight;
        this.elevationOfRefTerrain = elevationOfRefTerrain;
        this.buildingAddress = buildingAddress;
    }

    @IfcParserConstructor
    public IfcBuilding(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcLabel longName,
        IfcElementCompositionEnum compositionType,
        IfcLengthMeasure elevationOfRefHeight,
        IfcLengthMeasure elevationOfRefTerrain,
        IfcPostalAddress buildingAddress
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
        this.elevationOfRefHeight = elevationOfRefHeight;
        this.elevationOfRefTerrain = elevationOfRefTerrain;
        this.buildingAddress = buildingAddress;
    }

    public IfcLengthMeasure getElevationOfRefHeight() {
        return elevationOfRefHeight;
    }

    public void setElevationOfRefHeight(IfcLengthMeasure elevationOfRefHeight) {
        this.elevationOfRefHeight = elevationOfRefHeight;
    }

    public IfcLengthMeasure getElevationOfRefTerrain() {
        return elevationOfRefTerrain;
    }

    public void setElevationOfRefTerrain(IfcLengthMeasure elevationOfRefTerrain) {
        this.elevationOfRefTerrain = elevationOfRefTerrain;
    }

    public IfcPostalAddress getBuildingAddress() {
        return buildingAddress;
    }

    public void setBuildingAddress(IfcPostalAddress buildingAddress) {
        this.buildingAddress = buildingAddress;
    }
}
