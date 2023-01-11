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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.REAL;

/**
 * A Cartesian transformation operator 2d non uniform defines a geometric transformation in two-dimensional space
 * composed of translation, rotation, mirroring and non uniform scaling.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCartesianTransformationOperator2DnonUniform extends
    IfcCartesianTransformationOperator2D {
    @IfcOptionField
    private REAL scale2;
    @IfcDeriveParameter
    private REAL scl2;

    public IfcCartesianTransformationOperator2DnonUniform(REAL scale2) {
        this.scale2 = scale2;
    }

    @IfcParserConstructor
    public IfcCartesianTransformationOperator2DnonUniform(
        IfcDirection axis1,
        IfcDirection axis2,
        IfcCartesianPoint localOrigin,
        REAL scale,
        REAL scale2
    ) {
        super(axis1, axis2, localOrigin, scale);
        this.scale2 = scale2;
    }

    public REAL getScale2() {
        return scale2;
    }

    public void setScale2(REAL scale2) {
        this.scale2 = scale2;
    }

    public REAL getScl2() {
        return scl2;
    }

    public void setScl2(REAL scl2) {
        this.scl2 = scl2;
    }
}
