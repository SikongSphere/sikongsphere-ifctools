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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis1Placement;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcLine;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * A revolved area solid (IfcRevolvedAreaSolid) is a solid created by revolving a planar bounded surface about an axis.
 * Both, the axis and planar bounded surface shall be in the same plane and the axis shall not intersect the interior
 * of the swept area.
 *
 * @author yiwei
 * @date 2023/1/9
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRevolvedAreaSolid extends IfcSweptAreaSolid {
    private IfcAxis1Placement axis;
    private IfcPlaneAngleMeasure angle;
    @IfcDeriveParameter
    private IfcLine axisLine;

    public IfcRevolvedAreaSolid(IfcAxis1Placement axis, IfcPlaneAngleMeasure angle) {
        this.axis = axis;
        this.angle = angle;
    }

    @IfcParserConstructor
    public IfcRevolvedAreaSolid(
        IfcProfileDef sweptArea,
        IfcAxis2Placement3D position,
        IfcAxis1Placement axis,
        IfcPlaneAngleMeasure angle
    ) {
        super(sweptArea, position);
        this.axis = axis;
        this.angle = angle;
    }

    public IfcAxis1Placement getAxis() {
        return axis;
    }

    public void setAxis(IfcAxis1Placement axis) {
        this.axis = axis;
    }

    public IfcPlaneAngleMeasure getAngle() {
        return angle;
    }

    public void setAngle(IfcPlaneAngleMeasure angle) {
        this.angle = angle;
    }

    public IfcLine getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(IfcLine axisLine) {
        this.axisLine = axisLine;
    }
}
