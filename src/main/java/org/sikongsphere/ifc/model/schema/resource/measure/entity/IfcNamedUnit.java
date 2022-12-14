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

import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcUnitEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;

/**
 * This class is used to encapsulate named unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
public abstract class IfcNamedUnit extends IfcAbstractClass implements IfcUnit {
    protected IfcDimensionalExponents dimensions;
    protected IfcUnitEnum unitType;

    public IfcNamedUnit() {}

    public IfcNamedUnit(IfcDimensionalExponents dimensions, IfcUnitEnum unitType) {
        this.dimensions = dimensions;
        this.unitType = unitType;
    }

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
}
