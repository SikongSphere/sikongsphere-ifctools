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
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelAggregates;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuilding;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcSite;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.sdk.order.IOrder;

public class IfcSiteFactory extends AbstractFactory<IfcSite> {
    @Override
    public IfcSite create(IOrder<IfcSite> order) {
        return null;
    }

    public IfcSite createSite() {
        IfcSite site = new IfcSite();

        site.setCompositionType(IfcElementCompositionEnum.ELEMENT);

        IfcBuildingFactory buildingFactory = new IfcBuildingFactory();
        IfcBuilding building = buildingFactory.createDefaultBuilding();

        IfcRelationShipFactory relationShipFactory = new IfcRelationShipFactory();
        IfcRelAggregates relAggregates = relationShipFactory.createRelAggregates(site, building);
        site.addIsDecomposedBy(relAggregates);

        site.setGlobalId(createUniqueId());
        site.setOwnerHistory(getOwnerHistory(ConfigProvider.getApplication()));
        site.setName(new IfcLabel("Default"));
        return site;
    }
}
