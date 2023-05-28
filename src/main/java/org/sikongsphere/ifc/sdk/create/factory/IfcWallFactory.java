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
package org.sikongsphere.ifc.sdk.create.factory;

import org.sikongsphere.ifc.common.constant.IntegerConstant;
import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.LOGICAL;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.entity.IfcExtrudedAreaSolid;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.*;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.*;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcArbitraryClosedProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcProductRepresentation;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcRepresentation;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcRepresentationContext;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcShapeRepresentation;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWall;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWallStandardCase;
import org.sikongsphere.ifc.sdk.create.order.IOrder;
import org.sikongsphere.ifc.sdk.create.order.IfcWallOrder;

/**
 * This is an factory for IfcWall
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public class IfcWallFactory extends AbstractFactory<IfcWall> {

    /**
     * create general wall
     * @param order order
     * @return  IfcWall instance
     */
    @Override
    public IfcWall create(IOrder<IfcWall> order) {
        if (order instanceof IfcWallOrder) {
            return create(order);
        }
        return null;
    }

    public IfcWall create(IfcWallOrder order) {
        return new IfcWall(
            new IfcGloballyUniqueId(order.getGlobalId()),
            getOwnerHistory(ConfigProvider.getApplication()),
            new IfcLabel(order.getName()),
            new IfcText(order.getDescription()),
            new IfcLabel(order.getObjectType()),
            null,   // factory does not define placement
            null,   // factory does not define representation
            new IfcIdentifier(order.getTag())
        );
    }

    /**
     * create standard wall
     * @param order order
     * @return  IfcWallStandardCase
     */
    public IfcWallStandardCase createStandardWall(IOrder<IfcWall> order) {
        // axis
        IfcPolyline wallAxisPolyline = new IfcPolyline();
        IfcCartesianPoint p0 = new IfcCartesianPoint(0, 0, 0);
        IfcCartesianPoint p1 = new IfcCartesianPoint(1, 0, 0);
        LIST<IfcCartesianPoint> points = new LIST<>(p0, p1);
        wallAxisPolyline.setPoints(points);
        // axis representation
        IfcRepresentationContext axisContextContextOfItems = new IfcRepresentationContext();
        IfcLabel axisRepresentationIdentifier = new IfcLabel("Axis");
        IfcLabel axisRepresentationType = new IfcLabel("Ployline2D");
        SET<IfcRepresentationItem> axisItems = new SET<>(wallAxisPolyline);
        IfcShapeRepresentation axisRepresentation = new IfcShapeRepresentation(
            axisContextContextOfItems,
            axisRepresentationIdentifier,
            axisRepresentationType,
            axisItems
        );
        // body solid
        IfcLabel sweptAreaName = new IfcLabel("SweptAreaName");
        IfcCurve sweptAreaCurve = new IfcOffsetCurve2D(
            wallAxisPolyline,
            new IfcLengthMeasure(new DOUBLE(0.15)),
            new LOGICAL(IntegerConstant.FALSE)
        );
        IfcArbitraryClosedProfileDef sweptArea = new IfcArbitraryClosedProfileDef(
            IfcProfileTypeEnum.AREA,
            sweptAreaName,
            sweptAreaCurve
        );
        IfcAxis2Placement3D position = new IfcAxis2Placement3D(new IfcCartesianPoint(0, 0, 0));
        IfcDirection direction = new IfcDirection(new DOUBLE(0), new DOUBLE(1), new DOUBLE(0));
        IfcPositiveLengthMeasure depth = new IfcPositiveLengthMeasure(new DOUBLE(3));
        IfcExtrudedAreaSolid wallbodySolid = new IfcExtrudedAreaSolid(
            sweptArea,
            position,
            direction,
            depth
        );
        // body representation
        IfcRepresentationContext bodyContextContextOfItems = new IfcRepresentationContext();
        IfcLabel bocyRepresentationIdentifier = new IfcLabel("Body");
        IfcLabel bodyRepresentationType = new IfcLabel("SweptSolid");
        SET<IfcRepresentationItem> bodyItems = new SET<>(wallbodySolid);
        IfcShapeRepresentation bodyRepresentation = new IfcShapeRepresentation(
            bodyContextContextOfItems,
            bocyRepresentationIdentifier,
            bodyRepresentationType,
            bodyItems
        );
        // wall representations
        IfcLabel representationName = new IfcLabel("IfcWallStandardCase representation name");
        IfcText representationDescription = new IfcText(
            "IfcWallStandardCase representation description"
        );
        LIST<IfcRepresentation> representations = new LIST<>(
            axisRepresentation,
            bodyRepresentation
        );
        IfcProductRepresentation productRepresentation = new IfcProductRepresentation(
            representationName,
            representationDescription,
            representations
        );

        // standardWall
        IfcWallStandardCase standardWall = (IfcWallStandardCase) create(order);
        standardWall.setRepresentation(productRepresentation);
        return standardWall;
    }
}
