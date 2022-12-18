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
package org.sikongsphere.ifc.model.schema.shared.facilities.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySetDefinition;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcMeasureValue;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.model.schema.shared.facilities.enumeration.IfcServiceLifeTypeEnum;

/**
 * @author zaiyuan
 * @date 2022/12/18 12:14
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.SHARED)
public class IfcServiceLifeFactor extends IfcPropertySetDefinition {
    private IfcServiceLifeTypeEnum predefinedType;
    @IfcOptionField
    private IfcMeasureValue upperValue;
    private IfcMeasureValue mostUsedValue;
    @IfcOptionField
    private IfcMeasureValue lowerValue;

    @IfcParserConstructor
    public IfcServiceLifeFactor(
        IfcGloballyUniqueId globalId,
        IfcOwnerHistory ownerHistory,
        IfcLabel name,
        IfcText description,
        IfcServiceLifeTypeEnum predefinedType,
        IfcMeasureValue upperValue,
        IfcMeasureValue mostUsedValue,
        IfcMeasureValue lowerValue
    ) {
        super(globalId, ownerHistory, name, description);
        this.predefinedType = predefinedType;
        this.upperValue = upperValue;
        this.mostUsedValue = mostUsedValue;
        this.lowerValue = lowerValue;
    }

    public IfcServiceLifeTypeEnum getPredefinedType() {
        return predefinedType;
    }

    public void setPredefinedType(IfcServiceLifeTypeEnum predefinedType) {
        this.predefinedType = predefinedType;
    }

    public IfcMeasureValue getUpperValue() {
        return upperValue;
    }

    public void setUpperValue(IfcMeasureValue upperValue) {
        this.upperValue = upperValue;
    }

    public IfcMeasureValue getMostUsedValue() {
        return mostUsedValue;
    }

    public void setMostUsedValue(IfcMeasureValue mostUsedValue) {
        this.mostUsedValue = mostUsedValue;
    }

    public IfcMeasureValue getLowerValue() {
        return lowerValue;
    }

    public void setLowerValue(IfcMeasureValue lowerValue) {
        this.lowerValue = lowerValue;
    }
}
