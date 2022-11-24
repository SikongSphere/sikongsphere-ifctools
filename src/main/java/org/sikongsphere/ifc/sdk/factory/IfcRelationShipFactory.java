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
import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcObjectDefinition;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcPropertySet;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelAggregates;
import org.sikongsphere.ifc.model.core.kernel.entity.IfcRelationship;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for relationship
 *
 * @Author: zaiyuan
 * @Date: 2022/11/23 21:47
 */
public class IfcRelationShipFactory extends AbstractFactory<IfcRelationship> {
    @Override
    public IfcRelationship create(IOrder<IfcRelationship> order) {
        return null;
    }

    public IfcRelAggregates createRelAggregates(IfcObjectDefinition relatingObject) {
        return new IfcRelAggregates(
            createUniqueId(),
            getOwnerHistory(ConfigProvider.getApplication()),
            null,
            null,
            relatingObject,
            new SET<>()
        );
    }

    public IfcRelAggregates createRelAggregates(
        IfcObjectDefinition relatingObject,
        IfcObjectDefinition relatedObject
    ) {
        SET<IfcObjectDefinition> relatedObjectSet = new SET<>();
        return new IfcRelAggregates(
            createUniqueId(),
            getOwnerHistory(ConfigProvider.getApplication()),
            null,
            null,
            relatingObject,
            relatedObjectSet
        );
    }

    public IfcRelAggregates createRelAggregates(
        IfcObjectDefinition relatingObject,
        SET<IfcObjectDefinition> relatedObjectSet
    ) {
        return new IfcRelAggregates(
            createUniqueId(),
            getOwnerHistory(ConfigProvider.getApplication()),
            null,
            null,
            relatingObject,
            relatedObjectSet
        );
    }

    public IfcPropertySet createPropertySet(String name) {
        return new IfcPropertySet(
            createUniqueId(),
            getOwnerHistory(ConfigProvider.getApplication()),
            new IfcLabel(name),
            null,
            null
        );
    }
}
