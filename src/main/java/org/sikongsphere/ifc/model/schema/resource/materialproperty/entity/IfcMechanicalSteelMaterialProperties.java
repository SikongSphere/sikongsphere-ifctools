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
 * This is a collection of mechanical properties related to steel (or other metallic and isotropic) materials.
 *
 * @author:stan
 * @date:2023/1/10 21:50
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMechanicalSteelMaterialProperties extends IfcMechanicalMaterialProperties {

    @IfcOptionField
    private IfcPressureMeasure yieldStress;

    @IfcOptionField
    private IfcPressureMeasure ultimateStress;

    @IfcOptionField
    private IfcPositiveRatioMeasure ultimateStrain;

    @IfcOptionField
    private IfcModulusOfElasticityMeasure hardeningModule;

    @IfcOptionField
    private IfcPressureMeasure proportionalStress;

    @IfcOptionField
    private IfcPositiveRatioMeasure plasticStrain;

    @IfcOptionField
    private SET<IfcRelaxation> relaxations;

    @IfcParserConstructor
    public IfcMechanicalSteelMaterialProperties(
        IfcMaterial material,
        IfcDynamicViscosityMeasure dynamicViscosity,
        IfcModulusOfElasticityMeasure youngModulus,
        IfcModulusOfElasticityMeasure shearModulus,
        IfcPositiveRatioMeasure poissonRatio,
        IfcThermalExpansionCoefficientMeasure thermalExpansionCoefficient,
        IfcPressureMeasure yieldStress,
        IfcPressureMeasure ultimateStress,
        IfcPositiveRatioMeasure ultimateStrain,
        IfcModulusOfElasticityMeasure hardeningModule,
        IfcPressureMeasure proportionalStress,
        IfcPositiveRatioMeasure plasticStrain,
        SET<IfcRelaxation> relaxations
    ) {
        super(
            material,
            dynamicViscosity,
            youngModulus,
            shearModulus,
            poissonRatio,
            thermalExpansionCoefficient
        );
        this.yieldStress = yieldStress;
        this.ultimateStress = ultimateStress;
        this.ultimateStrain = ultimateStrain;
        this.hardeningModule = hardeningModule;
        this.proportionalStress = proportionalStress;
        this.plasticStrain = plasticStrain;
        this.relaxations = relaxations;
    }

    public IfcPressureMeasure getYieldStress() {
        return yieldStress;
    }

    public void setYieldStress(IfcPressureMeasure yieldStress) {
        this.yieldStress = yieldStress;
    }

    public IfcPressureMeasure getUltimateStress() {
        return ultimateStress;
    }

    public void setUltimateStress(IfcPressureMeasure ultimateStress) {
        this.ultimateStress = ultimateStress;
    }

    public IfcPositiveRatioMeasure getUltimateStrain() {
        return ultimateStrain;
    }

    public void setUltimateStrain(IfcPositiveRatioMeasure ultimateStrain) {
        this.ultimateStrain = ultimateStrain;
    }

    public IfcModulusOfElasticityMeasure getHardeningModule() {
        return hardeningModule;
    }

    public void setHardeningModule(IfcModulusOfElasticityMeasure hardeningModule) {
        this.hardeningModule = hardeningModule;
    }

    public IfcPressureMeasure getProportionalStress() {
        return proportionalStress;
    }

    public void setProportionalStress(IfcPressureMeasure proportionalStress) {
        this.proportionalStress = proportionalStress;
    }

    public IfcPositiveRatioMeasure getPlasticStrain() {
        return plasticStrain;
    }

    public void setPlasticStrain(IfcPositiveRatioMeasure plasticStrain) {
        this.plasticStrain = plasticStrain;
    }

    public SET<IfcRelaxation> getRelaxations() {
        return relaxations;
    }

    public void setRelaxations(SET<IfcRelaxation> relaxations) {
        this.relaxations = relaxations;
    }
}
