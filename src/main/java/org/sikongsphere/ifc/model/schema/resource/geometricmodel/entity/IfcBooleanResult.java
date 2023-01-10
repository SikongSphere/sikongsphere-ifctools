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
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcCsgSelect;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * A Boolean result is the result of a regularized operation on two solids to create a new solid.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcBooleanResult extends IfcGeometricRepresentationItem
    implements
        IfcBooleanOperand,
        IfcCsgSelect {
    private IfcBooleanOperator operator;
    private IfcBooleanOperand firstOperand;
    private IfcBooleanOperand secondOperand;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcBooleanResult(
        IfcBooleanOperator operator,
        IfcBooleanOperand firstOperand,
        IfcBooleanOperand secondOperand
    ) {
        this.operator = operator;
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
    }

    public IfcBooleanOperator getOperator() {
        return operator;
    }

    public void setOperator(IfcBooleanOperator operator) {
        this.operator = operator;
    }

    public IfcBooleanOperand getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(IfcBooleanOperand firstOperand) {
        this.firstOperand = firstOperand;
    }

    public IfcBooleanOperand getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(IfcBooleanOperand secondOperand) {
        this.secondOperand = secondOperand;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
