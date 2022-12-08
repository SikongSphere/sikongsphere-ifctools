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
package org.sikongsphere.ifc.newModel.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.REAL;
import org.sikongsphere.ifc.newModel.datatype.STRING;

/**
 * A measure of the thermal expansion coefficient of a material, which expresses its elongation (as a ratio) per
 * temperature difference. It is usually measured in 1/K. A positive elongation per (positive) rise of temperature is
 * expressed by a positive value.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcThermalExpansionCoefficientMeasure extends REAL {
    public IfcThermalExpansionCoefficientMeasure() {}

    public IfcThermalExpansionCoefficientMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcThermalExpansionCoefficientMeasure(STRING value) {
        super(value);
    }
}
