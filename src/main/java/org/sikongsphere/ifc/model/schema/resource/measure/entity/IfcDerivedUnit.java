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
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcDerivedUnitEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;

/**
 * A derived unit is an expression of units.
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDerivedUnit extends IfcAbstractClass implements IfcUnit {
    private SET<IfcDerivedUnitElement> elements;
    private IfcDerivedUnitEnum unitType;
    @IfcOptionField
    private IfcLabel userDefinedType;
    @IfcDeriveParameter
    private IfcDimensionalExponents dimensions;

    public IfcDerivedUnit(SET<IfcDerivedUnitElement> elements, IfcDerivedUnitEnum unitType) {
        this.elements = elements;
        this.unitType = unitType;
    }

    @IfcParserConstructor
    public IfcDerivedUnit(
        SET<IfcDerivedUnitElement> elements,
        IfcDerivedUnitEnum unitType,
        IfcLabel userDefinedType
    ) {
        this.elements = elements;
        this.unitType = unitType;
        this.userDefinedType = userDefinedType;
    }

    public IfcDerivedUnit() {}

    public SET<IfcDerivedUnitElement> getElements() {
        return elements;
    }

    public void setElements(SET<IfcDerivedUnitElement> elements) {
        this.elements = elements;
    }

    public IfcDerivedUnitEnum getUnitType() {
        return unitType;
    }

    public void setUnitType(IfcDerivedUnitEnum unitType) {
        this.unitType = unitType;
    }

    public IfcLabel getUserDefinedType() {
        return userDefinedType;
    }

    public void setUserDefinedType(IfcLabel userDefinedType) {
        this.userDefinedType = userDefinedType;
    }

    public IfcDimensionalExponents getDimensions() {
        return dimensions;
    }

    public void setDimensions(IfcDimensionalExponents dimensions) {
        this.dimensions = dimensions;
    }
}
