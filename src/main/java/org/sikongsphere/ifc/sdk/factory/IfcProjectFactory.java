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

import org.sikongsphere.ifc.common.environment.ConfigProvider;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcProject;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAggregates;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRoot;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuilding;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuildingStorey;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSite;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.sdk.order.IOrder;

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
