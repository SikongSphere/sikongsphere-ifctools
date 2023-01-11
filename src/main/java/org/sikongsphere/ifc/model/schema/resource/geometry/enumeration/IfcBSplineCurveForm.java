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
package org.sikongsphere.ifc.model.schema.resource.geometry.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This type is used to indicate that the B-spline curve represents a part of a curve of some sppecific form.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcBSplineCurveForm {
    /**
     * A connected sequence of line segments represented by degree 1 B-spline basis functions.
     */
    POLYLINE_FORM,
    /**
     * An arc of a circle, or a complete circle represented by a B-spline curve.
     */
    CIRCULAR_ARC,
    /**
     * An arc of an ellipse, or a complete ellipse, represented by a B-spline curve.
     */
    ELLIPTIC_ARC,
    /**
     * An arc of finite length of a parabola represented by a B-spline curve.
     */
    PARABOLIC_ARC,
    /**
     * An arc of finite length of one branch of a hyperbola represented by a B-spline curve.
     */
    HYPERBOLIC_ARC,
    /**
     * A B-spline curve for which no particular form is specified.
     */
    UNSPECIFIED
}
