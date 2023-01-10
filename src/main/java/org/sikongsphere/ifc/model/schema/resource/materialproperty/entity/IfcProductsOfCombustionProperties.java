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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcSpecificHeatCapacityMeasure;

/**
 * @author:stan
 * @date:2023/1/10 22:37
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcProductsOfCombustionProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcSpecificHeatCapacityMeasure specificHeatCapacity;

    @IfcOptionField
    private IfcPositiveRatioMeasure n20Content;

    @IfcOptionField
    private IfcPositiveRatioMeasure coContent;

    @IfcOptionField
    private IfcPositiveRatioMeasure co2Content;

    @IfcParserConstructor
    public IfcProductsOfCombustionProperties(
        IfcMaterial material,
        IfcSpecificHeatCapacityMeasure specificHeatCapacity,
        IfcPositiveRatioMeasure n20Content,
        IfcPositiveRatioMeasure coContent,
        IfcPositiveRatioMeasure co2Content
    ) {
        super(material);
        this.specificHeatCapacity = specificHeatCapacity;
        this.n20Content = n20Content;
        this.coContent = coContent;
        this.co2Content = co2Content;
    }

    public IfcSpecificHeatCapacityMeasure getSpecificHeatCapacity() {
        return specificHeatCapacity;
    }

    public void setSpecificHeatCapacity(IfcSpecificHeatCapacityMeasure specificHeatCapacity) {
        this.specificHeatCapacity = specificHeatCapacity;
    }

    public IfcPositiveRatioMeasure getN20Content() {
        return n20Content;
    }

    public void setN20Content(IfcPositiveRatioMeasure n20Content) {
        this.n20Content = n20Content;
    }

    public IfcPositiveRatioMeasure getCoContent() {
        return coContent;
    }

    public void setCoContent(IfcPositiveRatioMeasure coContent) {
        this.coContent = coContent;
    }

    public IfcPositiveRatioMeasure getCo2Content() {
        return co2Content;
    }

    public void setCo2Content(IfcPositiveRatioMeasure co2Content) {
        this.co2Content = co2Content;
    }
}
