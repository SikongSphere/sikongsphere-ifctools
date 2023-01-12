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
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcHatchLineDistanceSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * A positive length measure is a length measure that is greater than zero.
 *
 * @author stan
 * @date 2022/09/01 23:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcPositiveLengthMeasure extends DOUBLE
    implements
        IfcHatchLineDistanceSelect,
        IfcSizeSelect,
        IfcValue,
        IfcMeasureValue {

    public IfcPositiveLengthMeasure() {}

    public IfcPositiveLengthMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcPositiveLengthMeasure(DOUBLE value) {
        super(value);
    }

    public IfcPositiveLengthMeasure(STRING value) {
        super(value);
    }
}
