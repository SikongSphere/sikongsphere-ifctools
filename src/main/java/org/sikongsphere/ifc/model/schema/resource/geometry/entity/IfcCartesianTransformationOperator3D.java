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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.DOUBLE;

/**
 * @author GaoSu
 * @date 2022/11/01 22:57
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCartesianTransformationOperator3D extends IfcCartesianTransformationOperator {
    private IfcDirection axis3;

    public IfcCartesianTransformationOperator3D() {}

    @IfcParserConstructor
    public IfcCartesianTransformationOperator3D(
        IfcDirection axis1,
        IfcDirection axis2,
        IfcCartesianPoint localOrigin,
        DOUBLE scale,
        IfcDirection axis3
    ) {
        super(axis1, axis2, localOrigin, scale);
        this.axis3 = axis3;
    }

    public IfcDirection getAxis3() {
        return axis3;
    }

    public void setAxis3(IfcDirection axis3) {
        this.axis3 = axis3;
    }
}
