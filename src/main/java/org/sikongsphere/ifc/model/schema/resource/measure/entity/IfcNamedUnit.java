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

import com.sun.org.apache.bcel.internal.generic.PUSH;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcUnitEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;

/**
 * A named unit is a unit quantity associated with the word, or group of words, by which the unit is identified.
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public abstract class IfcNamedUnit extends IfcAbstractClass implements IfcUnit {
    private IfcDimensionalExponents dimensions;
    private IfcUnitEnum unitType;

    @IfcParserConstructor
    public IfcNamedUnit(IfcDimensionalExponents dimensions, IfcUnitEnum unitType) {
        this.dimensions = dimensions;
        this.unitType = unitType;
    }

    public IfcNamedUnit() {};

    public IfcDimensionalExponents getDimensions() {
        return dimensions;
    }

    public void setDimensions(IfcDimensionalExponents dimensions) {
        this.dimensions = dimensions;
    }

    public IfcUnitEnum getUnitType() {
        return unitType;
    }

    public void setUnitType(IfcUnitEnum unitType) {
        this.unitType = unitType;
    }

    public void setUnitType(STRING unitType) {
        this.unitType = IfcUnitEnum.valueOf(unitType.value);
    }
}
