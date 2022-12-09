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
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcAxis2Placement2D;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.profile.enumeration.IfcProfileTypeEnum;

import java.util.Locale;
import java.util.Optional;

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

    public IfcPositiveLengthMeasure getXDim() {
        return xDim;
    }

    public void setXDim(IfcPositiveLengthMeasure xDim) {
        this.xDim = xDim;
    }

    public IfcPositiveLengthMeasure getYDim() {
        return yDim;
    }

    public void setYDim(IfcPositiveLengthMeasure yDim) {
        this.yDim = yDim;
    }

    @Override
    public String toIfc() {
        String format = String.format(
            "#%s=%s(%s,%s,%s,%s,%s);",
            this.stepNumber,
            this.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            StringConstant.DOT + getProfileType() + StringConstant.DOT,
            Optional.ofNullable(getProfileName())
                .map(x -> getProfileName().toString())
                .orElse(StringConstant.DOLLAR),
            StringConstant.WELL + getPosition().getStepNumber(),
            getXDim().toString(),
            getYDim().toString()
        );

        return format;
    }
}
