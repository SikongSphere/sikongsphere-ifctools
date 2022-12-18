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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcAxis1Placement extends IfcPlacement {
    private IfcDirection axis;
    @IfcDeriveParameter
    private IfcDirection z;

    @IfcParserConstructor
    public IfcAxis1Placement(IfcCartesianPoint location, IfcDirection axis) {
        super(location);
        this.axis = axis;
    }

    public IfcDirection getAxis() {
        return axis;
    }

    public void setAxis(IfcDirection axis) {
        this.axis = axis;
    }

    public IfcDirection getZ() {
        return z;
    }

    public void setZ(IfcDirection z) {
        this.z = z;
    }
}
