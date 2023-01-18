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
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcMeasureValue;

/**
 * Positive plane angle measure is a plane angle measure that is greater than zero.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcPositivePlaneAngleMeasure extends REAL implements IfcMeasureValue {
    public IfcPositivePlaneAngleMeasure() {}

    public IfcPositivePlaneAngleMeasure(double value) {
        super(value);
    }

    public IfcPositivePlaneAngleMeasure(DOUBLE value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcPositivePlaneAngleMeasure(STRING value) {
        super(value);
    }

    @Override
    public boolean illegal() {
        return getValue() > 0.0;
    }
}
