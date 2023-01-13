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
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcLengthMeasure;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPositiveLengthMeasure;

/**
 *  A curve style font pattern is a pair of visible
 *  and invisible curve segment length measures in presentation area units.
 *
 * @author stan
 * @date 2022/09/01 23:39
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcCurveStyleFontPattern extends IfcAbstractClass {
    private IfcLengthMeasure visibleSegmentLength;
    private IfcPositiveLengthMeasure invisibleSegmentLength;

    public IfcCurveStyleFontPattern() {}

    @IfcParserConstructor
    public IfcCurveStyleFontPattern(
        IfcLengthMeasure visibleSegmentLength,
        IfcPositiveLengthMeasure invisiblesegmentLength
    ) {
        this.visibleSegmentLength = visibleSegmentLength;
        this.invisibleSegmentLength = invisiblesegmentLength;
    }

    public IfcLengthMeasure getVisibleSegmentLength() {
        return visibleSegmentLength;
    }

    public void setVisibleSegmentLength(IfcLengthMeasure visibleSegmentLength) {
        this.visibleSegmentLength = visibleSegmentLength;
    }

    public IfcPositiveLengthMeasure getInvisibleSegmentLength() {
        return invisibleSegmentLength;
    }

    public void setInvisibleSegmentLength(IfcPositiveLengthMeasure invisibleSegmentLength) {
        this.invisibleSegmentLength = invisibleSegmentLength;
    }
}
