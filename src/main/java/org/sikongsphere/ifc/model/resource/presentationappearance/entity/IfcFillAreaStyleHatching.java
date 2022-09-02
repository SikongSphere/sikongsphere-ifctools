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

import org.sikongsphere.ifc.model.resource.geometry.entity.IfcCartesianPoint;
import org.sikongsphere.ifc.model.resource.geometry.entity.IfcGeometricRepresentationItem;
import org.sikongsphere.ifc.model.resource.measure.definedtype.IfcPlaneAngleMeasure;
import org.sikongsphere.ifc.model.resource.presentationappearance.selecttype.IfcHatchLineDistanceSelect;

/**
 * The IfcFillAreaStyleHatching is used to define simple,
 * vector-based haching patterns, based on styled straight lines.
 *
 * @author stan
 * @date 2022/09/01 23:53
 */
public class IfcFillAreaStyleHatching extends IfcGeometricRepresentationItem {
    private IfcCurveStyle hatchLineAppearance;
    private IfcHatchLineDistanceSelect startOfNextHatchLine;
    private IfcCartesianPoint pointOfReferenceHatchLine;
    private IfcCartesianPoint patternStart;
    private IfcPlaneAngleMeasure hatchLineAngle;

    public IfcFillAreaStyleHatching() {
    }

    public IfcFillAreaStyleHatching(IfcCurveStyle hatchLineAppearance, IfcHatchLineDistanceSelect startOfNextHatchLine, IfcCartesianPoint pointOfReferenceHatchLine, IfcCartesianPoint patternStart, IfcPlaneAngleMeasure hatchLineAngle) {
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

    public IfcHatchLineDistanceSelect getStartOfNextHatchLine() {
        return startOfNextHatchLine;
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
