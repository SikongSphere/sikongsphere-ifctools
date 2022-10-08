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
 * This type conveys the continuity properties of a composite curve or surface. The continuity referred to
 * is geometric, not parametric continuity.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
public enum IfcTransitionCode {
    DISCONTINUOUS,
    CONTINUOUS,
    CONTSAMEGRADIENT,
    CONTSAMEGRADIENTSAMECURVATURE
}
