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
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcBooleanOperand;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcCsgSelect;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;

/**
 * Abstract supertype of all three dimensional primitives used as either tree root item, or as Boolean results within
 * an CSG solid model. All 3D CSG primitives are defined within an three-dimensional placement coordinate system,.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcCsgPrimitive3D extends IfcGeometricRepresentationItem
    implements
        IfcBooleanOperand,
        IfcCsgSelect {
    private IfcAxis2Placement3D position;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcCsgPrimitive3D(IfcAxis2Placement3D position) {
        this.position = position;
    }

    public IfcAxis2Placement3D getPosition() {
        return position;
    }

    public void setPosition(IfcAxis2Placement3D position) {
        this.position = position;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
