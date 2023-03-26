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
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcText;
import org.sikongsphere.ifc.model.schema.resource.utility.definedtype.IfcGloballyUniqueId;
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcDoor;
import org.sikongsphere.ifc.sdk.create.order.IOrder;
import org.sikongsphere.ifc.sdk.create.order.IfcDoorOrder;

/**
 * @program: sikongsphere-ifctools
 * @description: IfcDoor 的工厂类
 * @author: Luoziniu
 * @create: 2023/03/26 00:52
 **/
public class IfcDoorFactory extends AbstractFactory<IfcDoor> {

    /**
     * create general Door
     * @param order order
     * @return IfcDoor instance
     */
    @Override
    public IfcDoor create(IOrder<IfcDoor> order) {
        if (order instanceof IfcDoorOrder) {
            return create(order);
        }
        return null;
    }

    public IfcDoor create(IfcDoorOrder order) {
        return new IfcDoor(
            new IfcGloballyUniqueId(order.getGlobalId()),
            getOwnerHistory(ConfigProvider.getApplication()),
            new IfcLabel(order.getName()),
            new IfcText(order.getDescription()),
            new IfcLabel(order.getObjectType()),
            null,   // factory does not define placement
            null,   // factory does not define representation
            new IfcIdentifier(order.getTag()),
            new IfcPositiveLengthMeasure(new DOUBLE(2.1)),
            new IfcPositiveLengthMeasure(new DOUBLE(2.1))
        );
    }

    /**
     * create standard door TODO 罗子牛
     * @param order order
     * @return  IfcDoorStandardCase
     */
    // public IfcDoorStandardCase createStandardDoor(IOrder<IfcDoor> order) {
    // return null;
    // }
}
