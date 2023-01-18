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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;

/**
 * A set of units which may be assigned.
 *
 * @author Wang Bohong
 * @date 2022/9/1 13:10
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcUnitAssignment extends IfcAbstractClass {

    private SET<IfcUnit> units;

    @IfcParserConstructor
    public IfcUnitAssignment(SET<IfcUnit> units) {
        this.units = units;
    }

    public SET<IfcUnit> getUnits() {
        return units;
    }

    public void setUnits(SET<IfcUnit> units) {
        this.units = units;
    }
}
