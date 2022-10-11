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
package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcNonLeafNode;

/**
 * Dimensionless measure to express ratio values ranging from 0.0 to 1.0
 *
 * @author stan
 * @date 2022/09/01 23:47
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE)
public class IfcNormalisedRatioMeasure extends IfcNonLeafNode {
    private IfcRatioMeasure normalisedRatioMeasure;

    public IfcNormalisedRatioMeasure() {}

    public IfcNormalisedRatioMeasure(IfcRatioMeasure normalisedRatioMeasure) {
        this.normalisedRatioMeasure = normalisedRatioMeasure;
    }

    public IfcRatioMeasure getNormalisedRatioMeasure() {
        return normalisedRatioMeasure;
    }

    public void setNormalisedRatioMeasure(IfcRatioMeasure normalisedRatioMeasure) {
        this.normalisedRatioMeasure = normalisedRatioMeasure;
    }
}
