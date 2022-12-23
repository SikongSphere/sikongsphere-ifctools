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
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.NUMBER;
import org.sikongsphere.ifc.model.datatype.STRING;

/**
 * A parameter value is the value which specifies the amount of a parameter in some parameter space.
 * @author zaiyuan
 * @date 2022/12/07 21:38
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcParameterValue extends NUMBER {
    public IfcParameterValue() {}

    public IfcParameterValue(double value) {
        super(value);
    }

    public IfcParameterValue(DOUBLE value) {
        super(value.value);
    }

    @IfcParserConstructor
    public IfcParameterValue(STRING value) {
        super(value);
    }
}
