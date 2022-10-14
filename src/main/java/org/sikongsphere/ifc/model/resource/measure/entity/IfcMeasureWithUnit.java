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
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcUnit;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;

/**
 * @author Gao Su
 * @date 2022/10/14 17:20
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMeasureWithUnit {
    private IfcValue valueComponent;

    private IfcUnit unitComponent;

    public IfcMeasureWithUnit() {}

    @IfcParserConstructor
    public IfcMeasureWithUnit(IfcValue valueComponent, IfcUnit unitComponent) {
        this.valueComponent = valueComponent;
        this.unitComponent = unitComponent;
    }

    public IfcValue getValueComponent() {
        return valueComponent;
    }

    public void setValueComponent(IfcValue valueComponent) {
        this.valueComponent = valueComponent;
    }

    public IfcUnit getUnitComponent() {
        return unitComponent;
    }

    public void setUnitComponent(IfcUnit unitComponent) {
        this.unitComponent = unitComponent;
    }
}
