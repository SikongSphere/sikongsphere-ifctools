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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometry.selectType.IfcAxis2Placement;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveRatioMeasure;

/**
 *  An ellipse (IfcEllipse) is a conic section defined by the lengths of the semi-major and semi-minor diameters
 *  and the position (center or mid point of the line joining the foci) and orientation of the curve.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcEllipse extends IfcConic {
    private IfcPositiveRatioMeasure semiAxis1;
    private IfcPositiveRatioMeasure semiAxis2;

    @IfcParserConstructor
    public IfcEllipse(
        IfcAxis2Placement position,
        IfcPositiveRatioMeasure semiAxis1,
        IfcPositiveRatioMeasure semiAxis2
    ) {
        super(position);
        this.semiAxis1 = semiAxis1;
        this.semiAxis2 = semiAxis2;
    }

    public IfcPositiveRatioMeasure getSemiAxis1() {
        return semiAxis1;
    }

    public void setSemiAxis1(IfcPositiveRatioMeasure semiAxis1) {
        this.semiAxis1 = semiAxis1;
    }

    public IfcPositiveRatioMeasure getSemiAxis2() {
        return semiAxis2;
    }

    public void setSemiAxis2(IfcPositiveRatioMeasure semiAxis2) {
        this.semiAxis2 = semiAxis2;
    }
}
