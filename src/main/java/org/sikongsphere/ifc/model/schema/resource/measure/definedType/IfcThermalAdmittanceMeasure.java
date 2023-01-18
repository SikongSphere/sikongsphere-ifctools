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
package org.sikongsphere.ifc.model.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.REAL;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcDerivedMeasureValue;

/**
 * The measure of the ability of a surface to smooth out temperature variations.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcThermalAdmittanceMeasure extends REAL implements IfcDerivedMeasureValue {
    public IfcThermalAdmittanceMeasure() {}

    public IfcThermalAdmittanceMeasure(double value) {
        super(value);
    }

    public IfcThermalAdmittanceMeasure(DOUBLE value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcThermalAdmittanceMeasure(STRING value) {
        super(value);
    }
}
