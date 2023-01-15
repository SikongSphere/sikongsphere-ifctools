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
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.material.entity.IfcMaterial;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcDerivedMeasureValue;
import org.sikongsphere.ifc.model.schema.resource.timeseries.entity.IfcTimeSeries;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcPropertySourceEnum;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcFluidFlowProperties extends IfcPropertySetDefinition {
    private IfcPropertySourceEnum propertySource;
    @IfcOptionField
    private IfcTimeSeries flowConditionTimeSeries;
    @IfcOptionField
    private IfcTimeSeries velocityTimeSeries;
    @IfcOptionField
    private IfcTimeSeries flowrateTimeSeries;
    private IfcMaterial fluid;
    @IfcOptionField
    private IfcTimeSeries pressureTimeSeries;
    @IfcOptionField
    private IfcLabel userDefinedPropertySource;
    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure temperatureSingleValue;
    @IfcOptionField
    private IfcThermodynamicTemperatureMeasure wetBulbTemperatureSingleValue;
    @IfcOptionField
    private IfcTimeSeries wetBulbTemperatureTimeSeries;
    @IfcOptionField
    private IfcTimeSeries temperatureTimeSeries;
    @IfcOptionField
    private IfcDerivedMeasureValue flowrateSingleValue;
    @IfcOptionField
    private IfcPositiveRatioMeasure flowConditionSingleValue;
    @IfcOptionField
    private IfcLinearVelocityMeasure velocitySingleValue;
    @IfcOptionField
    private IfcPressureMeasure pressureSingleValue;

    @IfcParserConstructor
    public IfcFluidFlowProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPropertySourceEnum propertySource,
        IfcTimeSeries flowConditionTimeSeries,
        IfcTimeSeries velocityTimeSeries,
        IfcTimeSeries flowrateTimeSeries,
        IfcMaterial fluid,
        IfcTimeSeries pressureTimeSeries,
        IfcLabel userDefinedPropertySource,
        IfcThermodynamicTemperatureMeasure temperatureSingleValue,
        IfcThermodynamicTemperatureMeasure wetBulbTemperatureSingleValue,
        IfcTimeSeries wetBulbTemperatureTimeSeries,
        IfcTimeSeries temperatureTimeSeries,
        IfcDerivedMeasureValue flowrateSingleValue,
        IfcPositiveRatioMeasure flowConditionSingleValue,
        IfcLinearVelocityMeasure velocitySingleValue,
        IfcPressureMeasure pressureSingleValue
    ) {
        super(globalId, ownerHistory, name, description);
        this.propertySource = propertySource;
        this.flowConditionTimeSeries = flowConditionTimeSeries;
        this.velocityTimeSeries = velocityTimeSeries;
        this.flowrateTimeSeries = flowrateTimeSeries;
        this.fluid = fluid;
        this.pressureTimeSeries = pressureTimeSeries;
        this.userDefinedPropertySource = userDefinedPropertySource;
        this.temperatureSingleValue = temperatureSingleValue;
        this.wetBulbTemperatureSingleValue = wetBulbTemperatureSingleValue;
        this.wetBulbTemperatureTimeSeries = wetBulbTemperatureTimeSeries;
        this.temperatureTimeSeries = temperatureTimeSeries;
        this.flowrateSingleValue = flowrateSingleValue;
        this.flowConditionSingleValue = flowConditionSingleValue;
        this.velocitySingleValue = velocitySingleValue;
        this.pressureSingleValue = pressureSingleValue;
    }

    public IfcPropertySourceEnum getPropertySource() {
        return propertySource;
    }

    public void setPropertySource(IfcPropertySourceEnum propertySource) {
        this.propertySource = propertySource;
    }

    public IfcTimeSeries getFlowConditionTimeSeries() {
        return flowConditionTimeSeries;
    }

    public void setFlowConditionTimeSeries(IfcTimeSeries flowConditionTimeSeries) {
        this.flowConditionTimeSeries = flowConditionTimeSeries;
    }

    public IfcTimeSeries getVelocityTimeSeries() {
        return velocityTimeSeries;
    }

    public void setVelocityTimeSeries(IfcTimeSeries velocityTimeSeries) {
        this.velocityTimeSeries = velocityTimeSeries;
    }

    public IfcTimeSeries getFlowrateTimeSeries() {
        return flowrateTimeSeries;
    }

    public void setFlowrateTimeSeries(IfcTimeSeries flowrateTimeSeries) {
        this.flowrateTimeSeries = flowrateTimeSeries;
    }

    public IfcMaterial getFluid() {
        return fluid;
    }

    public void setFluid(IfcMaterial fluid) {
        this.fluid = fluid;
    }

    public IfcTimeSeries getPressureTimeSeries() {
        return pressureTimeSeries;
    }

    public void setPressureTimeSeries(IfcTimeSeries pressureTimeSeries) {
        this.pressureTimeSeries = pressureTimeSeries;
    }

    public IfcLabel getUserDefinedPropertySource() {
        return userDefinedPropertySource;
    }

    public void setUserDefinedPropertySource(IfcLabel userDefinedPropertySource) {
        this.userDefinedPropertySource = userDefinedPropertySource;
    }

    public IfcThermodynamicTemperatureMeasure getTemperatureSingleValue() {
        return temperatureSingleValue;
    }

    public void setTemperatureSingleValue(
        IfcThermodynamicTemperatureMeasure temperatureSingleValue
    ) {
        this.temperatureSingleValue = temperatureSingleValue;
    }

    public IfcThermodynamicTemperatureMeasure getWetBulbTemperatureSingleValue() {
        return wetBulbTemperatureSingleValue;
    }

    public void setWetBulbTemperatureSingleValue(
        IfcThermodynamicTemperatureMeasure wetBulbTemperatureSingleValue
    ) {
        this.wetBulbTemperatureSingleValue = wetBulbTemperatureSingleValue;
    }

    public IfcTimeSeries getWetBulbTemperatureTimeSeries() {
        return wetBulbTemperatureTimeSeries;
    }

    public void setWetBulbTemperatureTimeSeries(IfcTimeSeries wetBulbTemperatureTimeSeries) {
        this.wetBulbTemperatureTimeSeries = wetBulbTemperatureTimeSeries;
    }

    public IfcTimeSeries getTemperatureTimeSeries() {
        return temperatureTimeSeries;
    }

    public void setTemperatureTimeSeries(IfcTimeSeries temperatureTimeSeries) {
        this.temperatureTimeSeries = temperatureTimeSeries;
    }

    public IfcDerivedMeasureValue getFlowrateSingleValue() {
        return flowrateSingleValue;
    }

    public void setFlowrateSingleValue(IfcDerivedMeasureValue flowrateSingleValue) {
        this.flowrateSingleValue = flowrateSingleValue;
    }

    public IfcPositiveRatioMeasure getFlowConditionSingleValue() {
        return flowConditionSingleValue;
    }

    public void setFlowConditionSingleValue(IfcPositiveRatioMeasure flowConditionSingleValue) {
        this.flowConditionSingleValue = flowConditionSingleValue;
    }

    public IfcLinearVelocityMeasure getVelocitySingleValue() {
        return velocitySingleValue;
    }

    public void setVelocitySingleValue(IfcLinearVelocityMeasure velocitySingleValue) {
        this.velocitySingleValue = velocitySingleValue;
    }

    public IfcPressureMeasure getPressureSingleValue() {
        return pressureSingleValue;
    }

    public void setPressureSingleValue(IfcPressureMeasure pressureSingleValue) {
        this.pressureSingleValue = pressureSingleValue;
    }
}
