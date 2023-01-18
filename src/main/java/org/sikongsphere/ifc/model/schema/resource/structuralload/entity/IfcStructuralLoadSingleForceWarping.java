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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcForceMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcTorqueMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcWarpingMomentMeasure;

/**
 * Instances of the entity IfcStructuralLoadSingleForceWarping, as a subtype of IfcStructuralLoadSingleForce,
 * shall be used to define an action opertion on a single point. In addition to forces and moments defined by
 * its supertype a warping moment can be defined.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadSingleForceWarping extends IfcStructuralLoadSingleForce {
    @IfcOptionField
    private IfcWarpingMomentMeasure warpingMoment;

    @IfcParserConstructor
    public IfcStructuralLoadSingleForceWarping(
        IfcLabel name,
        IfcForceMeasure forceX,
        IfcForceMeasure forceY,
        IfcForceMeasure forceZ,
        IfcTorqueMeasure momentX,
        IfcTorqueMeasure momentY,
        IfcTorqueMeasure momentZ,
        IfcWarpingMomentMeasure warpingMoment
    ) {
        super(name, forceX, forceY, forceZ, momentX, momentY, momentZ);
        this.warpingMoment = warpingMoment;
    }

    public IfcWarpingMomentMeasure getWarpingMoment() {
        return warpingMoment;
    }

    public void setWarpingMoment(IfcWarpingMomentMeasure warpingMoment) {
        this.warpingMoment = warpingMoment;
    }
}
