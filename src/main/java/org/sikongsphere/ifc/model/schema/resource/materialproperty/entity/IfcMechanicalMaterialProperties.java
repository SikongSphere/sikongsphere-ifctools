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
 * This is a collection of mechanical material properties normally used for structural analysis purpose.
 *
 * @author:stan
 * @date:2023/1/10 21:26
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMechanicalMaterialProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcDynamicViscosityMeasure dynamicViscosity;

    @IfcOptionField
    private IfcModulusOfElasticityMeasure youngModulus;

    @IfcOptionField
    private IfcModulusOfElasticityMeasure shearModulus;

    @IfcOptionField
    private IfcPositiveRatioMeasure poissonRatio;

    @IfcOptionField
    private IfcThermalExpansionCoefficientMeasure thermalExpansionCoefficient;

    @IfcParserConstructor
    public IfcMechanicalMaterialProperties(
        IfcMaterial material,
        IfcDynamicViscosityMeasure dynamicViscosity,
        IfcModulusOfElasticityMeasure youngModulus,
        IfcModulusOfElasticityMeasure shearModulus,
        IfcPositiveRatioMeasure poissonRatio,
        IfcThermalExpansionCoefficientMeasure thermalExpansionCoefficient
    ) {
        super(material);
        this.dynamicViscosity = dynamicViscosity;
        this.youngModulus = youngModulus;
        this.shearModulus = shearModulus;
        this.poissonRatio = poissonRatio;
        this.thermalExpansionCoefficient = thermalExpansionCoefficient;
    }

    public IfcDynamicViscosityMeasure getDynamicViscosity() {
        return dynamicViscosity;
    }

    public void setDynamicViscosity(IfcDynamicViscosityMeasure dynamicViscosity) {
        this.dynamicViscosity = dynamicViscosity;
    }

    public IfcModulusOfElasticityMeasure getYoungModulus() {
        return youngModulus;
    }

    public void setYoungModulus(IfcModulusOfElasticityMeasure youngModulus) {
        this.youngModulus = youngModulus;
    }

    public IfcModulusOfElasticityMeasure getShearModulus() {
        return shearModulus;
    }

    public void setShearModulus(IfcModulusOfElasticityMeasure shearModulus) {
        this.shearModulus = shearModulus;
    }

    public IfcPositiveRatioMeasure getPoissonRatio() {
        return poissonRatio;
    }

    public void setPoissonRatio(IfcPositiveRatioMeasure poissonRatio) {
        this.poissonRatio = poissonRatio;
    }

    public IfcThermalExpansionCoefficientMeasure getThermalExpansionCoefficient() {
        return thermalExpansionCoefficient;
    }

    public void setThermalExpansionCoefficient(
        IfcThermalExpansionCoefficientMeasure thermalExpansionCoefficient
    ) {
        this.thermalExpansionCoefficient = thermalExpansionCoefficient;
    }
}
