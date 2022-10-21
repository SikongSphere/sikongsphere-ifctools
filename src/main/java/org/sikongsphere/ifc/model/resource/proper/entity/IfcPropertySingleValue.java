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
package org.sikongsphere.ifc.model.resource.proper.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcText;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcUnit;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/10/16 12:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPropertySingleValue extends IfcSimpleProperty {
    private IfcValue nominalValue;
    private IfcUnit unit;

    public IfcPropertySingleValue() {}

    @IfcParserConstructor
    public IfcPropertySingleValue(
        IfcIdentifier name,
        IfcText description,
        IfcValue nominalValue,
        IfcUnit unit
    ) {
        super(name, description);
        this.nominalValue = nominalValue;
        this.unit = unit;
    }

    public IfcValue getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(IfcValue nominalValue) {
        this.nominalValue = nominalValue;
    }

    public IfcUnit getUnit() {
        return unit;
    }

    public void setUnit(IfcUnit unit) {
        this.unit = unit;
    }
}