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
 * This type conveys the continuity properties of a composite curve or surface. The continuity referred to
 * is geometric, not parametric continuity.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcTransitionCode {
    /**
     * The segments do not join. This is permitted only at the boundary of the curve or surface to indicate that it is
     * not closed.
     */
    DISCONTINUOUS,
    /**
     * The segments join but no condition on their tangents is implied.
     */
    CONTINUOUS,
    /**
     * The segments join and their tangent vectors or tangent planes are parallel and have the same direction at the
     * joint: equality of derivatives is not required.
     */
    CONTSAMEGRADIENT,
    /**
     * For a curve, the segments join, their tangent vectors are parallel and in the same direction and their curvatures
     * are equal at the joint: equality of derivatives is not required. For a surface this implies that the principle
     * curvatures are the same and the principle directions are coincident along the common boundary.
     */
    CONTSAMEGRADIENTSAMECURVATURE
}
