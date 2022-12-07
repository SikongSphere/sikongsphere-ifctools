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
package org.sikongsphere.ifc.newModel.schema.resource.cost.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.cost.enumeration.IfcEnvironmentalImpactCategoryEnum;
import org.sikongsphere.ifc.newModel.schema.resource.cost.selectType.IfcAppliedValueSelect;
import org.sikongsphere.ifc.newModel.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.newModel.schema.resource.measure.entity.IfcMeasureWithUnit;

/**
 * An IfcEnvironmentalImpactValue is an amount or measure of an environmental impact or a value that affects an amount
 * or measure of an environmental impact.
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcEnvironmentalImpactValue extends IfcAppliedValue {
    private IfcLabel impactType;
    private IfcEnvironmentalImpactCategoryEnum category;
    @IfcOptionField
    private IfcLabel userDefinedCategory;

    public IfcEnvironmentalImpactValue(
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
    public IfcEnvironmentalImpactValue(
        IfcLabel name,
        IfcText description,
        IfcAppliedValueSelect appliedValue,
        IfcMeasureWithUnit unitBasis,
        IfcDateTimeSelect applicableDate,
        IfcDateTimeSelect fixedUntilDate,
        IfcLabel impactType,
        IfcEnvironmentalImpactCategoryEnum category,
        IfcLabel userDefinedCategory
    ) {
        super(name, description, appliedValue, unitBasis, applicableDate, fixedUntilDate);
        this.impactType = impactType;
        this.category = category;
        this.userDefinedCategory = userDefinedCategory;
    }

    public IfcLabel getImpactType() {
        return impactType;
    }

    public void setImpactType(IfcLabel impactType) {
        this.impactType = impactType;
    }

    public IfcEnvironmentalImpactCategoryEnum getCategory() {
        return category;
    }

    public void setCategory(IfcEnvironmentalImpactCategoryEnum category) {
        this.category = category;
    }

    public IfcLabel getUserDefinedCategory() {
        return userDefinedCategory;
    }

    public void setUserDefinedCategory(IfcLabel userDefinedCategory) {
        this.userDefinedCategory = userDefinedCategory;
    }
}
