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
package org.sikongsphere.ifc.model.schema.resource.geometricmodel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.enumeration.IfcBooleanOperator;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcBooleanOperand;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;

/**
 * A clipping result is defined as a special subtype of the general Boolean result (IfcBooleanResult).
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBooleanClippingResult extends IfcBooleanResult {

    @IfcParserConstructor
    public IfcBooleanClippingResult(
        IfcBooleanOperator operator,
        IfcBooleanOperand firstOperand,
        IfcBooleanOperand secondOperand
    ) {
        super(operator, firstOperand, secondOperand);
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
