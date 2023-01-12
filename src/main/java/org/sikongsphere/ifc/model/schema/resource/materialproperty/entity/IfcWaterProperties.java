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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcBoolean;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIonConcentrationMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPHMeasure;

/**
 * Common definition to capture the properties of water typically used within the context of building services
 * and flow distribution systems.
 *
 * @author:stan
 * @date:2023/1/10 22:47
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcWaterProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcBoolean isPotable;

    @IfcOptionField
    private IfcIonConcentrationMeasure hardness;

    @IfcOptionField
    private IfcIonConcentrationMeasure alkalinityConcentration;

    @IfcOptionField
    private IfcIonConcentrationMeasure acidityConcentration;

    @IfcOptionField
    private IfcNormalisedRatioMeasure impuritiesContent;

    @IfcOptionField
    private IfcPHMeasure pHLevel;

    @IfcOptionField
    private IfcNormalisedRatioMeasure dissolvedSolidsContent;

    @IfcParserConstructor
    public IfcWaterProperties(
        IfcMaterial material,
        IfcBoolean isPotable,
        IfcIonConcentrationMeasure hardness,
        IfcIonConcentrationMeasure alkalinityConcentration,
        IfcIonConcentrationMeasure acidityConcentration,
        IfcNormalisedRatioMeasure impuritiesContent,
        IfcPHMeasure phLevel,
        IfcNormalisedRatioMeasure dissolvedSolidsContent
    ) {
        super(material);
        this.isPotable = isPotable;
        this.hardness = hardness;
        this.alkalinityConcentration = alkalinityConcentration;
        this.acidityConcentration = acidityConcentration;
        this.impuritiesContent = impuritiesContent;
        this.pHLevel = phLevel;
        this.dissolvedSolidsContent = dissolvedSolidsContent;
    }

    public IfcBoolean getIsPotable() {
        return isPotable;
    }

    public void setIsPotable(IfcBoolean isPotable) {
        this.isPotable = isPotable;
    }

    public IfcIonConcentrationMeasure getHardness() {
        return hardness;
    }

    public void setHardness(IfcIonConcentrationMeasure hardness) {
        this.hardness = hardness;
    }

    public IfcIonConcentrationMeasure getAlkalinityConcentration() {
        return alkalinityConcentration;
    }

    public void setAlkalinityConcentration(IfcIonConcentrationMeasure alkalinityConcentration) {
        this.alkalinityConcentration = alkalinityConcentration;
    }

    public IfcIonConcentrationMeasure getAcidityConcentration() {
        return acidityConcentration;
    }

    public void setAcidityConcentration(IfcIonConcentrationMeasure acidityConcentration) {
        this.acidityConcentration = acidityConcentration;
    }

    public IfcNormalisedRatioMeasure getImpuritiesContent() {
        return impuritiesContent;
    }

    public void setImpuritiesContent(IfcNormalisedRatioMeasure impuritiesContent) {
        this.impuritiesContent = impuritiesContent;
    }

    public IfcPHMeasure getPhLevel() {
        return pHLevel;
    }

    public void setPhLevel(IfcPHMeasure phLevel) {
        this.pHLevel = phLevel;
    }

    public IfcNormalisedRatioMeasure getDissolvedSolidsContent() {
        return dissolvedSolidsContent;
    }

    public void setDissolvedSolidsContent(IfcNormalisedRatioMeasure dissolvedSolidsContent) {
        this.dissolvedSolidsContent = dissolvedSolidsContent;
    }
}
