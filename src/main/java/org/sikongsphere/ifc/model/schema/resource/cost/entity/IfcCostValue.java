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
package org.sikongsphere.ifc.model.schema.resource.cost.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.constraint.selectType.IfcMetricValueSelect;
import org.sikongsphere.ifc.model.schema.resource.cost.selectType.IfcAppliedValueSelect;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcMeasureWithUnit;

/**
 * An IfcCostValue is an amount of money or a value that affects an amount of money.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022/9/1 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCostValue extends IfcAppliedValue implements IfcMetricValueSelect {
    private IfcLabel costType;
    @IfcOptionField
    private IfcText condition;

    public IfcCostValue() {
        super(null, null, null, null, null, null);
    }

    public IfcCostValue(
        IfcLabel name,
        IfcText description,
        IfcAppliedValueSelect appliedValue,
        IfcMeasureWithUnit unitBasis,
        IfcDateTimeSelect applicableDate,
        IfcDateTimeSelect fixedUntilDate
    ) {
        super(name, description, appliedValue, unitBasis, applicableDate, fixedUntilDate);
    }

    @IfcParserConstructor
    public IfcCostValue(
        IfcLabel name,
        IfcText description,
        IfcAppliedValueSelect appliedValue,
        IfcMeasureWithUnit unitBasis,
        IfcDateTimeSelect applicableDate,
        IfcDateTimeSelect fixedUntilDate,
        IfcLabel costType,
        IfcText condition
    ) {
        super(name, description, appliedValue, unitBasis, applicableDate, fixedUntilDate);
        this.costType = costType;
        this.condition = condition;
    }

    public IfcLabel getCostType() {
        return costType;
    }

    public void setCostType(IfcLabel costType) {
        this.costType = costType;
    }

    public IfcText getCondition() {
        return condition;
    }

    public void setCondition(IfcText condition) {
        this.condition = condition;
    }
}
