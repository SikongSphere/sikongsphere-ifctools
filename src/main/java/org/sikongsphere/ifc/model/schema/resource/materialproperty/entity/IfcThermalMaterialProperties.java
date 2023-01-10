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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcSpecificHeatCapacityMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcThermalConductivityMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcThermodynamicTemperatureMeasure;

/**
 * @author:stan
 * @date:2023/1/10 22:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcThermalMaterialProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcSpecificHeatCapacityMeasure specificHeatCapacity;

    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure boilingPoint;

    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure freezingPoint;

    @IfcOptionField
    private IfcThermalConductivityMeasure thermalConductivity;

    @IfcParserConstructor
    public IfcThermalMaterialProperties(
        IfcMaterial material,
        IfcSpecificHeatCapacityMeasure specificHeatCapacity,
        IfcThermodynamicTemperatureMeasure boilingPoint,
        IfcThermodynamicTemperatureMeasure freezingPoint,
        IfcThermalConductivityMeasure thermalConductivity
    ) {
        super(material);
        this.specificHeatCapacity = specificHeatCapacity;
        this.boilingPoint = boilingPoint;
        this.freezingPoint = freezingPoint;
        this.thermalConductivity = thermalConductivity;
    }

    public IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity() {
        return specificHeatCapacity;
    }

    public void setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure specificHeatCapacity) {
        this.specificHeatCapacity = specificHeatCapacity;
    }

    public IfcThermodynamicTemperatureMeasure getBoilingPoint() {
        return boilingPoint;
    }

    public void setBoilingPoint(IfcThermodynamicTemperatureMeasure boilingPoint) {
        this.boilingPoint = boilingPoint;
    }

    public IfcThermodynamicTemperatureMeasure getFreezingPoint() {
        return freezingPoint;
    }

    public void setFreezingPoint(IfcThermodynamicTemperatureMeasure freezingPoint) {
        this.freezingPoint = freezingPoint;
    }

    public IfcThermalConductivityMeasure getThermalConductivity() {
        return thermalConductivity;
    }

    public void setThermalConductivity(IfcThermalConductivityMeasure thermalConductivity) {
        this.thermalConductivity = thermalConductivity;
    }
}
