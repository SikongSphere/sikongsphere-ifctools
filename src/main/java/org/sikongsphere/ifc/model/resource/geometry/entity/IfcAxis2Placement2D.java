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
package org.sikongsphere.ifc.model.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcAxis2Placement;

/**
 * IfcAxis2Placement2D
 *
 * @author GaoSu
 * @date 2022/10/16 16:04
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAxis2Placement2D extends IfcPlacement {
    private IfcDirection refDirection;

    public IfcAxis2Placement2D() {}

    @IfcParserConstructor
    public IfcAxis2Placement2D(IfcCartesianPoint location, IfcDirection refDirection) {
        super(location);
        this.refDirection = refDirection;
    }

    public IfcDirection getRefDirection() {
        return refDirection;
    }

    public void setRefDirection(IfcDirection refDirection) {
        this.refDirection = refDirection;
    }
}
