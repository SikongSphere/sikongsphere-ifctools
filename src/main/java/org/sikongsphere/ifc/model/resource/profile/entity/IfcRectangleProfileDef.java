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
package org.sikongsphere.ifc.model.resource.profile.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.resource.profile.enumeration.IfcProfileTypeEnum;

/**
 * @author GaoSu
 * @date 2022/11/01 23:07
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcRectangleProfileDef extends IfcParameterizedProfileDef {
    private IfcPositiveLengthMeasure xDim;
    private IfcPositiveLengthMeasure yDim;

    public IfcRectangleProfileDef() {}

    @IfcParserConstructor
    public IfcRectangleProfileDef(
        IfcProfileTypeEnum profileType,
        IfcLabel profileName,
        IfcAxis2Placement2D position,
        IfcPositiveLengthMeasure xDim,
        IfcPositiveLengthMeasure yDim
    ) {
        super(profileType, profileName, position);
        this.xDim = xDim;
        this.yDim = yDim;
    }

    public IfcPositiveLengthMeasure getxDim() {
        return xDim;
    }

    public void setxDim(IfcPositiveLengthMeasure xDim) {
        this.xDim = xDim;
    }

    public IfcPositiveLengthMeasure getyDim() {
        return yDim;
    }

    public void setyDim(IfcPositiveLengthMeasure yDim) {
        this.yDim = yDim;
    }
}
