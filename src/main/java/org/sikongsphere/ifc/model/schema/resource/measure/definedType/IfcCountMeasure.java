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
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.NUMBER;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcMeasureValue;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * A count measure is the value of a count.
 *
 * @author Wang Bohong
 * @date 2022/11/13 11:47
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcCountMeasure extends NUMBER implements IfcValue, IfcMeasureValue {

    public IfcCountMeasure() {}

    public IfcCountMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcCountMeasure(STRING value) {
        super(value);
    }

    @Override
    public String toString() {
        double value = getValue();
        int num = (int) value;
        if (num - value == 0) {
            return num + StringConstant.DOT;
        } else return String.valueOf(value);
    }
}
