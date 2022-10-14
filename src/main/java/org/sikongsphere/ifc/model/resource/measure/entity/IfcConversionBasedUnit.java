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

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

public class IfcConversionBasedUnit extends IfcNamedUnit {
    private IfcLabel name;
    private IfcMeasureWithUnit conversionFactor;

    public IfcConversionBasedUnit() {}

    public IfcConversionBasedUnit(IfcLabel name, IfcMeasureWithUnit conversionFactor) {
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
