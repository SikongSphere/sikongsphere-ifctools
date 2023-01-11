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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;

/**
 * A line is an unbounded curve with constant tangent direction.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcLine extends IfcCurve {
    private IfcCartesianPoint pnt;
    private IfcVector dir;

    @IfcParserConstructor
    public IfcLine(IfcCartesianPoint pnt, IfcVector dir) {
        this.pnt = pnt;
        this.dir = dir;
    }

    public IfcCartesianPoint getPnt() {
        return pnt;
    }

    public void setPnt(IfcCartesianPoint pnt) {
        this.pnt = pnt;
    }

    public IfcVector getDir() {
        return dir;
    }

    public void setDir(IfcVector dir) {
        this.dir = dir;
    }
}
