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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcOptionField;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcTextStyleSelect;

/**
 * The text style with box characteristics allows the presentation of annotated text by specifying
 * the characteristics of the character boxes of the text and the spacing between the character boxes.
 *
 * @author zaiyuan
 * @date 2022/9/2 19:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcTextStyleWithBoxCharacteristics extends IfcAbstractClass
    implements
        IfcTextStyleSelect {
    @IfcOptionField
    private IfcPositiveLengthMeasure boxHeight;
    @IfcOptionField
    private IfcPositiveLengthMeasure boxWidth;
    @IfcOptionField
    private IfcPlaneAngleMeasure boxSlantAngle;
    @IfcOptionField
    private IfcPlaneAngleMeasure boxRotateAngle;
    @IfcOptionField
    private IfcSizeSelect characterSpacing;

    @IfcParserConstructor
    public IfcTextStyleWithBoxCharacteristics(
        IfcPositiveLengthMeasure boxHeight,
        IfcPositiveLengthMeasure boxWidth,
        IfcPlaneAngleMeasure boxSlantAngle,
        IfcPlaneAngleMeasure boxRotateAngle,
        IfcSizeSelect characterSpacing
    ) {
        this.boxHeight = boxHeight;
        this.boxWidth = boxWidth;
        this.boxSlantAngle = boxSlantAngle;
        this.boxRotateAngle = boxRotateAngle;
        this.characterSpacing = characterSpacing;
    }

    public IfcPositiveLengthMeasure getBoxHeight() {
        return boxHeight;
    }

    public void setBoxHeight(IfcPositiveLengthMeasure boxHeight) {
        this.boxHeight = boxHeight;
    }

    public IfcPositiveLengthMeasure getBoxWidth() {
        return boxWidth;
    }

    public void setBoxWidth(IfcPositiveLengthMeasure boxWidth) {
        this.boxWidth = boxWidth;
    }

    public IfcPlaneAngleMeasure getBoxSlantAngle() {
        return boxSlantAngle;
    }

    public void setBoxSlantAngle(IfcPlaneAngleMeasure boxSlantAngle) {
        this.boxSlantAngle = boxSlantAngle;
    }

    public IfcPlaneAngleMeasure getBoxRotateAngle() {
        return boxRotateAngle;
    }

    public void setBoxRotateAngle(IfcPlaneAngleMeasure boxRotateAngle) {
        this.boxRotateAngle = boxRotateAngle;
    }

    public IfcSizeSelect getCharacterSpacing() {
        return characterSpacing;
    }

    public void setCharacterSpacing(IfcSizeSelect characterSpacing) {
        this.characterSpacing = characterSpacing;
    }
}
