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

/**
 * @author:stan
 * @date:2023/1/10 21:57
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcOpticalMaterialProperties extends IfcMaterialProperties {

    @IfcOptionField
    private IfcPositiveRatioMeasure visibleTransmittance;

    @IfcOptionField
    private IfcPositiveRatioMeasure solarTransmittance;

    @IfcOptionField
    private IfcPositiveRatioMeasure thermalIrTransmittance;

    @IfcOptionField
    private IfcPositiveRatioMeasure thermalIrEmissivityFront;

    @IfcOptionField
    private IfcPositiveRatioMeasure visibleReflectanceBack;

    @IfcOptionField
    private IfcPositiveRatioMeasure visibleReflectanceFront;

    @IfcOptionField
    private IfcPositiveRatioMeasure solarReflectanceFront;

    @IfcOptionField
    private IfcPositiveRatioMeasure soloarReflectanceBack;

    @IfcParserConstructor
    public IfcOpticalMaterialProperties(
        IfcMaterial material,
        IfcPositiveRatioMeasure visibleTransmittance,
        IfcPositiveRatioMeasure solarTransmittance,
        IfcPositiveRatioMeasure thermalIrTransmittance,
        IfcPositiveRatioMeasure thermalIrEmissivityFront,
        IfcPositiveRatioMeasure visibleReflectanceBack,
        IfcPositiveRatioMeasure visibleReflectanceFront,
        IfcPositiveRatioMeasure solarReflectanceFront,
        IfcPositiveRatioMeasure soloarReflectanceBack
    ) {
        super(material);
        this.visibleTransmittance = visibleTransmittance;
        this.solarTransmittance = solarTransmittance;
        this.thermalIrTransmittance = thermalIrTransmittance;
        this.thermalIrEmissivityFront = thermalIrEmissivityFront;
        this.visibleReflectanceBack = visibleReflectanceBack;
        this.visibleReflectanceFront = visibleReflectanceFront;
        this.solarReflectanceFront = solarReflectanceFront;
        this.soloarReflectanceBack = soloarReflectanceBack;
    }

    public IfcPositiveRatioMeasure getVisibleTransmittance() {
        return visibleTransmittance;
    }

    public void setVisibleTransmittance(IfcPositiveRatioMeasure visibleTransmittance) {
        this.visibleTransmittance = visibleTransmittance;
    }

    public IfcPositiveRatioMeasure getSolarTransmittance() {
        return solarTransmittance;
    }

    public void setSolarTransmittance(IfcPositiveRatioMeasure solarTransmittance) {
        this.solarTransmittance = solarTransmittance;
    }

    public IfcPositiveRatioMeasure getThermalIrTransmittance() {
        return thermalIrTransmittance;
    }

    public void setThermalIrTransmittance(IfcPositiveRatioMeasure thermalIrTransmittance) {
        this.thermalIrTransmittance = thermalIrTransmittance;
    }

    public IfcPositiveRatioMeasure getThermalIrEmissivityFront() {
        return thermalIrEmissivityFront;
    }

    public void setThermalIrEmissivityFront(IfcPositiveRatioMeasure thermalIrEmissivityFront) {
        this.thermalIrEmissivityFront = thermalIrEmissivityFront;
    }

    public IfcPositiveRatioMeasure getVisibleReflectanceBack() {
        return visibleReflectanceBack;
    }

    public void setVisibleReflectanceBack(IfcPositiveRatioMeasure visibleReflectanceBack) {
        this.visibleReflectanceBack = visibleReflectanceBack;
    }

    public IfcPositiveRatioMeasure getVisibleReflectanceFront() {
        return visibleReflectanceFront;
    }

    public void setVisibleReflectanceFront(IfcPositiveRatioMeasure visibleReflectanceFront) {
        this.visibleReflectanceFront = visibleReflectanceFront;
    }

    public IfcPositiveRatioMeasure getSolarReflectanceFront() {
        return solarReflectanceFront;
    }

    public void setSolarReflectanceFront(IfcPositiveRatioMeasure solarReflectanceFront) {
        this.solarReflectanceFront = solarReflectanceFront;
    }

    public IfcPositiveRatioMeasure getSoloarReflectanceBack() {
        return soloarReflectanceBack;
    }

    public void setSoloarReflectanceBack(IfcPositiveRatioMeasure soloarReflectanceBack) {
        this.soloarReflectanceBack = soloarReflectanceBack;
    }
}
