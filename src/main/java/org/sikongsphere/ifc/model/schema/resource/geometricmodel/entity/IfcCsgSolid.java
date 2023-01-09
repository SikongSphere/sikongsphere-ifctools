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
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcCsgSelect;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * A solid represented as a CSG model is defined by a collection of so-called primitive solids, combined using
 * regularized Boolean operations.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCsgSolid extends IfcSolidModel {
    private IfcCsgSelect treeRootExpression;

    @IfcParserConstructor
    public IfcCsgSolid(IfcCsgSelect treeRootExpression) {
        this.treeRootExpression = treeRootExpression;
    }

    public IfcCsgSelect getTreeRootExpression() {
        return treeRootExpression;
    }

    public void setTreeRootExpression(IfcCsgSelect treeRootExpression) {
        this.treeRootExpression = treeRootExpression;
    }
}
