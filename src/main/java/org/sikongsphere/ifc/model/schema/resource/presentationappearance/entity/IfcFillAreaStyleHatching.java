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
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.schema.resource.measure.definedType.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcFillStyleSelect;
import org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype.IfcHatchLineDistanceSelect;

import java.util.Locale;

/**
 * The IfcFillAreaStyleHatching is used to define simple,
 * vector-based haching patterns, based on styled straight lines.
 *
 * @author stan
 * @date 2022/09/01 23:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem
    implements
        IfcFillStyleSelect {

    private IfcCurveStyle hatchLineAppearance;

    private IfcHatchLineDistanceSelect startOfNextHatchLine;

    @IfcOptionField
    private IfcCartesianPoint pointOfReferenceHatchLine;

    @IfcOptionField
    private IfcCartesianPoint patternStart;

    private IfcPlaneAngleMeasure hatchLineAngle;

    public IfcFillAreaStyleHatching() {}

    @IfcParserConstructor
    public IfcFillAreaStyleHatching(
        IfcCurveStyle hatchLineAppearance,
        IfcHatchLineDistanceSelect startOfNextHatchLine,
        IfcCartesianPoint pointOfReferenceHatchLine,
        IfcCartesianPoint patternStart,
        IfcPlaneAngleMeasure hatchLineAngle
    ) {
        this.hatchLineAppearance = hatchLineAppearance;
        this.startOfNextHatchLine = startOfNextHatchLine;
        this.pointOfReferenceHatchLine = pointOfReferenceHatchLine;
        this.patternStart = patternStart;
        this.hatchLineAngle = hatchLineAngle;
    }

    public IfcCurveStyle getHatchLineAppearance() {
        return hatchLineAppearance;
    }

    public void setHatchLineAppearance(IfcCurveStyle hatchLineAppearance) {
        this.hatchLineAppearance = hatchLineAppearance;
    }

    public String getStartOfNextHatchLine() {
        String format = String.format(
            "%s(%s)",
            startOfNextHatchLine.getClass().getSimpleName().toUpperCase(Locale.ROOT),
            startOfNextHatchLine
        );

        return format;
    }

    public void setStartOfNextHatchLine(IfcHatchLineDistanceSelect startOfNextHatchLine) {
        this.startOfNextHatchLine = startOfNextHatchLine;
    }

    public IfcCartesianPoint getPointOfReferenceHatchLine() {
        return pointOfReferenceHatchLine;
    }

    public void setPointOfReferenceHatchLine(IfcCartesianPoint pointOfReferenceHatchLine) {
        this.pointOfReferenceHatchLine = pointOfReferenceHatchLine;
    }

    public IfcCartesianPoint getPatternStart() {
        return patternStart;
    }

    public void setPatternStart(IfcCartesianPoint patternStart) {
        this.patternStart = patternStart;
    }

    public IfcPlaneAngleMeasure getHatchLineAngle() {
        return hatchLineAngle;
    }

    public void setHatchLineAngle(IfcPlaneAngleMeasure hatchLineAngle) {
        this.hatchLineAngle = hatchLineAngle;
    }
}
