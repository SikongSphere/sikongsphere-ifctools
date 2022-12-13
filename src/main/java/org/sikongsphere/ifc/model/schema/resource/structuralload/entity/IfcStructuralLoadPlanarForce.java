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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlanarForceMeasure;

/**
 * This class is used to encapsulate actor role information
 *
 * @author yiwei
 * @date 2022-08-28 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcStructuralLoadPlanarForce extends IfcStructuralLoadStatic {
    @IfcOptionField
    private IfcPlanarForceMeasure planarForceX;
    @IfcOptionField
    private IfcPlanarForceMeasure planarForceY;
    @IfcOptionField
    private IfcPlanarForceMeasure planarForceZ;

    @IfcParserConstructor
    public IfcStructuralLoadPlanarForce(
        IfcLabel name,
        IfcPlanarForceMeasure planarForceX,
        IfcPlanarForceMeasure planarForceY,
        IfcPlanarForceMeasure planarForceZ
    ) {
        super(name);
        this.planarForceX = planarForceX;
        this.planarForceY = planarForceY;
        this.planarForceZ = planarForceZ;
    }

    public IfcPlanarForceMeasure getPlanarForceX() {
        return planarForceX;
    }

    public void setPlanarForceX(IfcPlanarForceMeasure planarForceX) {
        this.planarForceX = planarForceX;
    }

    public IfcPlanarForceMeasure getPlanarForceY() {
        return planarForceY;
    }

    public void setPlanarForceY(IfcPlanarForceMeasure planarForceY) {
        this.planarForceY = planarForceY;
    }

    public IfcPlanarForceMeasure getPlanarForceZ() {
        return planarForceZ;
    }

    public void setPlanarForceZ(IfcPlanarForceMeasure planarForceZ) {
        this.planarForceZ = planarForceZ;
    }
}
