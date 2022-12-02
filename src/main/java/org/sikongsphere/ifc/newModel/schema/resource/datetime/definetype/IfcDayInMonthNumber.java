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
package org.sikongsphere.ifc.newModel.schema.resource.datetime.definetype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.INTEGER;
import org.sikongsphere.ifc.newModel.datatype.STRING;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;

/**
 * @author Wang Bohong
 * @date 2022/10/28 09:58
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcDayInMonthNumber extends IfcAbstractClass {
    private INTEGER val;

    public IfcDayInMonthNumber() {}

    @IfcParserConstructor
    public IfcDayInMonthNumber(INTEGER val) {
        this.val = val;
    }

    public IfcDayInMonthNumber(STRING val) {
        this.val = new INTEGER(Integer.valueOf(val.value));
    }

    public INTEGER getVal() {
        return val;
    }

    public void setVal(INTEGER val) {
        this.val = val;
    }
}
