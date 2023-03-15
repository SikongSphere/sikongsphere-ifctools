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

import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcIdentifier;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcInteger;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLogical;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcProperty;
import org.sikongsphere.ifc.model.schema.resource.property.entity.IfcPropertySingleValue;
import org.sikongsphere.ifc.sdk.create.order.IOrder;

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

    public IfcPropertySingleValue createSingleValueProperty(String value, String name) {
        return new IfcPropertySingleValue(
            new IfcIdentifier(name),
            null,
            new IfcLogical(new STRING(value)),
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
