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
package org.sikongsphere.ifc.newModel.schema.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * The IfcRoundedRectangleProfileDef defines a rectangle with equally rounded corners as the profile definition used by
 * the swept surface geometry or the swept area solid. It is given by the X extent, the Y extent, and the radius for the
 * rounded corners, and placed within the 2D position coordinate system, established by the Position attribute. It is
 * placed centric within the position coordinate system, i.e. in the center of the bounding box.
 *
 * @author zaiyuan
 * @date 2022/12/08 20:33
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRoundedRectangleProfileDef extends IfcRectangleProfileDef {
    private IfcPositiveLengthMeasure roundingRadius;

    @IfcParserConstructor
    public IfcRoundedRectangleProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure xDim,
        IfcPositiveLengthMeasure yDim,
        IfcPositiveLengthMeasure roundingRadius
    ) {
        super(profileType, profileName, position, xDim, yDim);
        this.roundingRadius = roundingRadius;
    }

    public IfcPositiveLengthMeasure getRoundingRadius() {
        return roundingRadius;
    }

    public void setRoundingRadius(IfcPositiveLengthMeasure roundingRadius) {
        this.roundingRadius = roundingRadius;
    }

    @Override
    public boolean illegal() {
        return roundingRadius.value <= (getXDim().value / 2)
            && roundingRadius.value <= (getYDim().value / 2);
    }
}
