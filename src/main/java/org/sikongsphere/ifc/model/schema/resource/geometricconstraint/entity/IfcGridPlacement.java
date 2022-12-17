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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGridPlacement extends IfcObjectPlacement {
    private IfcVirtualGridIntersection placementLocation;
    @IfcOptionField
    private IfcVirtualGridIntersection placementRefDirection;

    @IfcParserConstructor
    public IfcGridPlacement(
        IfcVirtualGridIntersection placementLocation,
        IfcVirtualGridIntersection placementRefDirection
    ) {
        this.placementLocation = placementLocation;
        this.placementRefDirection = placementRefDirection;
    }

    public IfcVirtualGridIntersection getPlacementLocation() {
        return placementLocation;
    }

    public void setPlacementLocation(IfcVirtualGridIntersection placementLocation) {
        this.placementLocation = placementLocation;
    }

    public IfcVirtualGridIntersection getPlacementRefDirection() {
        return placementRefDirection;
    }

    public void setPlacementRefDirection(IfcVirtualGridIntersection placementRefDirection) {
        this.placementRefDirection = placementRefDirection;
    }
}
