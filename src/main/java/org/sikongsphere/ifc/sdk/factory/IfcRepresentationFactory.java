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
package org.sikongsphere.ifc.sdk.factory;

import org.sikongsphere.ifc.model.basic.*;
import org.sikongsphere.ifc.model.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcGeometricRepresentationContext;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcGeometricRepresentationSubContext;
import org.sikongsphere.ifc.model.resource.representation.entity.IfcRepresentation;
import org.sikongsphere.ifc.model.resource.representation.enumeration.IfcGeometricProjectionEnum;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for IfcRepresentation
 *
 * @Author: zaiyuan
 * @Date: 2022/11/09 11:47
 */
public class IfcRepresentationFactory extends AbstractFactory<IfcRepresentation> {
    private final double DEFAULT_TRUE_NORTH_X = 6.123031769111886E-17;
    private final double DEFAULT_TRUE_NORTH_Y = 1.0;

    @Override
    public IfcRepresentation create(IOrder<IfcRepresentation> order) {
        return null;
    }

    /**
     * create presentation item
     */

    public IfcCartesianPoint createCartesianPoint(double x, double y, double z) {
        return new IfcCartesianPoint(x, y, z);
    }

    public IfcDirection createDirection(double x, double y) {
        LIST<Double> list = new LIST<>();
        list.add(x);
        list.add(y);
        return new IfcDirection(list);
    }

    /**
     * create default representation
     */

    public IfcDirection createDefaultTrueNorthDirection() {
        return createDirection(DEFAULT_TRUE_NORTH_X, DEFAULT_TRUE_NORTH_Y);
    }

    public IfcAxis2Placement3D createDefaultWorldCoordinateSystem() {
        return new IfcAxis2Placement3D(createCartesianPoint(0.0, 0.0, 0.0), null, null);
    }

    public IfcGeometricRepresentationSubContext createGeometricRepresentationSubContext(
        IfcGeometricRepresentationContext parentContext,
        String contextIdentifier,
        String contextType,
        IfcGeometricProjectionEnum targetView
    ) {
        return new IfcGeometricRepresentationSubContext(
            new IfcLabel(contextIdentifier),
            new IfcLabel(contextType),
            null,
            null,
            null,
            null,
            parentContext,
            null,
            targetView,
            null
        );
    }

    public IfcGeometricRepresentationContext createGeometricRepresentationContext() {
        IfcGeometricRepresentationContext context = new IfcGeometricRepresentationContext();
        IfcDimensionCount dimensionCount = new IfcDimensionCount(3);
        STRING precision = new STRING("0.01");
        IfcAxis2Placement3D worldCoordinateSystem = createDefaultWorldCoordinateSystem();
        IfcDirection trueNorthDirection = createDefaultTrueNorthDirection();
        SET<IfcGeometricRepresentationSubContext> subContextSet = new SET<>();
        subContextSet.add(
            createGeometricRepresentationSubContext(
                context,
                "Body",
                "Model",
                IfcGeometricProjectionEnum.MODEL_VIEW
            )
        );
        subContextSet.add(
            createGeometricRepresentationSubContext(
                context,
                "Axis",
                "Model",
                IfcGeometricProjectionEnum.GRAPH_VIEW
            )
        );
        subContextSet.add(
            createGeometricRepresentationSubContext(
                context,
                "Box",
                "Model",
                IfcGeometricProjectionEnum.MODEL_VIEW
            )
        );
        subContextSet.add(
            createGeometricRepresentationSubContext(
                context,
                "FootPrint",
                "Model",
                IfcGeometricProjectionEnum.MODEL_VIEW
            )
        );
        IfcLabel contextType = new IfcLabel("Model");

        context.setCoordinateSpaceDimension(dimensionCount);
        context.setPrecision(precision);
        context.setWorldCoordinateSystem(worldCoordinateSystem);
        context.setTrueNorth(trueNorthDirection);
        context.setHasSubContexts(subContextSet);
        context.setContextType(contextType);
        return context;
    }
}
