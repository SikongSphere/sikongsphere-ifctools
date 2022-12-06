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
package org.sikongsphere.ifc.newModel.schema.resource.measure.definedtype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.datatype.LOGICAL;
import org.sikongsphere.ifc.newModel.datatype.STRING;
import org.sikongsphere.ifc.newModel.schema.resource.measure.selectTypes.IfcValue;

/**
 * @author Wang Bohong
 * @date 2022/9/1 16:09
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.DEFINED_TYPE, isStepElement = false)
public class IfcLogical extends LOGICAL implements IfcValue {
    public IfcLogical(boolean value) {
        super(value);
    }

    @IfcParserConstructor
    public IfcLogical(STRING value) {
        super(value);
    }
}
