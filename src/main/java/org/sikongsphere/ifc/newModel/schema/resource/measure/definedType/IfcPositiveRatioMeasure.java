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
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * A positive ratio measure is a ratio measure that is greater than zero.
 *
 * @author stan
 * @date 2022/09/01 23:44
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcPositiveRatioMeasure {
    private IfcRatioMeasure positiveRatioMeasure;

    public IfcPositiveRatioMeasure() {}

    public IfcPositiveRatioMeasure(IfcRatioMeasure positiveRatioMeasure) {
        this.positiveRatioMeasure = positiveRatioMeasure;
    }

    public IfcRatioMeasure getPositiveRatioMeasure() {
        return positiveRatioMeasure;
    }

    public void setPositiveRatioMeasure(IfcRatioMeasure positiveRatioMeasure) {
        this.positiveRatioMeasure = positiveRatioMeasure;
    }
}
