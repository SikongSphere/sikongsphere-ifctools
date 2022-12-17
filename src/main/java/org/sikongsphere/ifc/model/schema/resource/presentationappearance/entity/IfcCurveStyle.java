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
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentation.selectType.IfcColour;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcCurveFontOrScaledCurveFontSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcSizeSelect;

/**
 * An IfcCurveStyle provides the style table for presentation information assigned to geometric curves.
 *
 * @author zaiyuan
 * @date 2022/9/2 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCurveStyle extends IfcPresentationStyle {
    @IfcOptionField
    private IfcCurveFontOrScaledCurveFontSelect curveFont;

    @IfcOptionField
    private IfcSizeSelect curveWidth;

    @IfcOptionField
    private IfcColour curveColour;

    public IfcCurveStyle() {}

    @IfcParserConstructor
    public IfcCurveStyle(
        IfcLabel name,
        IfcCurveFontOrScaledCurveFontSelect curveFont,
        IfcSizeSelect curveWidth,
        IfcColour curveColour
    ) {
        super(name);
        this.curveFont = curveFont;
        this.curveWidth = curveWidth;
        this.curveColour = curveColour;
    }

    public IfcCurveFontOrScaledCurveFontSelect getCurveFont() {
        return curveFont;
    }

    public void setCurveFont(IfcCurveFontOrScaledCurveFontSelect curveFont) {
        this.curveFont = curveFont;
    }

    public IfcSizeSelect getCurveWidth() {
        return curveWidth;
    }

    public void setCurveWidth(IfcSizeSelect curveWidth) {
        this.curveWidth = curveWidth;
    }

    public IfcColour getCurveColour() {
        return curveColour;
    }

    public void setCurveColour(IfcColour curveColour) {
        this.curveColour = curveColour;
    }
}
