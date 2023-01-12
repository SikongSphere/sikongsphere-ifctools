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
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcMeasureValue;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * A length measure is the value of a distance.
 * @author Wang Bohong
 * @date 2022/9/1 16:04
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcLengthMeasure extends DOUBLE implements IfcValue, IfcSizeSelect, IfcMeasureValue {

    public IfcLengthMeasure() {}

    public IfcLengthMeasure(double value) {
        super(value);
    }

    public IfcLengthMeasure(DOUBLE value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcLengthMeasure(STRING value) {
        super(value);
    }

}
