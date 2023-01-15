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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWall;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWallStandardCase;
import org.sikongsphere.ifc.sdk.order.IOrder;
import org.sikongsphere.ifc.sdk.order.IfcWallOrder;

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
        return null;
    }
}
