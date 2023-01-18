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
import org.sikongsphere.ifc.common.annotation.IfcDeriveParameter;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.REAL;

/**
 * A Cartesian transformation operator 2d
 * defines a geometric transformation in two-dimensional space composed of
 * translation, rotation, mirroring and uniform scaling.
 *
 * @author stan
 * @date 2022/09/02 13:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCartesianTransformationOperator2D extends IfcCartesianTransformationOperator {
    @IfcDeriveParameter
    private LIST<IfcDirection> u;

    public IfcCartesianTransformationOperator2D() {}

    @IfcParserConstructor
    public IfcCartesianTransformationOperator2D(
        IfcDirection axis1,
        IfcDirection axis2,
        IfcCartesianPoint localOrigin,
        REAL scale
    ) {
        super(axis1, axis2, localOrigin, scale);
    }

    public LIST<IfcDirection> getU() {
        return u;
    }

    public void setU(LIST<IfcDirection> u) {
        this.u = u;
    }
}
