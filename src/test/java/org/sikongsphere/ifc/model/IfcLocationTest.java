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
package org.sikongsphere.ifc.model;

import org.junit.Test;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcPolyline;

/**
 * This is a test suite for location
 *
 * @author zaiyuan
 * @date 2022/11/12 15:52
 */
public class IfcLocationTest {

    @Test
    public void createPoint() {
        IfcCartesianPoint ifcCartesianPoint = new IfcCartesianPoint(20.0, 30.0, 40.0);
        assert ifcCartesianPoint.getCoordinates().get(0).getValue() == 20.0;
        assert ifcCartesianPoint.getCoordinates().get(1).getValue() == 30.0;
        assert ifcCartesianPoint.getCoordinates().get(2).getValue() == 40.0;
    }

    @Test
    public void create3DAxis() {
        IfcAxis2Placement3D ifcAxis2Placement3D = new IfcAxis2Placement3D(20.0, 30.0, 40.0);
        IfcCartesianPoint location = ifcAxis2Placement3D.getLocation();
        assert location.getCoordinates().get(0).getValue() == 20.0;
        assert location.getCoordinates().get(1).getValue() == 30.0;
        assert location.getCoordinates().get(2).getValue() == 40.0;
    }

    @Test
    public void createPolylin() {
        IfcCartesianPoint startPoint = new IfcCartesianPoint(10.0, 10.0, 10.0);
        IfcCartesianPoint endPoint = new IfcCartesianPoint(10.0, 30.0, 20.0);
        LIST<IfcCartesianPoint> pointList = new LIST<>();
        pointList.add(startPoint);
        pointList.add(endPoint);
        IfcPolyline ifcPolyline = new IfcPolyline(pointList);

        assert ifcPolyline.getPoints().get(0).getCoordinates().get(1).getValue() == 10.0;
    }

    @Test
    public void createDirection() {
        IfcDirection direction = new IfcDirection(10.0, 20.0, 30.0);
        assert direction.getDirectionRatios().get(0) == 10.0;
    }
}
