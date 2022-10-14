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
package org.sikongsphere.ifc.model.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcDimensionalExponents;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcMeasureWithUnit;
import org.sikongsphere.ifc.model.resource.measure.entity.IfcNamedUnit;
import org.sikongsphere.ifc.model.resource.measure.enumeration.IfcUnitEnum;

/**
 * @author Wang Bohong
 * @date 2022/10/14 15:10
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcConversionBasedUnit extends IfcNamedUnit {
    private IfcLabel name;
    private IfcMeasureWithUnit conversionFactor;

    public IfcConversionBasedUnit() {}

    @IfcParserConstructor
    public IfcConversionBasedUnit(
        IfcDimensionalExponents dimensions,
        IfcUnitEnum unitType,
        IfcLabel name,
        IfcMeasureWithUnit conversionFactor
    ) {
        super(dimensions, unitType);
        this.name = name;
        this.conversionFactor = conversionFactor;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcMeasureWithUnit getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(IfcMeasureWithUnit conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
