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
package org.sikongsphere.ifc.newModel.schema.resource.datetime.defineType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.INTEGER;

/**
 * @author Wang Bohong
 * @date 2022/10/28 09:58
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcDayInMonthNumber extends INTEGER {

    @IfcParserConstructor
    public IfcDayInMonthNumber(INTEGER value) {
        super(value);
        check();
    }

    @Override
    public boolean illegal() {
        return value >= 1 && value <= 12;
    }
}
