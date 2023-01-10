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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcMassDensityMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcMolecularWeightMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;

/**
 * @author:stan
 * @date:2023/1/10 21:34
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGeneralMaterialProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcMolecularWeightMeasure molecularWeight;

    @IfcOptionField
    private IfcNormalisedRatioMeasure porosity;

    @IfcOptionField
    private IfcMassDensityMeasure massDensity;

    @IfcParserConstructor
    public IfcGeneralMaterialProperties(
        IfcMaterial material,
        IfcMolecularWeightMeasure molecularWeight,
        IfcNormalisedRatioMeasure porosity,
        IfcMassDensityMeasure massDensity
    ) {
        super(material);
        this.molecularWeight = molecularWeight;
        this.porosity = porosity;
        this.massDensity = massDensity;
    }

    public IfcMolecularWeightMeasure getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(IfcMolecularWeightMeasure molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public IfcNormalisedRatioMeasure getPorosity() {
        return porosity;
    }

    public void setPorosity(IfcNormalisedRatioMeasure porosity) {
        this.porosity = porosity;
    }

    public IfcMassDensityMeasure getMassDensity() {
        return massDensity;
    }

    public void setMassDensity(IfcMassDensityMeasure massDensity) {
        this.massDensity = massDensity;
    }
}
