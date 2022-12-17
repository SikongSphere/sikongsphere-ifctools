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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcInverseParameter;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.extension.product.entities.IfcGrid;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcBoolean;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;

/**
 * @author zaiyuan
 * @date 2022/12/10 12:13
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGridAxis extends IfcAbstractClass {
    @IfcOptionField
    private IfcLabel axisTag;
    private IfcCurve axisCurve;
    private IfcBoolean sameSense;

    @IfcInverseParameter
    private SET<IfcGrid> partOfW;
    @IfcInverseParameter
    private SET<IfcGrid> partOfV;
    @IfcInverseParameter
    private SET<IfcGrid> partOfU;
    @IfcInverseParameter
    private SET<IfcVirtualGridIntersection> hasIntersections;

    @IfcParserConstructor
    public IfcGridAxis(IfcLabel axisTag, IfcCurve axisCurve, IfcBoolean sameSense) {
        this.axisTag = axisTag;
        this.axisCurve = axisCurve;
        this.sameSense = sameSense;
    }

    public IfcLabel getAxisTag() {
        return axisTag;
    }

    public void setAxisTag(IfcLabel axisTag) {
        this.axisTag = axisTag;
    }

    public IfcCurve getAxisCurve() {
        return axisCurve;
    }

    public void setAxisCurve(IfcCurve axisCurve) {
        this.axisCurve = axisCurve;
    }

    public IfcBoolean getSameSense() {
        return sameSense;
    }

    public void setSameSense(IfcBoolean sameSense) {
        this.sameSense = sameSense;
    }

    public SET<IfcGrid> getPartOfW() {
        return partOfW;
    }

    public void setPartOfW(SET<IfcGrid> partOfW) {
        this.partOfW = partOfW;
    }

    public SET<IfcGrid> getPartOfV() {
        return partOfV;
    }

    public void setPartOfV(SET<IfcGrid> partOfV) {
        this.partOfV = partOfV;
    }

    public SET<IfcGrid> getPartOfU() {
        return partOfU;
    }

    public void setPartOfU(SET<IfcGrid> partOfU) {
        this.partOfU = partOfU;
    }

    public SET<IfcVirtualGridIntersection> getHasIntersections() {
        return hasIntersections;
    }

    public void setHasIntersections(SET<IfcVirtualGridIntersection> hasIntersections) {
        this.hasIntersections = hasIntersections;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
