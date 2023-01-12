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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * A positive ratio measure is a ratio measure that is greater than zero.
 *
 * @author stan
 * @date 2022/09/01 23:44
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcPositiveRatioMeasure extends IfcRatioMeasure implements IfcSizeSelect {
    public IfcPositiveRatioMeasure() {}

    public IfcPositiveRatioMeasure(double value) {
        super(value);
    }

    public IfcPositiveRatioMeasure(STRING value) {
        super(value);
    }

    public IfcPositiveRatioMeasure(DOUBLE value) {
        super(value.getValue());
    }
}
