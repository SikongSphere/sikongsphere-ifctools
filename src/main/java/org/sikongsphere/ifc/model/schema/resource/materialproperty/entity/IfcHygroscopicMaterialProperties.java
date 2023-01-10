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
import org.sikongsphere.ifc.model.schema.resource.material.entity.IfcMaterial;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIsothermalMoistureCapacityMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcMoistureDiffusivityMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcVaporPermeabilityMeasure;

/**
 * @author:stan
 * @date:2023/1/10 21:45
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcHygroscopicMaterialProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcPositiveRatioMeasure upperVaporResistanceFactor;

    @IfcOptionField
    private IfcPositiveRatioMeasure lowerVaporResistanceFactor;

    @IfcOptionField
    private IfcIsothermalMoistureCapacityMeasure isothermalMoistureCapacity;

    @IfcOptionField
    private IfcVaporPermeabilityMeasure vaporPermeability;

    @IfcOptionField
    private IfcMoistureDiffusivityMeasure moistureDiffusivity;

    @IfcParserConstructor
    public IfcHygroscopicMaterialProperties(
        IfcMaterial material,
        IfcPositiveRatioMeasure upperVaporResistanceFactor,
        IfcPositiveRatioMeasure lowerVaporResistanceFactor,
        IfcIsothermalMoistureCapacityMeasure isothermalMoistureCapacity,
        IfcVaporPermeabilityMeasure vaporPermeability,
        IfcMoistureDiffusivityMeasure moistureDiffusivity
    ) {
        super(material);
        this.upperVaporResistanceFactor = upperVaporResistanceFactor;
        this.lowerVaporResistanceFactor = lowerVaporResistanceFactor;
        this.isothermalMoistureCapacity = isothermalMoistureCapacity;
        this.vaporPermeability = vaporPermeability;
        this.moistureDiffusivity = moistureDiffusivity;
    }

    public IfcPositiveRatioMeasure getUpperVaporResistanceFactor() {
        return upperVaporResistanceFactor;
    }

    public void setUpperVaporResistanceFactor(IfcPositiveRatioMeasure upperVaporResistanceFactor) {
        this.upperVaporResistanceFactor = upperVaporResistanceFactor;
    }

    public IfcPositiveRatioMeasure getLowerVaporResistanceFactor() {
        return lowerVaporResistanceFactor;
    }

    public void setLowerVaporResistanceFactor(IfcPositiveRatioMeasure lowerVaporResistanceFactor) {
        this.lowerVaporResistanceFactor = lowerVaporResistanceFactor;
    }

    public IfcIsothermalMoistureCapacityMeasure getIsothermalMoistureCapacity() {
        return isothermalMoistureCapacity;
    }

    public void setIsothermalMoistureCapacity(
        IfcIsothermalMoistureCapacityMeasure isothermalMoistureCapacity
    ) {
        this.isothermalMoistureCapacity = isothermalMoistureCapacity;
    }

    public IfcVaporPermeabilityMeasure getVaporPermeability() {
        return vaporPermeability;
    }

    public void setVaporPermeability(IfcVaporPermeabilityMeasure vaporPermeability) {
        this.vaporPermeability = vaporPermeability;
    }

    public IfcMoistureDiffusivityMeasure getMoistureDiffusivity() {
        return moistureDiffusivity;
    }

    public void setMoistureDiffusivity(IfcMoistureDiffusivityMeasure moistureDiffusivity) {
        this.moistureDiffusivity = moistureDiffusivity;
    }
}
