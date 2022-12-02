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
package org.sikongsphere.ifc.newModel.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.basic.INTEGER;
import org.sikongsphere.ifc.newModel.basic.STRING;
import org.sikongsphere.ifc.newModel.resource.measure.selecttypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/11/9 13:27
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY, isStepElement = false)
public class IfcInteger extends INTEGER implements IfcValue {

    public IfcInteger(Integer value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcInteger(STRING value) {
        super(value);
    }
}
