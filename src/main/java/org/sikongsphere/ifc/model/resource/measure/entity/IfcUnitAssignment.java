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

import org.sikongsphere.ifc.model.resource.measure.select_types.IfcUnit;

import java.util.Set;

/**
 * This class contains a set of units which may be assigned.
 * @author Wang Bohong
 * @date 2022/9/1 13:10
 */
public class IfcUnitAssignment {

    private Set<IfcUnit> units;

    public IfcUnitAssignment() {}

    public IfcUnitAssignment(Set<IfcUnit> units) {
        this.units = units;
    }

    public Set<IfcUnit> getUnits() {
        return units;
    }

    public void setUnits(Set<IfcUnit> units) {
        this.units = units;
    }
}
