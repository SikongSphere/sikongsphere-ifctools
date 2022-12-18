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
import org.sikongsphere.ifc.model.datatype.DOUBLE;
import org.sikongsphere.ifc.model.datatype.REAL;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCartesianTransformationOperator3DnonUniform extends
    IfcCartesianTransformationOperator3D {
    @IfcOptionField
    private REAL scale2;
    @IfcOptionField
    private REAL scale3;
    @IfcDeriveParameter
    private REAL scl2;
    @IfcDeriveParameter
    private REAL scl3;

    @IfcParserConstructor
    public IfcCartesianTransformationOperator3DnonUniform(
        IfcDirection axis1,
        IfcDirection axis2,
        IfcCartesianPoint localOrigin,
        DOUBLE scale,
        IfcDirection axis3,
        REAL scale2,
        REAL scale3
    ) {
        super(axis1, axis2, localOrigin, scale, axis3);
        this.scale2 = scale2;
        this.scale3 = scale3;
    }

    public REAL getScale2() {
        return scale2;
    }

    public void setScale2(REAL scale2) {
        this.scale2 = scale2;
    }

    public REAL getScale3() {
        return scale3;
    }

    public void setScale3(REAL scale3) {
        this.scale3 = scale3;
    }

    public REAL getScl2() {
        return scl2;
    }

    public void setScl2(REAL scl2) {
        this.scl2 = scl2;
    }

    public REAL getScl3() {
        return scl3;
    }

    public void setScl3(REAL scl3) {
        this.scl3 = scl3;
    }
}
