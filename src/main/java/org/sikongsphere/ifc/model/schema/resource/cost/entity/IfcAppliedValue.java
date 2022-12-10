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
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.cost.selectType.IfcAppliedValueSelect;
import org.sikongsphere.ifc.model.schema.resource.datetime.selectType.IfcDateTimeSelect;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcMeasureWithUnit;
import org.sikongsphere.ifc.model.schema.resource.property.selectType.IfcObjectReferenceSelect;

/**
 * An IfcAppliedValue is an abstract supertype that specifies the common attributes for cost and environmental values
 * that may be applied to objects within the IFC model.
 *
 * @author zaiyuan
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAppliedValue extends IfcAbstractClass implements IfcObjectReferenceSelect {
    @IfcOptionField
    private IfcLabel name;
    @IfcOptionField
    private IfcText description;
    @IfcOptionField
    private IfcAppliedValueSelect appliedValue;
    @IfcOptionField
    private IfcMeasureWithUnit unitBasis;
    @IfcOptionField
    private IfcDateTimeSelect applicableDate;
    @IfcOptionField
    private IfcDateTimeSelect fixedUntilDate;

    @IfcInverseParameter
    private SET<IfcReferencesValueDocument> valuesReferenced;
    @IfcInverseParameter
    private SET<IfcAppliedValueRelationship> valueOfComponents;
    @IfcInverseParameter
    private SET<IfcAppliedValueRelationship> isComponentIn;

    @IfcParserConstructor
    public IfcAppliedValue(
        IfcLabel name,
        IfcText description,
        IfcAppliedValueSelect appliedValue,
        IfcMeasureWithUnit unitBasis,
        IfcDateTimeSelect applicableDate,
        IfcDateTimeSelect fixedUntilDate
    ) {
        this.name = name;
        this.description = description;
        this.appliedValue = appliedValue;
        this.unitBasis = unitBasis;
        this.applicableDate = applicableDate;
        this.fixedUntilDate = fixedUntilDate;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcText getDescription() {
        return description;
    }

    public void setDescription(IfcText description) {
        this.description = description;
    }

    public IfcAppliedValueSelect getAppliedValue() {
        return appliedValue;
    }

    public void setAppliedValue(IfcAppliedValueSelect appliedValue) {
        this.appliedValue = appliedValue;
    }

    public IfcMeasureWithUnit getUnitBasis() {
        return unitBasis;
    }

    public void setUnitBasis(IfcMeasureWithUnit unitBasis) {
        this.unitBasis = unitBasis;
    }

    public IfcDateTimeSelect getApplicableDate() {
        return applicableDate;
    }

    public void setApplicableDate(IfcDateTimeSelect applicableDate) {
        this.applicableDate = applicableDate;
    }

    public IfcDateTimeSelect getFixedUntilDate() {
        return fixedUntilDate;
    }

    public void setFixedUntilDate(IfcDateTimeSelect fixedUntilDate) {
        this.fixedUntilDate = fixedUntilDate;
    }

    public SET<IfcReferencesValueDocument> getValuesReferenced() {
        return valuesReferenced;
    }

    public void setValuesReferenced(SET<IfcReferencesValueDocument> valuesReferenced) {
        this.valuesReferenced = valuesReferenced;
    }

    public SET<IfcAppliedValueRelationship> getValueOfComponents() {
        return valueOfComponents;
    }

    public void setValueOfComponents(SET<IfcAppliedValueRelationship> valueOfComponents) {
        this.valueOfComponents = valueOfComponents;
    }

    public SET<IfcAppliedValueRelationship> getIsComponentIn() {
        return isComponentIn;
    }

    public void setIsComponentIn(SET<IfcAppliedValueRelationship> isComponentIn) {
        this.isComponentIn = isComponentIn;
    }
}
