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
package org.sikongsphere.ifc.model.schema.resource.measure.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.enumeration.IfcCurrencyEnum;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcUnit;

/**
 * IfcMonetaryUnit is a unit to define currency for money.
 *
 * @author zaiyuan
 * @date 2022-08-31 18:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcMonetaryUnit extends IfcAbstractClass implements IfcUnit {
    private IfcCurrencyEnum currency;

    @IfcParserConstructor
    public IfcMonetaryUnit(IfcCurrencyEnum currency) {
        this.currency = currency;
    }

    public IfcCurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(IfcCurrencyEnum currency) {
        this.currency = currency;
    }
}
