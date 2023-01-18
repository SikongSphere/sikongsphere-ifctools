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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcHeatingValueMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcThermodynamicTemperatureMeasure;

/**
 * Common definition to capture the properties of fuel energy typically used within the context of building
 * services and flow distribution systems.
 *
 * @author:stan
 * @date:2023/1/10 21:29
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFuelProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure combustionTemperature;

    @IfcOptionField
    private IfcPositiveRatioMeasure carbonContent;

    @IfcOptionField
    private IfcHeatingValueMeasure lowerHeatingValue;

    @IfcOptionField
    private IfcHeatingValueMeasure higherHeatingValue;

    @IfcParserConstructor
    public IfcFuelProperties(
        IfcMaterial material,
        IfcThermodynamicTemperatureMeasure combustionTemperature,
        IfcPositiveRatioMeasure carbonContent,
        IfcHeatingValueMeasure lowerHeatingValue,
        IfcHeatingValueMeasure higherHeatingValue
    ) {
        super(material);
        this.combustionTemperature = combustionTemperature;
        this.carbonContent = carbonContent;
        this.lowerHeatingValue = lowerHeatingValue;
        this.higherHeatingValue = higherHeatingValue;
    }

    public IfcThermodynamicTemperatureMeasure getCombustionTemperature() {
        return combustionTemperature;
    }

    public void setCombustionTemperature(IfcThermodynamicTemperatureMeasure combustionTemperature) {
        this.combustionTemperature = combustionTemperature;
    }

    public IfcPositiveRatioMeasure getCarbonContent() {
        return carbonContent;
    }

    public void setCarbonContent(IfcPositiveRatioMeasure carbonContent) {
        this.carbonContent = carbonContent;
    }

    public IfcHeatingValueMeasure getLowerHeatingValue() {
        return lowerHeatingValue;
    }

    public void setLowerHeatingValue(IfcHeatingValueMeasure lowerHeatingValue) {
        this.lowerHeatingValue = lowerHeatingValue;
    }

    public IfcHeatingValueMeasure getHigherHeatingValue() {
        return higherHeatingValue;
    }

    public void setHigherHeatingValue(IfcHeatingValueMeasure higherHeatingValue) {
        this.higherHeatingValue = higherHeatingValue;
    }
}
