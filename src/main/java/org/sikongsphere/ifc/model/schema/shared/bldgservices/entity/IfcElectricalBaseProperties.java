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
package org.sikongsphere.ifc.model.schema.shared.bldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcElectricCurrentEnum;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcEnergySequenceEnum;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcElectricalBaseProperties extends IfcEnergyProperties {
    @IfcOptionField
    private IfcElectricCurrentEnum electricCurrentType;
    private IfcElectricVoltageMeasure inputVoltage;
    private IfcFrequencyMeasure inputFrequency;
    @IfcOptionField
    private IfcElectricCurrentMeasure fullLoadCurrent;
    @IfcOptionField
    private IfcElectricCurrentMeasure minimumCircuitCurrent;
    @IfcOptionField
    private IfcPowerMeasure maximumPowerInput;
    @IfcOptionField
    private IfcPowerMeasure ratedPowerInput;
    private INTEGER inputPhase;

    @IfcParserConstructor
    public IfcElectricalBaseProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcEnergySequenceEnum energySequence,
        IfcLabel userDefinedEnergySequence,
        IfcElectricCurrentEnum electricCurrentType,
        IfcElectricVoltageMeasure inputVoltage,
        IfcFrequencyMeasure inputFrequency,
        IfcElectricCurrentMeasure fullLoadCurrent,
        IfcElectricCurrentMeasure minimumCircuitCurrent,
        IfcPowerMeasure maximumPowerInput,
        IfcPowerMeasure ratedPowerInput,
        INTEGER inputPhase
    ) {
        super(globalId, ownerHistory, name, description, energySequence, userDefinedEnergySequence);
        this.electricCurrentType = electricCurrentType;
        this.inputVoltage = inputVoltage;
        this.inputFrequency = inputFrequency;
        this.fullLoadCurrent = fullLoadCurrent;
        this.minimumCircuitCurrent = minimumCircuitCurrent;
        this.maximumPowerInput = maximumPowerInput;
        this.ratedPowerInput = ratedPowerInput;
        this.inputPhase = inputPhase;
    }

    public IfcElectricCurrentEnum getElectricCurrentType() {
        return electricCurrentType;
    }

    public void setElectricCurrentType(IfcElectricCurrentEnum electricCurrentType) {
        this.electricCurrentType = electricCurrentType;
    }

    public IfcElectricVoltageMeasure getInputVoltage() {
        return inputVoltage;
    }

    public void setInputVoltage(IfcElectricVoltageMeasure inputVoltage) {
        this.inputVoltage = inputVoltage;
    }

    public IfcFrequencyMeasure getInputFrequency() {
        return inputFrequency;
    }

    public void setInputFrequency(IfcFrequencyMeasure inputFrequency) {
        this.inputFrequency = inputFrequency;
    }

    public IfcElectricCurrentMeasure getFullLoadCurrent() {
        return fullLoadCurrent;
    }

    public void setFullLoadCurrent(IfcElectricCurrentMeasure fullLoadCurrent) {
        this.fullLoadCurrent = fullLoadCurrent;
    }

    public IfcElectricCurrentMeasure getMinimumCircuitCurrent() {
        return minimumCircuitCurrent;
    }

    public void setMinimumCircuitCurrent(IfcElectricCurrentMeasure minimumCircuitCurrent) {
        this.minimumCircuitCurrent = minimumCircuitCurrent;
    }

    public IfcPowerMeasure getMaximumPowerInput() {
        return maximumPowerInput;
    }

    public void setMaximumPowerInput(IfcPowerMeasure maximumPowerInput) {
        this.maximumPowerInput = maximumPowerInput;
    }

    public IfcPowerMeasure getRatedPowerInput() {
        return ratedPowerInput;
    }

    public void setRatedPowerInput(IfcPowerMeasure ratedPowerInput) {
        this.ratedPowerInput = ratedPowerInput;
    }

    public INTEGER getInputPhase() {
        return inputPhase;
    }

    public void setInputPhase(INTEGER inputPhase) {
        this.inputPhase = inputPhase;
    }
}
