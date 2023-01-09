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
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcParameterValue;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 * A swept disk solid is the solid produced by sweeping a circular disk along a three dimensional curve.
 * @author zaiyuan
 * @date 2022/12/17
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSweptDiskSolid extends IfcSolidModel {
    private IfcCurve directrix;
    private IfcPositiveLengthMeasure radius;
    @IfcOptionField
    private IfcPositiveLengthMeasure innerRadius;
    private IfcParameterValue startParam;
    private IfcParameterValue endParam;

    @IfcParserConstructor
    public IfcSweptDiskSolid(
        IfcCurve directrix,
        IfcPositiveLengthMeasure radius,
        IfcPositiveLengthMeasure innerRadius,
        IfcParameterValue startParam,
        IfcParameterValue endParam
    ) {
        this.directrix = directrix;
        this.radius = radius;
        this.innerRadius = innerRadius;
        this.startParam = startParam;
        this.endParam = endParam;
    }

    public IfcCurve getDirectrix() {
        return directrix;
    }

    public void setDirectrix(IfcCurve directrix) {
        this.directrix = directrix;
    }

    public IfcPositiveLengthMeasure getRadius() {
        return radius;
    }

    public void setRadius(IfcPositiveLengthMeasure radius) {
        this.radius = radius;
    }

    public IfcPositiveLengthMeasure getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(IfcPositiveLengthMeasure innerRadius) {
        this.innerRadius = innerRadius;
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
}
