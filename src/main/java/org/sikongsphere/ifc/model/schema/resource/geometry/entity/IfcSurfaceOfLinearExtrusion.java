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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.entity.IfcProfileDef;

/**
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcSurfaceOfLinearExtrusion extends IfcSweptSurface {
    private IfcDirection extrudedDirection;
    private IfcLengthMeasure depth;
    @IfcDeriveParameter
    private IfcVector extrusionAxis;

    @IfcParserConstructor
    public IfcSurfaceOfLinearExtrusion(
        IfcProfileDef sweptCurve,
        IfcAxis2Placement3D position,
        IfcDirection extrudedDirection,
        IfcLengthMeasure depth
    ) {
        super(sweptCurve, position);
        this.extrudedDirection = extrudedDirection;
        this.depth = depth;
    }

    public IfcDirection getExtrudedDirection() {
        return extrudedDirection;
    }

    public void setExtrudedDirection(IfcDirection extrudedDirection) {
        this.extrudedDirection = extrudedDirection;
    }

    public IfcLengthMeasure getDepth() {
        return depth;
    }

    public void setDepth(IfcLengthMeasure depth) {
        this.depth = depth;
    }

    public IfcVector getExtrusionAxis() {
        return extrusionAxis;
    }

    public void setExtrusionAxis(IfcVector extrusionAxis) {
        this.extrusionAxis = extrusionAxis;
    }
}
