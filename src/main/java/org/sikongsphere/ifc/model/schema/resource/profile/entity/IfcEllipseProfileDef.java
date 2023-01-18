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
package org.sikongsphere.ifc.model.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcEllipseProfileDef defines an ellipse as the profile definition used by the swept surface geometry or the swept
 * area solid. It is given by its semi axis attributes and placed within the 2D position coordinate system, established
 * by the Position attribute.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcEllipseProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure semiAxis1;
    private IfcPositiveLengthMeasure semiAxis2;

    @IfcParserConstructor
    public IfcEllipseProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure semiAxis1,
        IfcPositiveLengthMeasure semiAxis2
    ) {
        super(profileType, profileName, position);
        this.semiAxis1 = semiAxis1;
        this.semiAxis2 = semiAxis2;
    }

    public IfcPositiveLengthMeasure getSemiAxis1() {
        return semiAxis1;
    }

    public void setSemiAxis1(IfcPositiveLengthMeasure semiAxis1) {
        this.semiAxis1 = semiAxis1;
    }

    public IfcPositiveLengthMeasure getSemiAxis2() {
        return semiAxis2;
    }

    public void setSemiAxis2(IfcPositiveLengthMeasure semiAxis2) {
        this.semiAxis2 = semiAxis2;
    }
}
