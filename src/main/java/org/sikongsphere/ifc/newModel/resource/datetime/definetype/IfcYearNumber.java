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
package org.sikongsphere.ifc.newModel.resource.datetime.definetype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.basic.INTEGER;
import org.sikongsphere.ifc.newModel.basic.STRING;

/**
 * @author Wang Bohong
 * @date 2022/10/28 10:07
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcYearNumber {
    private INTEGER val;

    public IfcYearNumber() {}

    @IfcParserConstructor
    public IfcYearNumber(INTEGER val) {
        this.val = val;
    }

    public IfcYearNumber(STRING val) {
        this.val = new INTEGER(Integer.valueOf(val.value));
    }

    public INTEGER getVal() {
        return val;
    }

    public void setVal(INTEGER val) {
        this.val = val;
    }
}
