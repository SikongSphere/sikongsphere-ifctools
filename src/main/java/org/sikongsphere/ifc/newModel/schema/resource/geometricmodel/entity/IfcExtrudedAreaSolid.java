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
package org.sikongsphere.ifc.newModel.schema.resource.geometricmodel.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.IfcAbstractClass;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcDirection;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.measure.selectTypes.IfcAxis2Placement;
import org.sikongsphere.ifc.newModel.schema.resource.profile.entity.IfcProfileDef;

import java.util.Locale;

/**
 * @author zhongqi
 * @date 2022/10/26
 */

@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcExtrudedAreaSolid extends IfcSweptAreaSolid {
    private IfcDirection extrudedDirection;
    private IfcPositiveLengthMeasure depth;

    public IfcExtrudedAreaSolid() {}

    @IfcParserConstructor
    public IfcExtrudedAreaSolid(
        IfcProfileDef sweptArea,
        IfcAxis2Placement position,
        IfcDirection extrudedDirection,
        IfcPositiveLengthMeasure depth
    ) {
        super(sweptArea, position);
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

    @Override
    public String toIfc() {
        IfcAbstractClass position = (IfcAbstractClass) getPosition();

        String format = String.format("#%s=%s(%s,%s,%s,%s);",
                this.stepNumber,
                this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
                StringConstant.WELL + getSweptArea().getStepNumber(),
                StringConstant.WELL + position.getStepNumber(),
                StringConstant.WELL + getExtrudedDirection().getStepNumber(),
                getDepth()
        );

        return format;
    }
}
