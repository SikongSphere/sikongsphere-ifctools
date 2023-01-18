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
package org.sikongsphere.ifc.model.schema.domain.architecture.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSpatialStructureElement;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcControl;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAssignsToControl;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcAreaMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcSpaceProgram extends IfcControl {
    private IfcIdentifier spaceProgramIdentifier;
    @IfcOptionField
    private IfcAreaMeasure maxRequiredArea;
    @IfcOptionField
    private IfcAreaMeasure minRequiredArea;
    @IfcOptionField
    private IfcSpatialStructureElement requestedLocation;
    private IfcAreaMeasure standardRequiredArea;

    @IfcInverseParameter
    private SET<IfcRelInteractionRequirements> hasInteractionReqsFrom;
    @IfcInverseParameter
    private SET<IfcRelInteractionRequirements> hasInteractionReqsTo;

    @IfcParserConstructor
    public IfcSpaceProgram(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        SET<IfcRelAssignsToControl> controls,
        IfcIdentifier spaceProgramIdentifier,
        IfcAreaMeasure maxRequiredArea,
        IfcAreaMeasure minRequiredArea,
        IfcSpatialStructureElement requestedLocation,
        IfcAreaMeasure standardRequiredArea
    ) {
        super(globalId, ownerHistory, name, description, objectType, controls);
        this.spaceProgramIdentifier = spaceProgramIdentifier;
        this.maxRequiredArea = maxRequiredArea;
        this.minRequiredArea = minRequiredArea;
        this.requestedLocation = requestedLocation;
        this.standardRequiredArea = standardRequiredArea;
    }

    public IfcIdentifier getSpaceProgramIdentifier() {
        return spaceProgramIdentifier;
    }

    public void setSpaceProgramIdentifier(IfcIdentifier spaceProgramIdentifier) {
        this.spaceProgramIdentifier = spaceProgramIdentifier;
    }

    public IfcAreaMeasure getMaxRequiredArea() {
        return maxRequiredArea;
    }

    public void setMaxRequiredArea(IfcAreaMeasure maxRequiredArea) {
        this.maxRequiredArea = maxRequiredArea;
    }

    public IfcAreaMeasure getMinRequiredArea() {
        return minRequiredArea;
    }

    public void setMinRequiredArea(IfcAreaMeasure minRequiredArea) {
        this.minRequiredArea = minRequiredArea;
    }

    public IfcSpatialStructureElement getRequestedLocation() {
        return requestedLocation;
    }

    public void setRequestedLocation(IfcSpatialStructureElement requestedLocation) {
        this.requestedLocation = requestedLocation;
    }

    public IfcAreaMeasure getStandardRequiredArea() {
        return standardRequiredArea;
    }

    public void setStandardRequiredArea(IfcAreaMeasure standardRequiredArea) {
        this.standardRequiredArea = standardRequiredArea;
    }

    public SET<IfcRelInteractionRequirements> getHasInteractionReqsFrom() {
        return hasInteractionReqsFrom;
    }

    public void setHasInteractionReqsFrom(
        SET<IfcRelInteractionRequirements> hasInteractionReqsFrom
    ) {
        this.hasInteractionReqsFrom = hasInteractionReqsFrom;
    }

    public SET<IfcRelInteractionRequirements> getHasInteractionReqsTo() {
        return hasInteractionReqsTo;
    }

    public void setHasInteractionReqsTo(SET<IfcRelInteractionRequirements> hasInteractionReqsTo) {
        this.hasInteractionReqsTo = hasInteractionReqsTo;
    }
}
