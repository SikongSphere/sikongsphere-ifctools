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
package org.sikongsphere.ifc.newModel.schema.resource.presentation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.constant.StringConstant;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.newModel.schema.resource.measure.definedType.IfcNormalisedRatioMeasure;
import org.sikongsphere.ifc.newModel.schema.resource.representation.entity.IfcColourSpecification;

import java.util.Locale;
import java.util.Optional;

/**
 * A colour rgb as a subtype of colour specifications is defined
 * by three colour component values for red, green, and blue in the RGB colour model.
 *
 * @author stan
 * @date 2022/09/02 13:18
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcColourRgb extends IfcColourSpecification {
    private IfcNormalisedRatioMeasure red;
    private IfcNormalisedRatioMeasure green;
    private IfcNormalisedRatioMeasure blue;

    public IfcColourRgb() {}

    @IfcParserConstructor
    public IfcColourRgb(
        IfcLabel name,
        IfcNormalisedRatioMeasure red,
        IfcNormalisedRatioMeasure green,
        IfcNormalisedRatioMeasure blue
    ) {
        super(name);
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public IfcNormalisedRatioMeasure getRed() {
        return red;
    }

    public void setRed(IfcNormalisedRatioMeasure red) {
        this.red = red;
    }

    public IfcNormalisedRatioMeasure getGreen() {
        return green;
    }

    public void setGreen(IfcNormalisedRatioMeasure green) {
        this.green = green;
    }

    public IfcNormalisedRatioMeasure getBlue() {
        return blue;
    }

    public void setBlue(IfcNormalisedRatioMeasure blue) {
        this.blue = blue;
    }
}
