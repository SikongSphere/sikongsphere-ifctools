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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;

/**
 * The location and orientation in three dimensional space
 * of three mutually perpendicular axes.
 *
 * @author stan
 * @modifu yiwei
 * @date 2022/09/01 21:34
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAxis2Placement3D extends IfcPlacement implements IfcAxis2Placement {

    @IfcOptionField
    private IfcDirection axis;
    @IfcOptionField
    private IfcDirection refDirection;

    @IfcDeriveParameter
    private LIST<IfcDirection> p;

    public IfcAxis2Placement3D() {}

    public IfcAxis2Placement3D(IfcDirection axis, IfcDirection refDirection) {
        this.axis = axis;
        this.refDirection = refDirection;
    }

    @IfcParserConstructor
    public IfcAxis2Placement3D(
        IfcCartesianPoint location,
        IfcDirection axis,
        IfcDirection refDirection
    ) {
        super(location);
        this.axis = axis;
        this.refDirection = refDirection;
    }

    public IfcAxis2Placement3D(IfcCartesianPoint location) {
        setLocation(location);
    }

    public IfcAxis2Placement3D(DOUBLE x, DOUBLE y, DOUBLE z) {
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

    public LIST<IfcDirection> getP() {
        return p;
    }

    public void setP(LIST<IfcDirection> p) {
        this.p = p;
    }

    @Override
    public boolean isDefault() {
        return axis.isDefault() && refDirection.isDefault();
    }
}
