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

import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcIdentifier;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcInteger;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLogical;
import org.sikongsphere.ifc.model.resource.proper.entity.IfcProperty;
import org.sikongsphere.ifc.model.resource.proper.entity.IfcPropertySingleValue;
import org.sikongsphere.ifc.sdk.order.IOrder;

/**
 * This is an factory for Property
 *
 * @Author: zaiyuan
 * @Date: 2022/11/23 11:47
 */
public class IfcPropertyFactory extends AbstractFactory<IfcProperty> {

    @Override
    public IfcProperty create(IOrder<IfcProperty> order) {
        return null;
    }

    public IfcPropertySingleValue createSingleValueProperty(boolean value, String name) {
        return new IfcPropertySingleValue(
            new IfcIdentifier(name),
            null,
            new IfcLogical(value),
            null
        );
    }

    public IfcPropertySingleValue createSingleValueProperty(Integer value, String name) {
        return new IfcPropertySingleValue(
            new IfcIdentifier(name),
            null,
            new IfcInteger(value),
            null
        );
    }
}
