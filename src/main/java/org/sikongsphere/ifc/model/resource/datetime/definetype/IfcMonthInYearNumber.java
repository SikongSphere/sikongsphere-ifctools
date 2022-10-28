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
package org.sikongsphere.ifc.model.resource.datetime.definetype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.INTEGER;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.body.IfcBodyTemplate;

/**
 * TODO: 日期规则校验
 * @author Wang Bohong
 * @date 2022/10/28 10:00
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcMonthInYearNumber extends IfcBodyTemplate {
    private INTEGER val;

    public IfcMonthInYearNumber() {}

    @IfcParserConstructor
    public IfcMonthInYearNumber(INTEGER val) {
        this.val = val;
    }

    public IfcMonthInYearNumber(STRING val) {
        this.val = new INTEGER(Integer.valueOf(val.value));
    }

    public INTEGER getVal() {
        return val;
    }

    public void setVal(INTEGER val) {
        this.val = val;
    }
}
