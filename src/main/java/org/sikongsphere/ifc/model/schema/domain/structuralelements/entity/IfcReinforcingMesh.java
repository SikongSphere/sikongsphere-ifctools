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
package org.sikongsphere.ifc.model.schema.domain.structuralelements.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcObjectPlacement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author yiwei
 * @date 2022/12/19 21:40
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENTITY)
public class IfcReinforcingMesh extends IfcReinforcingElement {
    @IfcOptionField
    private IfcPositiveLengthMeasure meshLength;
    @IfcOptionField
    private IfcPositiveLengthMeasure meshWidth;
    private IfcPositiveLengthMeasure longitudinalBarNominalDiameter;
    private IfcPositiveLengthMeasure transverseBarNominalDiameter;
    private IfcAreaMeasure longitudinalBarCrossSectionArea;
    private IfcAreaMeasure transverseBarCrossSectionArea;
    private IfcPositiveLengthMeasure longitudinalBarSpacing;
    private IfcPositiveLengthMeasure transverseBarSpacing;

    public IfcReinforcingMesh(
        IfcLabel steelGrade,
        IfcPositiveLengthMeasure meshLength,
        IfcPositiveLengthMeasure meshWidth,
        IfcPositiveLengthMeasure longitudinalBarNominalDiameter,
        IfcPositiveLengthMeasure transverseBarNominalDiameter,
        IfcAreaMeasure longitudinalBarCrossSectionArea,
        IfcAreaMeasure transverseBarCrossSectionArea,
        IfcPositiveLengthMeasure longitudinalBarSpacing,
        IfcPositiveLengthMeasure transverseBarSpacing
    ) {
        super(steelGrade);
        this.meshLength = meshLength;
        this.meshWidth = meshWidth;
        this.longitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
        this.transverseBarNominalDiameter = transverseBarNominalDiameter;
        this.longitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
        this.transverseBarCrossSectionArea = transverseBarCrossSectionArea;
        this.longitudinalBarSpacing = longitudinalBarSpacing;
        this.transverseBarSpacing = transverseBarSpacing;
    }

    @IfcParserConstructor
    public IfcReinforcingMesh(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcLabel steelGrade,
        IfcPositiveLengthMeasure meshLength,
        IfcPositiveLengthMeasure meshWidth,
        IfcPositiveLengthMeasure longitudinalBarNominalDiameter,
        IfcPositiveLengthMeasure transverseBarNominalDiameter,
        IfcAreaMeasure longitudinalBarCrossSectionArea,
        IfcAreaMeasure transverseBarCrossSectionArea,
        IfcPositiveLengthMeasure longitudinalBarSpacing,
        IfcPositiveLengthMeasure transverseBarSpacing
    ) {
        super(
            globalId,
            ownerHistory,
            name,
            description,
            objectType,
            objectPlacement,
            representation,
            tag,
            steelGrade
        );
        this.meshLength = meshLength;
        this.meshWidth = meshWidth;
        this.longitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
        this.transverseBarNominalDiameter = transverseBarNominalDiameter;
        this.longitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
        this.transverseBarCrossSectionArea = transverseBarCrossSectionArea;
        this.longitudinalBarSpacing = longitudinalBarSpacing;
        this.transverseBarSpacing = transverseBarSpacing;
    }

    public IfcPositiveLengthMeasure getMeshLength() {
        return meshLength;
    }

    public void setMeshLength(IfcPositiveLengthMeasure meshLength) {
        this.meshLength = meshLength;
    }

    public IfcPositiveLengthMeasure getMeshWidth() {
        return meshWidth;
    }

    public void setMeshWidth(IfcPositiveLengthMeasure meshWidth) {
        this.meshWidth = meshWidth;
    }

    public IfcPositiveLengthMeasure getLongitudinalBarNominalDiameter() {
        return longitudinalBarNominalDiameter;
    }

    public void setLongitudinalBarNominalDiameter(
        IfcPositiveLengthMeasure longitudinalBarNominalDiameter
    ) {
        this.longitudinalBarNominalDiameter = longitudinalBarNominalDiameter;
    }

    public IfcPositiveLengthMeasure getTransverseBarNominalDiameter() {
        return transverseBarNominalDiameter;
    }

    public void setTransverseBarNominalDiameter(
        IfcPositiveLengthMeasure transverseBarNominalDiameter
    ) {
        this.transverseBarNominalDiameter = transverseBarNominalDiameter;
    }

    public IfcAreaMeasure getLongitudinalBarCrossSectionArea() {
        return longitudinalBarCrossSectionArea;
    }

    public void setLongitudinalBarCrossSectionArea(IfcAreaMeasure longitudinalBarCrossSectionArea) {
        this.longitudinalBarCrossSectionArea = longitudinalBarCrossSectionArea;
    }

    public IfcAreaMeasure getTransverseBarCrossSectionArea() {
        return transverseBarCrossSectionArea;
    }

    public void setTransverseBarCrossSectionArea(IfcAreaMeasure transverseBarCrossSectionArea) {
        this.transverseBarCrossSectionArea = transverseBarCrossSectionArea;
    }

    public IfcPositiveLengthMeasure getLongitudinalBarSpacing() {
        return longitudinalBarSpacing;
    }

    public void setLongitudinalBarSpacing(IfcPositiveLengthMeasure longitudinalBarSpacing) {
        this.longitudinalBarSpacing = longitudinalBarSpacing;
    }

    public IfcPositiveLengthMeasure getTransverseBarSpacing() {
        return transverseBarSpacing;
    }

    public void setTransverseBarSpacing(IfcPositiveLengthMeasure transverseBarSpacing) {
        this.transverseBarSpacing = transverseBarSpacing;
    }
}
