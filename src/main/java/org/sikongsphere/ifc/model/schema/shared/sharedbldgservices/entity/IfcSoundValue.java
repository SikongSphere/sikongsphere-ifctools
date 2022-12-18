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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgservices.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcFrequencyMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcDerivedMeasureValue;
import org.sikongsphere.ifc.model.schema.resource.timeseries.entity.IfcTimeSeries;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENTITY)
public class IfcSoundValue extends IfcPropertySetDefinition {
    @IfcOptionField
    private IfcTimeSeries soundLevelTimeSeries;
    private IfcFrequencyMeasure frequency;
    @IfcOptionField
    private IfcDerivedMeasureValue soundLevelSingleValue;

    @IfcParserConstructor
    public IfcSoundValue(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcTimeSeries soundLevelTimeSeries,
        IfcFrequencyMeasure frequency,
        IfcDerivedMeasureValue soundLevelSingleValue
    ) {
        super(globalId, ownerHistory, name, description);
        this.soundLevelTimeSeries = soundLevelTimeSeries;
        this.frequency = frequency;
        this.soundLevelSingleValue = soundLevelSingleValue;
    }

    public IfcTimeSeries getSoundLevelTimeSeries() {
        return soundLevelTimeSeries;
    }

    public void setSoundLevelTimeSeries(IfcTimeSeries soundLevelTimeSeries) {
        this.soundLevelTimeSeries = soundLevelTimeSeries;
    }

    public IfcFrequencyMeasure getFrequency() {
        return frequency;
    }

    public void setFrequency(IfcFrequencyMeasure frequency) {
        this.frequency = frequency;
    }

    public IfcDerivedMeasureValue getSoundLevelSingleValue() {
        return soundLevelSingleValue;
    }

    public void setSoundLevelSingleValue(IfcDerivedMeasureValue soundLevelSingleValue) {
        this.soundLevelSingleValue = soundLevelSingleValue;
    }
}
