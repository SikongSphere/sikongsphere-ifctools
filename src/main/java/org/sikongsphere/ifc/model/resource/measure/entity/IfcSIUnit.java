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
import org.sikongsphere.ifc.model.resource.measure.enumeration.IfcSIPrefix;
import org.sikongsphere.ifc.model.resource.measure.enumeration.IfcSIUnitName;
import org.sikongsphere.ifc.model.resource.measure.enumeration.IfcUnitEnum;

/**
 * This class is used to encapsulate SI Unit information
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSIUnit extends IfcNamedUnit {
    private IfcSIPrefix prefix;
    private IfcSIUnitName name;

    /**
     * TODO
     * DERIVE
     * SELF\IfcNamedUnit.Dimensions	 : 	IfcDimensionalExponents :=  IfcDimensionsForSiUnit (SELF.Name);
     */

    public IfcSIUnit(IfcSIPrefix prefix, IfcSIUnitName name) {
        this.prefix = prefix;
        this.name = name;
    }

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

}
