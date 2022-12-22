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
import org.sikongsphere.ifc.model.schema.domain.structuralelements.enumeration.IfcTendonTypeEnum;
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
public class IfcTendon extends IfcReinforcingElement {
    private IfcTendonTypeEnum predefinedType;
    private IfcPositiveLengthMeasure nominalDiameter;
    private IfcAreaMeasure crossSectionArea;
    @IfcOptionField
    private IfcForceMeasure tensionForce;
    @IfcOptionField
    private IfcPressureMeasure preStress;
    @IfcOptionField
    private IfcNormalisedRatioMeasure frictionCoefficient;
    @IfcOptionField
    private IfcPositiveLengthMeasure anchorageSlip;
    @IfcOptionField
    private IfcPositiveLengthMeasure minCurvatureRadius;

    public IfcTendon(
        IfcLabel steelGrade,
        IfcTendonTypeEnum predefinedType,
        IfcPositiveLengthMeasure nominalDiameter,
        IfcAreaMeasure crossSectionArea,
        IfcForceMeasure tensionForce,
        IfcPressureMeasure preStress,
        IfcNormalisedRatioMeasure frictionCoefficient,
        IfcPositiveLengthMeasure anchorageSlip,
        IfcPositiveLengthMeasure minCurvatureRadius
    ) {
        super(steelGrade);
        this.predefinedType = predefinedType;
        this.nominalDiameter = nominalDiameter;
        this.crossSectionArea = crossSectionArea;
        this.tensionForce = tensionForce;
        this.preStress = preStress;
        this.frictionCoefficient = frictionCoefficient;
        this.anchorageSlip = anchorageSlip;
        this.minCurvatureRadius = minCurvatureRadius;
    }

    @IfcParserConstructor
    public IfcTendon(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcLabel objectType,
        IfcObjectPlacement objectPlacement,
        IfcProductRepresentation representation,
        IfcIdentifier tag,
        IfcLabel steelGrade,
        IfcTendonTypeEnum predefinedType,
        IfcPositiveLengthMeasure nominalDiameter,
        IfcAreaMeasure crossSectionArea,
        IfcForceMeasure tensionForce,
        IfcPressureMeasure preStress,
        IfcNormalisedRatioMeasure frictionCoefficient,
        IfcPositiveLengthMeasure anchorageSlip,
        IfcPositiveLengthMeasure minCurvatureRadius
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
        this.predefinedType = predefinedType;
        this.nominalDiameter = nominalDiameter;
        this.crossSectionArea = crossSectionArea;
        this.tensionForce = tensionForce;
        this.preStress = preStress;
        this.frictionCoefficient = frictionCoefficient;
        this.anchorageSlip = anchorageSlip;
        this.minCurvatureRadius = minCurvatureRadius;
    }

    public IfcTendonTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcTendonTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcPositiveLengthMeasure getNominalDiameter() {
        return nominalDiameter;
    }

    public void setNominalDiameter(IfcPositiveLengthMeasure nominalDiameter) {
        this.nominalDiameter = nominalDiameter;
    }

    public IfcAreaMeasure getCrossSectionArea() {
        return crossSectionArea;
    }

    public void setCrossSectionArea(IfcAreaMeasure crossSectionArea) {
        this.crossSectionArea = crossSectionArea;
    }

    public IfcForceMeasure getTensionForce() {
        return tensionForce;
    }

    public void setTensionForce(IfcForceMeasure tensionForce) {
        this.tensionForce = tensionForce;
    }

    public IfcPressureMeasure getPreStress() {
        return preStress;
    }

    public void setPreStress(IfcPressureMeasure preStress) {
        this.preStress = preStress;
    }

    public IfcNormalisedRatioMeasure getFrictionCoefficient() {
        return frictionCoefficient;
    }

    public void setFrictionCoefficient(IfcNormalisedRatioMeasure frictionCoefficient) {
        this.frictionCoefficient = frictionCoefficient;
    }

    public IfcPositiveLengthMeasure getAnchorageSlip() {
        return anchorageSlip;
    }

    public void setAnchorageSlip(IfcPositiveLengthMeasure anchorageSlip) {
        this.anchorageSlip = anchorageSlip;
    }

    public IfcPositiveLengthMeasure getMinCurvatureRadius() {
        return minCurvatureRadius;
    }

    public void setMinCurvatureRadius(IfcPositiveLengthMeasure minCurvatureRadius) {
        this.minCurvatureRadius = minCurvatureRadius;
    }
}
