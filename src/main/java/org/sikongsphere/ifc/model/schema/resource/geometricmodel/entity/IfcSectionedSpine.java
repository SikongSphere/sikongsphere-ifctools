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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.*;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * A sectioned spine is a representation of the shape of a three dimensional object composed of a spine curve and a
 * number of planar cross sections. The shape is defined between the first element of cross sections and the last
 * element of this set.
 *
 * @author yiwei
 * @date 2023/1/9
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSectionedSpine extends IfcGeometricRepresentationItem {
    private IfcCompositeCurve spineCurve;
    private LIST<IfcProfileDef> crossSections;
    private LIST<IfcAxis2Placement3D> crossSectionPositions;
    @IfcDeriveParameter
    private IfcDimensionCount dim;

    @IfcParserConstructor
    public IfcSectionedSpine(
        IfcCompositeCurve spineCurve,
        LIST<IfcProfileDef> crossSections,
        LIST<IfcAxis2Placement3D> crossSectionPositions
    ) {
        this.spineCurve = spineCurve;
        this.crossSections = crossSections;
        this.crossSectionPositions = crossSectionPositions;
    }

    public IfcCompositeCurve getSpineCurve() {
        return spineCurve;
    }

    public void setSpineCurve(IfcCompositeCurve spineCurve) {
        this.spineCurve = spineCurve;
    }

    public LIST<IfcProfileDef> getCrossSections() {
        return crossSections;
    }

    public void setCrossSections(LIST<IfcProfileDef> crossSections) {
        this.crossSections = crossSections;
    }

    public LIST<IfcAxis2Placement3D> getCrossSectionPositions() {
        return crossSectionPositions;
    }

    public void setCrossSectionPositions(LIST<IfcAxis2Placement3D> crossSectionPositions) {
        this.crossSectionPositions = crossSectionPositions;
    }

    public IfcDimensionCount getDim() {
        return dim;
    }

    public void setDim(IfcDimensionCount dim) {
        this.dim = dim;
    }
}
