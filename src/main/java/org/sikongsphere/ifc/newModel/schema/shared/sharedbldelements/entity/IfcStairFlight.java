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
package org.sikongsphere.ifc.newModel.schema.shared.sharedbldelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.INTEGER;
import org.sikongsphere.ifc.newModel.schema.core.productextension.entities.IfcBuildingElement;
import org.sikongsphere.ifc.newModel.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.newModel.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.newModel.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zhongqi
 * @date 2022/11/1
 */

@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcStairFlight extends IfcBuildingElement {
    private INTEGER numberOfRiser;
    private INTEGER numberOfTreads;
    private IfcPositiveLengthMeasure riserHeight;
    private IfcPositiveLengthMeasure treadLength;

    public IfcStairFlight() {}

    @IfcParserConstructor
    public IfcStairFlight(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        INTEGER numberOfRiser,
        INTEGER numberOfTreads,
        IfcPositiveLengthMeasure riserHeight,
        IfcPositiveLengthMeasure treadLength
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
        this.numberOfRiser = numberOfRiser;
        this.numberOfTreads = numberOfTreads;
        this.riserHeight = riserHeight;
        this.treadLength = treadLength;
    }

    public INTEGER getNumberOfRiser() {
        return numberOfRiser;
    }

    public void setNumberOfRiser(INTEGER numberOfRiser) {
        this.numberOfRiser = numberOfRiser;
    }

    public INTEGER getNumberOfTreads() {
        return numberOfTreads;
    }

    public void setNumberOfTreads(INTEGER numberOfTreads) {
        this.numberOfTreads = numberOfTreads;
    }

    public IfcPositiveLengthMeasure getRiserHeight() {
        return riserHeight;
    }

    public void setRiserHeight(IfcPositiveLengthMeasure riserHeight) {
        this.riserHeight = riserHeight;
    }

    public IfcPositiveLengthMeasure getTreadLength() {
        return treadLength;
    }

    public void setTreadLength(IfcPositiveLengthMeasure treadLength) {
        this.treadLength = treadLength;
    }
}
