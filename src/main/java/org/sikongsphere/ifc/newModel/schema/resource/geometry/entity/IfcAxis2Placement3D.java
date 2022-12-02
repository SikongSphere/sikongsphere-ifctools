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
package org.sikongsphere.ifc.newModel.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.measure.selecttypes.IfcAxis2Placement;

/**
 * The location and orientation in three dimensional space
 * of three mutually perpendicular axes.
 *
 * @author stan
 * @date 2022/09/01 21:34
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAxis2Placement3D extends IfcPlacement implements IfcAxis2Placement {

    private IfcDirection axis;
    private IfcDirection refDirection;

    public IfcAxis2Placement3D() {}

    @IfcParserConstructor
    public IfcAxis2Placement3D(
        IfcCartesianPoint point,
        IfcDirection axis,
        IfcDirection refDirection
    ) {
        setLocation(point);
        this.axis = axis;
        this.refDirection = refDirection;
    }

    public IfcAxis2Placement3D(IfcCartesianPoint location) {
        setLocation(location);
    }

    public IfcAxis2Placement3D(Double x, Double y, Double z) {
        setLocation(new IfcCartesianPoint(x, y, z));
    }

    public IfcDirection getAxis() {
        return axis;
    }

    public void setAxis(IfcDirection axis) {
        this.axis = axis;
    }

    public IfcDirection getRefDirection() {
        return refDirection;
    }

    public void setRefDirection(IfcDirection refDirection) {
        this.refDirection = refDirection;
    }
}
