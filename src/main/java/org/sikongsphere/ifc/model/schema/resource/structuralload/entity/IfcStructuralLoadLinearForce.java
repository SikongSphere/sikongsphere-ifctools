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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLinearForceMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLinearMomentMeasure;

/**
 *  An instance of the entity IfcStructuralLoadLinearForce shall be used to define actions on curves.
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadLinearForce extends IfcStructuralLoadStatic {
    @IfcOptionField
    private IfcLinearForceMeasure linearForceX;
    @IfcOptionField
    private IfcLinearForceMeasure linearForceY;
    @IfcOptionField
    private IfcLinearForceMeasure linearForceZ;
    @IfcOptionField
    private IfcLinearMomentMeasure linearMomentX;
    @IfcOptionField
    private IfcLinearMomentMeasure linearMomentY;
    @IfcOptionField
    private IfcLinearMomentMeasure linearMomentZ;

    @IfcParserConstructor
    public IfcStructuralLoadLinearForce(
        IfcLabel name,
        IfcLinearForceMeasure linearForceX,
        IfcLinearForceMeasure linearForceY,
        IfcLinearForceMeasure linearForceZ,
        IfcLinearMomentMeasure linearMomentX,
        IfcLinearMomentMeasure linearMomentY,
        IfcLinearMomentMeasure linearMomentZ
    ) {
        super(name);
        this.linearForceX = linearForceX;
        this.linearForceY = linearForceY;
        this.linearForceZ = linearForceZ;
        this.linearMomentX = linearMomentX;
        this.linearMomentY = linearMomentY;
        this.linearMomentZ = linearMomentZ;
    }

    public IfcLinearForceMeasure getLinearForceX() {
        return linearForceX;
    }

    public void setLinearForceX(IfcLinearForceMeasure linearForceX) {
        this.linearForceX = linearForceX;
    }

    public IfcLinearForceMeasure getLinearForceY() {
        return linearForceY;
    }

    public void setLinearForceY(IfcLinearForceMeasure linearForceY) {
        this.linearForceY = linearForceY;
    }

    public IfcLinearForceMeasure getLinearForceZ() {
        return linearForceZ;
    }

    public void setLinearForceZ(IfcLinearForceMeasure linearForceZ) {
        this.linearForceZ = linearForceZ;
    }

    public IfcLinearMomentMeasure getLinearMomentX() {
        return linearMomentX;
    }

    public void setLinearMomentX(IfcLinearMomentMeasure linearMomentX) {
        this.linearMomentX = linearMomentX;
    }

    public IfcLinearMomentMeasure getLinearMomentY() {
        return linearMomentY;
    }

    public void setLinearMomentY(IfcLinearMomentMeasure linearMomentY) {
        this.linearMomentY = linearMomentY;
    }

    public IfcLinearMomentMeasure getLinearMomentZ() {
        return linearMomentZ;
    }

    public void setLinearMomentZ(IfcLinearMomentMeasure linearMomentZ) {
        this.linearMomentZ = linearMomentZ;
    }
}
