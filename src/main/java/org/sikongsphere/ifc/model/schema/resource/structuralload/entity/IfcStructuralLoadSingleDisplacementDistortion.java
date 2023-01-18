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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcCurvatureMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;

/**
 * Instances of the entity IfcStructuralLoadSingleForceWarping, as a subtype of IfcStructuralLoadSingleForce,
 * shall be used to define an action opertion on a single point. In addition to forces and moments defined
 * by its supertype a warping moment can be defined.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadSingleDisplacementDistortion extends
    IfcStructuralLoadSingleDisplacement {
    @IfcOptionField
    private IfcCurvatureMeasure distortion;

    @IfcParserConstructor
    public IfcStructuralLoadSingleDisplacementDistortion(
        IfcLabel name,
        IfcLengthMeasure displacementX,
        IfcLengthMeasure displacementY,
        IfcLengthMeasure displacementZ,
        IfcPlaneAngleMeasure rotationalDisplacementRX,
        IfcPlaneAngleMeasure rotationalDisplacementRY,
        IfcPlaneAngleMeasure rotationalDisplacementRZ,
        IfcCurvatureMeasure distortion
    ) {
        super(
            name,
            displacementX,
            displacementY,
            displacementZ,
            rotationalDisplacementRX,
            rotationalDisplacementRY,
            rotationalDisplacementRZ
        );
        this.distortion = distortion;
    }

    public IfcCurvatureMeasure getDistortion() {
        return distortion;
    }

    public void setDistortion(IfcCurvatureMeasure distortion) {
        this.distortion = distortion;
    }
}
