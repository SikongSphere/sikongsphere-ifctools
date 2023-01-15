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

/**
 * Instances of the entity IfcStructuralLoadSingleForce shall be used to define the forces and moments of an
 * action operating on a single point.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadSingleForce extends IfcStructuralLoadStatic {
    @IfcOptionField
    private IfcForceMeasure forceX;
    @IfcOptionField
    private IfcForceMeasure forceY;
    @IfcOptionField
    private IfcForceMeasure forceZ;
    @IfcOptionField
    private IfcTorqueMeasure momentX;
    @IfcOptionField
    private IfcTorqueMeasure momentY;
    @IfcOptionField
    private IfcTorqueMeasure momentZ;

    @IfcParserConstructor
    public IfcStructuralLoadSingleForce(
        IfcLabel name,
        IfcForceMeasure forceX,
        IfcForceMeasure forceY,
        IfcForceMeasure forceZ,
        IfcTorqueMeasure momentX,
        IfcTorqueMeasure momentY,
        IfcTorqueMeasure momentZ
    ) {
        super(name);
        this.forceX = forceX;
        this.forceY = forceY;
        this.forceZ = forceZ;
        this.momentX = momentX;
        this.momentY = momentY;
        this.momentZ = momentZ;
    }

    public IfcForceMeasure getForceX() {
        return forceX;
    }

    public void setForceX(IfcForceMeasure forceX) {
        this.forceX = forceX;
    }

    public IfcForceMeasure getForceY() {
        return forceY;
    }

    public void setForceY(IfcForceMeasure forceY) {
        this.forceY = forceY;
    }

    public IfcForceMeasure getForceZ() {
        return forceZ;
    }

    public void setForceZ(IfcForceMeasure forceZ) {
        this.forceZ = forceZ;
    }

    public IfcTorqueMeasure getMomentX() {
        return momentX;
    }

    public void setMomentX(IfcTorqueMeasure momentX) {
        this.momentX = momentX;
    }

    public IfcTorqueMeasure getMomentY() {
        return momentY;
    }

    public void setMomentY(IfcTorqueMeasure momentY) {
        this.momentY = momentY;
    }

    public IfcTorqueMeasure getMomentZ() {
        return momentZ;
    }

    public void setMomentZ(IfcTorqueMeasure momentZ) {
        this.momentZ = momentZ;
    }
}
