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
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * A surface of revolution (IfcSurfaceOfRevolution) is the surface obtained by rotating a curve one complete
 * revolution about an axis.
 *
 * @author zaiyuan
 * @modify yiwei
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceOfRevolution extends IfcSweptSurface {
    private IfcAxis1Placement axisPosition;
    @IfcDeriveParameter
    private IfcLine axisLine;

    @IfcParserConstructor
    public IfcSurfaceOfRevolution(
        IfcProfileDef sweptCurve,
        IfcAxis2Placement3D position,
        IfcAxis1Placement axisPosition
    ) {
        super(sweptCurve, position);
        this.axisPosition = axisPosition;
    }

    public IfcAxis1Placement getAxisPosition() {
        return axisPosition;
    }

    public void setAxisPosition(IfcAxis1Placement axisPosition) {
        this.axisPosition = axisPosition;
    }

    public IfcLine getAxisLine() {
        return axisLine;
    }

    public void setAxisLine(IfcLine axisLine) {
        this.axisLine = axisLine;
    }
}
