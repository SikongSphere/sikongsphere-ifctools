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
package org.sikongsphere.ifc.model.schema.resource.datetime.defineType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.NUMBER;
import org.sikongsphere.ifc.model.datatype.STRING;

/**
 * @author Wang Bohong
 * @date 2022/10/28 10:00
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE)
public class IfcSecondInMinute extends NUMBER {

    @IfcParserConstructor
    public IfcSecondInMinute(DOUBLE value) {
        super(value);
        check();
    }

    // TODO 校验合法性
}
