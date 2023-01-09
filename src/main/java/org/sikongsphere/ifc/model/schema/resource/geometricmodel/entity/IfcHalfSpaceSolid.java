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
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcBooleanOperand;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcGeometricSetSelect;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcSurface;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcBoolean;

/**
 * A half space solid is defined by the half space which is the regular subset of the domain which lies on one side of
 * an unbounded surface.
 *
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcHalfSpaceSolid extends IfcGeometricRepresentationItem implements IfcBooleanOperand {

    private IfcSurface baseSurface;
    private IfcBoolean agreementFlag;

    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcHalfSpaceSolid(IfcSurface baseSurface, IfcBoolean agreementFlag) {
        this.baseSurface = baseSurface;
        this.agreementFlag = agreementFlag;
    }

    public IfcSurface getBaseSurface() {
        return baseSurface;
    }

    public void setBaseSurface(IfcSurface baseSurface) {
        this.baseSurface = baseSurface;
    }

    public IfcBoolean getAgreementFlag() {
        return agreementFlag;
    }

    public void setAgreementFlag(IfcBoolean agreementFlag) {
        this.agreementFlag = agreementFlag;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
