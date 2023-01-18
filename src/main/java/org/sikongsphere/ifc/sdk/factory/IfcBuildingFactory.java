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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcPropertySet;
import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelDefinesByProperties;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcBuilding;
import org.sikongsphere.ifc.model.schema.extension.product.enumeration.IfcElementCompositionEnum;
import org.sikongsphere.ifc.model.schema.resource.actor.entity.IfcPostalAddress;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for building
 *
 * @Author: zaiyuan
 * @Date: 2022/11/24 21:47
 */
public class IfcBuildingFactory extends AbstractFactory<IfcBuilding> {

    @Override
    public IfcBuilding create(IOrder<IfcBuilding> order) {
        return null;
    }

    public IfcBuilding createDefaultBuilding() {
        IfcBuilding ifcBuilding = new IfcBuilding();
        ifcBuilding.setBuildingAddress(createDefautlPostalAddress());
        ifcBuilding.setLongName(new IfcLabel(""));
        ifcBuilding.setCompositionType(IfcElementCompositionEnum.ELEMENT);

        // TODO IfcLocalPlacement

        IfcPropertyFactory propertyFactory = new IfcPropertyFactory();
        SET<IfcProperty> singleValueProperties = new SET<>();
        singleValueProperties.add(propertyFactory.createSingleValueProperty(0, "NumberOfStoreys"));
        singleValueProperties.add(
            propertyFactory.createSingleValueProperty("unkown", "IsLandmarked")
        );
        IfcPropertySet propertySet = new IfcPropertySet(
            createUniqueId(),
            getOwnerHistory(ConfigProvider.getApplication()),
            new IfcLabel("Pset_BuildingCommon"),
            null,
            singleValueProperties
        );

        IfcRelDefinesByProperties relDefinesByProperties = new IfcRelDefinesByProperties(
            createUniqueId(),
            getOwnerHistory(ConfigProvider.getApplication()),
            null,
            null,
            ifcBuilding,
            propertySet
        );
        ifcBuilding.addIsDefinedBy(relDefinesByProperties);

        ifcBuilding.setGlobalId(createUniqueId());
        ifcBuilding.setOwnerHistory(getOwnerHistory(ConfigProvider.getApplication()));
        ifcBuilding.setName(new IfcLabel(""));
        return ifcBuilding;
    }

    public IfcPostalAddress createDefautlPostalAddress() {
        IfcLabel label = new IfcLabel("请在此输入地址");
        LIST<IfcLabel> ifcLabelList = new LIST<>();
        ifcLabelList.add(label);
        return new IfcPostalAddress(
            null,
            null,
            null,
            null,
            ifcLabelList,
            null,
            new IfcLabel(""),
            new IfcLabel(""),
            new IfcLabel("beijing"),
            new IfcLabel("China")
        );
    }
}
