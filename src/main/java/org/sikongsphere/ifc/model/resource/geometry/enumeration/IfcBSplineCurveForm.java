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
package org.sikongsphere.ifc.model.resource.geometry.enumeration;

/**
 * This type is used to indicate that the B-spline curve represents a part of a curve of some sppecific form.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
public enum IfcBSplineCurveForm {
    POLYLINE_FORM,
    CIRCULAR_ARC,
    ELLIPTIC_ARC,
    PARABOLIC_ARC,
    HYPERBOLIC_ARC,
    UNSPECIFIED
}
