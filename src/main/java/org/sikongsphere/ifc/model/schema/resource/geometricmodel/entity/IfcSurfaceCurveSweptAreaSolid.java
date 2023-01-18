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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcSurface;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcParameterValue;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 *  A surface curve swept area solid is a type of swept area solid which is the result of sweeping a face along a
 *  Directrix lying on a ReferenceSurface.
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceCurveSweptAreaSolid extends IfcSweptAreaSolid {
    private IfcCurve directrix;
    private IfcParameterValue startParam;
    private IfcParameterValue endParam;
    private IfcSurface referenceSurface;

    public IfcSurfaceCurveSweptAreaSolid() {}

    @IfcParserConstructor
    public IfcSurfaceCurveSweptAreaSolid(
        IfcProfileDef sweptArea,
        IfcAxis2Placement3D position,
        IfcCurve directrix,
        IfcParameterValue startParam,
        IfcParameterValue endParam,
        IfcSurface referenceSurface
    ) {
        super(sweptArea, position);
        this.directrix = directrix;
        this.startParam = startParam;
        this.endParam = endParam;
        this.referenceSurface = referenceSurface;
    }

    public IfcCurve getDirectrix() {
        return directrix;
    }

    public void setDirectrix(IfcCurve directrix) {
        this.directrix = directrix;
    }

    public IfcParameterValue getStartParam() {
        return startParam;
    }

    public void setStartParam(IfcParameterValue startParam) {
        this.startParam = startParam;
    }

    public IfcParameterValue getEndParam() {
        return endParam;
    }

    public void setEndParam(IfcParameterValue endParam) {
        this.endParam = endParam;
    }

    public IfcSurface getReferenceSurface() {
        return referenceSurface;
    }

    public void setReferenceSurface(IfcSurface referenceSurface) {
        this.referenceSurface = referenceSurface;
    }
}
