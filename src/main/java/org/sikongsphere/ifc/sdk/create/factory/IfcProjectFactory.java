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

import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcObjectDefinition;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProject;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAggregates;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuilding;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuildingStorey;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSite;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity.IfcLocalPlacement;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcSIUnit;
import org.sikongsphere.ifc.model.schema.resource.measure.entity.IfcUnitAssignment;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcGeometricRepresentationContext;
import org.sikongsphere.ifc.model.schema.resource.representation.entity.IfcRepresentationContext;
import org.sikongsphere.ifc.model.schema.resource.utility.entity.IfcOwnerHistory;
import org.sikongsphere.ifc.sdk.create.order.IOrder;

/**
 * This is an factory for Project
 *
 * @Author: zaiyuan
 * @Date: 2022/11/23 11:47
 */
public class IfcProjectFactory extends AbstractFactory<IfcRoot> {

    @Override
    public IfcRoot create(IOrder<IfcRoot> order) {
        return null;
    }

    public IfcPostalAddress createPostalAddress() {
        return new IfcPostalAddress();
    }

    public IfcProject createProject() {
        IfcProject ifcProject = new IfcProject();

        return ifcProject;
    }

    public IfcProject createBlankProject() {
        IfcOwnerHistory ownerHistory = getOwnerHistory(ConfigProvider.getApplication());

        IfcAxis2Placement3D axis2Placement3D = new IfcAxis2Placement3D(
            new IfcCartesianPoint(0, 0, 0)
        );
        IfcGeometricRepresentationContext geometricRepresentationContext =
            new IfcGeometricRepresentationContext(null, "Model", 3, 1.0e-5, axis2Placement3D, null);

        // Unit
        IfcUnitFactory unitFactory = new IfcUnitFactory();
        IfcSIUnit lengthUnit = unitFactory.createLengthUnit();
        IfcSIUnit planeAngleUnit = unitFactory.createPlaneAngleUnit();
        IfcSIUnit timeUnit = unitFactory.createTimeUnit();
        IfcUnitAssignment assignment = new IfcUnitAssignment(lengthUnit, planeAngleUnit, timeUnit);

        IfcLocalPlacement localPlacement = new IfcLocalPlacement(null, axis2Placement3D);

        SET<IfcRepresentationContext> representationContextSET = new SET<>();
        representationContextSET.add(geometricRepresentationContext);
        IfcProject project = new IfcProject(
            createUniqueId(),
            ownerHistory,
            "Default Project",
            "Description of Default Project",
            null,
            null,
            null,
            representationContextSET,
            assignment
        );

        // IfcBuildingElement
        IfcBuilding ifcBuilding = new IfcBuilding(
            createUniqueId(),
            ownerHistory,
            "Default Building",
            "Description",
            null,
            localPlacement,
            null,
            null,
            IfcElementCompositionEnum.ELEMENT,
            null,
            null,
            null
        );
        IfcBuildingStorey ifcBuildingStorey = new IfcBuildingStorey(
            createUniqueId(),
            ownerHistory,
            "Default Building Storey",
            "Description",
            null,
            localPlacement,
            null,
            null,
            IfcElementCompositionEnum.ELEMENT,
            null
        );
        // IfcRelations
        SET<IfcObjectDefinition> objectSET01 = new SET<>();
        objectSET01.add(ifcBuilding);
        new IfcRelAggregates(createUniqueId(), ownerHistory, null, null, project, objectSET01);

        SET<IfcObjectDefinition> objectSET02 = new SET<>();
        objectSET02.add(ifcBuildingStorey);
        new IfcRelAggregates(createUniqueId(), ownerHistory, null, null, ifcBuilding, objectSET02);
        return project;
    }

    public IfcProject createArchitectTemplateProject(String longName, String phase) {
        IfcProject ifcProject = new IfcProject();

        ifcProject.setLongName(new IfcLabel(longName));
        ifcProject.setPhase(new IfcLabel(phase));

        IfcUnitFactory unitFactory = new IfcUnitFactory();
        ifcProject.setUnitsInContext(unitFactory.createIfcUnitAssignment());

        IfcRepresentationFactory representationFactory = new IfcRepresentationFactory();
        ifcProject.addRepresentationContext(
            representationFactory.createGeometricRepresentationContext()
        );

        IfcSiteFactory siteFactory = new IfcSiteFactory();
        IfcSite site = siteFactory.createSite();

        IfcRelationShipFactory relationShipFactory = new IfcRelationShipFactory();
        IfcRelAggregates relAggregates = relationShipFactory.createRelAggregates(ifcProject, site);
        ifcProject.addIsDecomposedBy(relAggregates);

        ifcProject.setGlobalId(createUniqueId());
        ifcProject.setOwnerHistory(getOwnerHistory(ConfigProvider.getApplication()));

        return ifcProject;
    }

    public IfcSite createSite() {
        return new IfcSite();
    }

    public IfcBuilding createBuilding() {
        return new IfcBuilding();
    }

    public IfcBuildingStorey createBuildingStorey() {
        return new IfcBuildingStorey();
    }

}
