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
import org.sikongsphere.ifc.model.schema.shared.building.entity.IfcWindow;
import org.sikongsphere.ifc.sdk.create.order.IOrder;
import org.sikongsphere.ifc.sdk.create.order.IfcWindowOrder;

/**
 * This is an factory for window
 *
 * @author Wang Bohong
 * @Date 2023/05/25
 */
public class IfcWindowFactory extends AbstractFactory<IfcWindow> {
    @Override
    public IfcWindow create(IOrder<IfcWindow> order) {
        if (order instanceof IfcWindowOrder) {
            return create((IfcWindowOrder) order);
        }
        return null;
    }

    public IfcWindow create(IfcWindowOrder order) {
        return new IfcWindow(
            new IfcGloballyUniqueId((order.getGlobalId())),
            getOwnerHistory(ConfigProvider.getApplication()),
            new IfcLabel(order.getName()),
            new IfcText(order.getDescription()),
            new IfcLabel(order.getObjectType()),
            null, // factory does not define placement
            null, // factory does not define representation
            new IfcIdentifier(order.getTag()),
            new IfcPositiveLengthMeasure(new DOUBLE(order.getOverallHeight())),
            new IfcPositiveLengthMeasure(new DOUBLE(order.getOverallWidth()))
        );
    }

    // ToDO create a standard window

}
