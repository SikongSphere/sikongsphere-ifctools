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
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcSIUnitName;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcUnitEnum;

/**
 * An SI unit is the fixed quantity used as a standard in terms of which items are measured as defined
 * by ISO 1000 (clause 2).
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSIUnit extends IfcNamedUnit {
    @IfcOptionField
    private IfcSIPrefix prefix;
    private IfcSIUnitName name;

    @IfcParserConstructor
    public IfcSIUnit(
        IfcDimensionalExponents dimensions,
        IfcUnitEnum unitType,
        IfcSIPrefix prefix,
        IfcSIUnitName name
    ) {
        super(dimensions, unitType);
        this.prefix = prefix;
        this.name = name;
    }

    public IfcSIUnit() {}

    public IfcSIPrefix getPrefix() {
        return prefix;
    }

    public void setPrefix(IfcSIPrefix prefix) {
        this.prefix = prefix;
    }

    public IfcSIUnitName getName() {
        return name;
    }

    public void setName(IfcSIUnitName name) {
        this.name = name;
    }
}
