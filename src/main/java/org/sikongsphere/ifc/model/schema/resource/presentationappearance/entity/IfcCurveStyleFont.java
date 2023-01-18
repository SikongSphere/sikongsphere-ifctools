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
import org.sikongsphere.ifc.model.datatype.LIST;
import org.sikongsphere.ifc.model.datatype.SET;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLabel;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcCurveStyleFontSelect;

/**
 * A curve style font combines several curve style font pattern entities
 * into a more complex pattern.
 * The resulting pattern is repeated along the curve.
 *
 * @author stan
 * @date 2022/09/10 23:37
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCurveStyleFont extends IfcAbstractClass implements IfcCurveStyleFontSelect {

    @IfcOptionField
    private IfcLabel name;

    private LIST<IfcCurveStyleFontPattern> patternList;

    @IfcParserConstructor
    public IfcCurveStyleFont(IfcLabel name, LIST<IfcCurveStyleFontPattern> patternList) {
        this.name = name;
        this.patternList = patternList;
    }

    public IfcLabel getName() {
        return name;
    }

    public void setName(IfcLabel name) {
        this.name = name;
    }

    public LIST<IfcCurveStyleFontPattern> getPatternList() {
        return patternList;
    }

    public void setPatternList(LIST<IfcCurveStyleFontPattern> patternList) {
        this.patternList = patternList;
    }
}
