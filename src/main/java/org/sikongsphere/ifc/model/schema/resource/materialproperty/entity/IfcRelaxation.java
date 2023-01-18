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
package org.sikongsphere.ifc.model.schema.resource.materialproperty.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;

/**
 * Measure of the decrease in stress over long time interval resulting from plastic flow.
 *
 * @author:stan
 * @date:2023/1/10 21:55
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRelaxation extends IfcAbstractClass {

    private IfcNormalisedRatioMeasure relaxationValue;

    private IfcNormalisedRatioMeasure initialStress;

    @IfcParserConstructor
    public IfcRelaxation(
        IfcNormalisedRatioMeasure relaxationValue,
        IfcNormalisedRatioMeasure initialStress
    ) {
        this.relaxationValue = relaxationValue;
        this.initialStress = initialStress;
    }

    public IfcNormalisedRatioMeasure getRelaxationValue() {
        return relaxationValue;
    }

    public void setRelaxationValue(IfcNormalisedRatioMeasure relaxationValue) {
        this.relaxationValue = relaxationValue;
    }

    public IfcNormalisedRatioMeasure getInitialStress() {
        return initialStress;
    }

    public void setInitialStress(IfcNormalisedRatioMeasure initialStress) {
        this.initialStress = initialStress;
    }
}
