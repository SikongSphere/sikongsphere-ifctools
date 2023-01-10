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
package org.sikongsphere.ifc.model.schema.resource.materialproperty.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.material.entity.IfcMaterial;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;

/**
 * @author:stan
 * @date:2023/1/10 21:37
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMechanicalConcreteMaterialProperties extends IfcMechanicalMaterialProperties {

    @IfcOptionField
    private IfcPressureMeasure compressiveStrength;

    @IfcOptionField
    private IfcPositiveLengthMeasure maxAggregateSize;

    @IfcOptionField
    private IfcText workAbility;

    @IfcOptionField
    private IfcNormalisedRatioMeasure protectivePoreRatio;

    @IfcOptionField
    private IfcText waterImpermeability;

    @IfcParserConstructor
    public IfcMechanicalConcreteMaterialProperties(
        IfcMaterial material,
        IfcDynamicViscosityMeasure dynamicViscosity,
        IfcModulusOfElasticityMeasure youngModulus,
        IfcModulusOfElasticityMeasure shearModulus,
        IfcPositiveRatioMeasure poissonRatio,
        IfcThermalExpansionCoefficientMeasure thermalExpansionCoefficient,
        IfcPressureMeasure compressiveStrength,
        IfcPositiveLengthMeasure maxAggregateSize,
        IfcText workAbility,
        IfcNormalisedRatioMeasure protectivePoreRatio,
        IfcText waterImpermeability
    ) {
        super(
            material,
            dynamicViscosity,
            youngModulus,
            shearModulus,
            poissonRatio,
            thermalExpansionCoefficient
        );
        this.compressiveStrength = compressiveStrength;
        this.maxAggregateSize = maxAggregateSize;
        this.workAbility = workAbility;
        this.protectivePoreRatio = protectivePoreRatio;
        this.waterImpermeability = waterImpermeability;
    }

    public IfcPressureMeasure getCompressiveStrength() {
        return compressiveStrength;
    }

    public void setCompressiveStrength(IfcPressureMeasure compressiveStrength) {
        this.compressiveStrength = compressiveStrength;
    }

    public IfcPositiveLengthMeasure getMaxAggregateSize() {
        return maxAggregateSize;
    }

    public void setMaxAggregateSize(IfcPositiveLengthMeasure maxAggregateSize) {
        this.maxAggregateSize = maxAggregateSize;
    }

    public IfcText getWorkAbility() {
        return workAbility;
    }

    public void setWorkAbility(IfcText workAbility) {
        this.workAbility = workAbility;
    }

    public IfcNormalisedRatioMeasure getProtectivePoreRatio() {
        return protectivePoreRatio;
    }

    public void setProtectivePoreRatio(IfcNormalisedRatioMeasure protectivePoreRatio) {
        this.protectivePoreRatio = protectivePoreRatio;
    }

    public IfcText getWaterImpermeability() {
        return waterImpermeability;
    }

    public void setWaterImpermeability(IfcText waterImpermeability) {
        this.waterImpermeability = waterImpermeability;
    }
}
