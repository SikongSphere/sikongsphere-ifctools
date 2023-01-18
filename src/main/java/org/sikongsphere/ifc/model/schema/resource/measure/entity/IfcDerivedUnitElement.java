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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.INTEGER;
import org.sikongsphere.ifc.model.IfcAbstractClass;

/**
 * A derived unit element is one of the unit quantities which makes up a derived unit.
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcDerivedUnitElement extends IfcAbstractClass {
    private IfcNamedUnit unit;
    private INTEGER exponent;

    @IfcParserConstructor
    public IfcDerivedUnitElement(IfcNamedUnit unit, INTEGER exponent) {
        this.unit = unit;
        this.exponent = exponent;
    }

    public IfcDerivedUnitElement(IfcNamedUnit unit, Integer exponent) {
        this.unit = unit;
        this.exponent = new INTEGER(exponent);
    }

    public IfcNamedUnit getUnit() {
        return unit;
    }

    public void setUnit(IfcNamedUnit unit) {
        this.unit = unit;
    }

    public INTEGER getExponent() {
        return exponent;
    }

    public void setExponent(INTEGER exponent) {
        this.exponent = exponent;
    }
}
