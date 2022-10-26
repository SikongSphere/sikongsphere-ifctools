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
package org.sikongsphere.ifc.model.resource.geometricmodel.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.geometry.definedtypes.IfcDimensionCount;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcAxis2Placement3D;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.resource.presentationorganization.entity.IfcPresentationLayerAssignment;
import org.sikongsphere.ifc.model.resource.presentationorganization.entity.IfcStyledItem;

/**
 * @author zhongqi
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid {
    private IfcDirection extrudedDirection;
    private IfcPositiveLengthMeasure depth;

    public IfcExtrudedAreaSolid() {}

    @IfcParserConstructor
    public IfcExtrudedAreaSolid(
        IfcPresentationLayerAssignment layerAssignments,
        IfcStyledItem styledByItem,
        IfcDimensionCount dim,
        IfcProfileDef sweptArea,
        IfcAxis2Placement3D position,
        IfcDirection extrudedDirection,
        IfcPositiveLengthMeasure depth
    ) {
        super(layerAssignments, styledByItem, dim, sweptArea, position);
        this.extrudedDirection = extrudedDirection;
        this.depth = depth;
    }

    public IfcDirection getExtrudedDirection() {
        return extrudedDirection;
    }

    public void setExtrudedDirection(IfcDirection extrudedDirection) {
        this.extrudedDirection = extrudedDirection;
    }

    public IfcPositiveLengthMeasure getDepth() {
        return depth;
    }

    public void setDepth(IfcPositiveLengthMeasure depth) {
        this.depth = depth;
    }
}
