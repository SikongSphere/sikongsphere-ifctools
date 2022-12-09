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
    private IfcPositiveLengthMeasure simiAxis1;
    private IfcPositiveLengthMeasure simiAxis2;

    @IfcParserConstructor
    public IfcEllipseProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure simiAxis1,
        IfcPositiveLengthMeasure simiAxis2
    ) {
        super(profileType, profileName, position);
        this.simiAxis1 = simiAxis1;
        this.simiAxis2 = simiAxis2;
    }

    public IfcPositiveLengthMeasure getSimiAxis1() {
        return simiAxis1;
    }

    public void setSimiAxis1(IfcPositiveLengthMeasure simiAxis1) {
        this.simiAxis1 = simiAxis1;
    }

    public IfcPositiveLengthMeasure getSimiAxis2() {
        return simiAxis2;
    }

    public void setSimiAxis2(IfcPositiveLengthMeasure simiAxis2) {
        this.simiAxis2 = simiAxis2;
    }
}
