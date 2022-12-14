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
package org.sikongsphere.ifc.model.schema.resource.measure.definedType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.datatype.ENUM;
import org.sikongsphere.ifc.model.datatype.STRING;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcSimpleValue;
import org.sikongsphere.ifc.model.schema.resource.measure.selectTypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/11/12 20:13
 */
@IfcClass(type = IfcType.DEFINED_TYPE, layer = IfcLayer.RESOURCE, isStepElement = false)
public class IfcBoolean extends BOOLEAN implements IfcValue, IfcSimpleValue {
    public IfcBoolean() {}

    public IfcBoolean(boolean value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcBoolean(STRING value) {
        String str = value.value;
        if (str != null) {
            if (str.contains("T")) {
                super.setValue(true);
            }
        }
    }

    public IfcBoolean(ENUM value) {
        String str = value.getEnumName();
        if (str != null) {
            if (str.contains("T")) {
                super.setValue(true);
            }
        }
    }
}
