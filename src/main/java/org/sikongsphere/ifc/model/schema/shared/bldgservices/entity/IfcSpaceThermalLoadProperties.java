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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPowerMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.timeseries.entity.IfcTimeSeries;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcPropertySourceEnum;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcThermalLoadSourceEnum;
import org.sikongsphere.ifc.model.schema.shared.bldgservices.enumeration.IfcThermalLoadTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcSpaceThermalLoadProperties extends IfcPropertySetDefinition {
    @IfcOptionField
    private IfcPositiveRatioMeasure applicableValueRatio;
    private IfcThermalLoadSourceEnum thermalLoadSource;
    private IfcPropertySourceEnum propertySource;
    @IfcOptionField
    private IfcText sourceDescription;
    private IfcPowerMeasure maximumValue;
    @IfcOptionField
    private IfcPowerMeasure minimumValue;
    @IfcOptionField
    private IfcTimeSeries thermalLoadTimeSeriesValues;
    @IfcOptionField
    private IfcLabel userDefinedThermalLoadSource;
    @IfcOptionField
    private IfcLabel userDefinedPropertySource;
    @IfcOptionField
    private IfcThermalLoadTypeEnum thermalLoadType;

    @IfcParserConstructor
    public IfcSpaceThermalLoadProperties(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcPositiveRatioMeasure applicableValueRatio,
        IfcThermalLoadSourceEnum thermalLoadSource,
        IfcPropertySourceEnum propertySource,
        IfcText sourceDescription,
        IfcPowerMeasure maximumValue,
        IfcPowerMeasure minimumValue,
        IfcTimeSeries thermalLoadTimeSeriesValues,
        IfcLabel userDefinedThermalLoadSource,
        IfcLabel userDefinedPropertySource,
        IfcThermalLoadTypeEnum thermalLoadType
    ) {
        super(globalId, ownerHistory, name, description);
        this.applicableValueRatio = applicableValueRatio;
        this.thermalLoadSource = thermalLoadSource;
        this.propertySource = propertySource;
        this.sourceDescription = sourceDescription;
        this.maximumValue = maximumValue;
        this.minimumValue = minimumValue;
        this.thermalLoadTimeSeriesValues = thermalLoadTimeSeriesValues;
        this.userDefinedThermalLoadSource = userDefinedThermalLoadSource;
        this.userDefinedPropertySource = userDefinedPropertySource;
        this.thermalLoadType = thermalLoadType;
    }

    public IfcPositiveRatioMeasure getApplicableValueRatio() {
        return applicableValueRatio;
    }

    public void setApplicableValueRatio(IfcPositiveRatioMeasure applicableValueRatio) {
        this.applicableValueRatio = applicableValueRatio;
    }

    public IfcThermalLoadSourceEnum getThermalLoadSource() {
        return thermalLoadSource;
    }

    public void setThermalLoadSource(IfcThermalLoadSourceEnum thermalLoadSource) {
        this.thermalLoadSource = thermalLoadSource;
    }

    public IfcPropertySourceEnum getPropertySource() {
        return propertySource;
    }

    public void setPropertySource(IfcPropertySourceEnum propertySource) {
        this.propertySource = propertySource;
    }

    public IfcText getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(IfcText sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public IfcPowerMeasure getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(IfcPowerMeasure maximumValue) {
        this.maximumValue = maximumValue;
    }

    public IfcPowerMeasure getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(IfcPowerMeasure minimumValue) {
        this.minimumValue = minimumValue;
    }

    public IfcTimeSeries getThermalLoadTimeSeriesValues() {
        return thermalLoadTimeSeriesValues;
    }

    public void setThermalLoadTimeSeriesValues(IfcTimeSeries thermalLoadTimeSeriesValues) {
        this.thermalLoadTimeSeriesValues = thermalLoadTimeSeriesValues;
    }

    public IfcLabel getUserDefinedThermalLoadSource() {
        return userDefinedThermalLoadSource;
    }

    public void setUserDefinedThermalLoadSource(IfcLabel userDefinedThermalLoadSource) {
        this.userDefinedThermalLoadSource = userDefinedThermalLoadSource;
    }

    public IfcLabel getUserDefinedPropertySource() {
        return userDefinedPropertySource;
    }

    public void setUserDefinedPropertySource(IfcLabel userDefinedPropertySource) {
        this.userDefinedPropertySource = userDefinedPropertySource;
    }

    public IfcThermalLoadTypeEnum getThermalLoadType() {
        return thermalLoadType;
    }

    public void setThermalLoadType(IfcThermalLoadTypeEnum thermalLoadType) {
        this.thermalLoadType = thermalLoadType;
    }
}
