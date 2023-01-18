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
package org.sikongsphere.ifc.model.schema.resource.topology.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;

/**
 * A poly loop is a loop with straight edges bounding a planar region in space. A poly loop is a loop of genus 1
 * where the loop is represented by an ordered coplanar collection of points forming the vertices of the loop.
 * The loop is composed of straight line segments joining a point in the collection to the succeeding point in
 * the collection. The closing segment is from the last to the first point in the collection.
 *
 * @author GaoSU
 * @date 2022/11/01 22:44
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPolyLoop extends IfcLoop {
    // TODO UNIQUE
    private LIST<IfcCartesianPoint> polygon;

    @IfcParserConstructor
    public IfcPolyLoop(LIST<IfcCartesianPoint> polygon) {
        this.polygon = polygon;
    }

    public LIST<IfcCartesianPoint> getPolygon() {
        return polygon;
    }

    public void setPolygon(LIST<IfcCartesianPoint> polygon) {
        this.polygon = polygon;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
