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
package org.sikongsphere.ifc.model.schema.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.constraint.selectType.IfcMetricValueSelect;
import org.sikongsphere.ifc.model.schema.resource.cost.selectType.IfcAppliedValueSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcRatioMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIUnitName;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

import java.util.Locale;

/**
 * A measure with unit is the specification of a physical quantity as defined in ISO 31 (clause 2).
 *
 * @author Gao Su
 * @modify yiwei
 * @date 2022/10/14 17:20
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMeasureWithUnit extends IfcAbstractClass 
    implements IfcMetricValueSelect,IfcAppliedValueSelect {

    private IfcValue valueComponent;
    private IfcUnit unitComponent;

    public IfcMeasureWithUnit() {}

    @IfcParserConstructor
    public IfcMeasureWithUnit(IfcValue valueComponent, IfcUnit unitComponent) {
        this.valueComponent = valueComponent;
        this.unitComponent = unitComponent;
    }

    public IfcMeasureWithUnit(Double value, IfcSIPrefix unitPrefix, IfcSIUnitName unitName) {
        this.valueComponent = new IfcRatioMeasure(value);
        this.unitComponent = new IfcSIUnit(unitPrefix, unitName);
    }

    public String getValueComponent() {
        String format = String.format(
            "%s(%s)",
            valueComponent.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            this.valueComponent
        );
        return format;
    }

    public void setValueComponent(IfcValue valueComponent) {
        this.valueComponent = valueComponent;
    }

    public IfcUnit getUnitComponent() {
        return unitComponent;
    }

    public void setUnitComponent(IfcUnit unitComponent) {
        this.unitComponent = unitComponent;
    }
}
