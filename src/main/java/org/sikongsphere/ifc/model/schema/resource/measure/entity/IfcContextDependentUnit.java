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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcUnitEnum;

/**
 * A context dependent unit is a unit which is not related to the SI system.
 * @author zaiyuan
 * @date 2022/12/07
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcContextDependentUnit extends IfcNamedUnit {
    private IfcLabel name;

    @IfcParserConstructor
    public IfcContextDependentUnit(
        IfcDimensionalExponents dimensions,
        IfcUnitEnum unitType,
        IfcLabel name
    ) {
        super(dimensions, unitType);
        this.name = name;
    }

    public IfcContextDependentUnit() {}

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }
}
