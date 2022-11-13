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
package org.sikongsphere.ifc.model.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.basic.NUMBER;
import org.sikongsphere.ifc.model.basic.STRING;
import org.sikongsphere.ifc.model.resource.measure.selecttypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/11/13 11:47
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcCountMeasure extends NUMBER implements IfcValue {

    public IfcCountMeasure() {}

    public IfcCountMeasure(double value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcCountMeasure(STRING value) {
        super(value);
    }
}
