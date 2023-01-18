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
package org.sikongsphere.ifc.model.schema.resource.structuralload.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLinearStiffnessMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcRotationalStiffnessMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcWarpingMomentMeasure;

/**
 * IfcBoundaryNodeConditionWarping inherits all attributes from IfcBoundaryNodeCondition and includes additionally
 * the possibility to define a value describing the warping stiffness.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBoundaryNodeConditionWarping extends IfcBoundaryNodeCondition {
    @IfcOptionField
    private IfcWarpingMomentMeasure warpingStiffness;

    @IfcParserConstructor
    public IfcBoundaryNodeConditionWarping(
        IfcLabel name,
        IfcLinearStiffnessMeasure linearStiffnessX,
        IfcLinearStiffnessMeasure linearStiffnessY,
        IfcLinearStiffnessMeasure linearStiffnessZ,
        IfcRotationalStiffnessMeasure rotationalStiffnessX,
        IfcRotationalStiffnessMeasure rotationalStiffnessY,
        IfcRotationalStiffnessMeasure rotationalStiffnessZ,
        IfcWarpingMomentMeasure warpingStiffness
    ) {
        super(
            name,
            linearStiffnessX,
            linearStiffnessY,
            linearStiffnessZ,
            rotationalStiffnessX,
            rotationalStiffnessY,
            rotationalStiffnessZ
        );
        this.warpingStiffness = warpingStiffness;
    }

    public IfcWarpingMomentMeasure getWarpingStiffness() {
        return warpingStiffness;
    }

    public void setWarpingStiffness(IfcWarpingMomentMeasure warpingStiffness) {
        this.warpingStiffness = warpingStiffness;
    }
}
