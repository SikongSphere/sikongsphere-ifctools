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
package org.sikongsphere.ifc.model.resource.presentationappearance.entity;

import org.sikongsphere.ifc.model.basic.SET;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcLabel;

/**
 * A curve style font combines several curve style font pattern entities
 * into a more complex pattern.
 * The resulting pattern is repeated along the curve.
 *
 * @author stan
 * @date 2022/09/10 23:37
 */
public class IfcCurveStyleFont {
    private IfcLabel name;
    private SET<IfcCurveStyleFontPattern> patternList;

    public IfcCurveStyleFont() {}

    public IfcCurveStyleFont(IfcLabel name, SET<IfcCurveStyleFontPattern> patternList) {
        this.name = name;
        this.patternList = patternList;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public SET<IfcCurveStyleFontPattern> getPatternList() {
        return patternList;
    }

    public void setPatternList(SET<IfcCurveStyleFontPattern> patternList) {
        this.patternList = patternList;
    }
}
