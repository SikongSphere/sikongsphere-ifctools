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
package org.sikongsphere.ifc.newModel.resource.presentationappearance.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcLabel;
import org.sikongsphere.ifc.newModel.resource.measure.definedtype.IfcPositiveRatioMeasure;
import org.sikongsphere.ifc.newModel.resource.presentationappearance.selecttype.IfcCurveStyleFontSelect;

/**
 * A curve style font and scaling is a curve style font and a scalar factor for that font,
 * so that a given curve style font may be applied at various scales.
 *
 * @author stan
 * @date 2022/09/01 23:42
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCurveStyleFontAndScaling {
    private IfcLabel name;
    private IfcCurveStyleFontSelect curveFont;
    private IfcPositiveRatioMeasure curveFontScaling;

    public IfcCurveStyleFontAndScaling() {}

    public IfcCurveStyleFontAndScaling(
        IfcLabel name,
        IfcCurveStyleFontSelect curveFont,
        IfcPositiveRatioMeasure curveFontScaling
    ) {
        this.name = name;
        this.curveFont = curveFont;
        this.curveFontScaling = curveFontScaling;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public IfcCurveStyleFontSelect getCurveFont() {
        return curveFont;
    }

    public void setCurveFont(IfcCurveStyleFontSelect curveFont) {
        this.curveFont = curveFont;
    }

    public IfcPositiveRatioMeasure getCurveFontScaling() {
        return curveFontScaling;
    }

    public void setCurveFontScaling(IfcPositiveRatioMeasure curveFontScaling) {
        this.curveFontScaling = curveFontScaling;
    }
}
