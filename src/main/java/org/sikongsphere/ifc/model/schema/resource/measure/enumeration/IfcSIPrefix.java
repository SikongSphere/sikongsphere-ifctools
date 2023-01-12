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
package org.sikongsphere.ifc.model.schema.resource.measure.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * An SI prefix is the name of a prefix that may be associated with an SI unit.
 *
 * @author zaiyuan
 * @date 2022/8/31 19:27
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcSIPrefix {
    /**
     * 10^18
     */
    EXA,
    /**
     * 10^15
     */
    PETA,
    /**
     * 10^12
     */
    TERA,
    /**
     * 10^9
     */
    GIGA,
    /**
     * 10^6
     */
    MEGA,
    /**
     * 10^3
     */
    KILO,
    /**
     * 10^2
     */
    HECTO,
    /**
     * 10
     */
    DECA,
    /**
     * 10^-1
     */
    DECI,
    /**
     * 10^-2
     */
    CENTI,
    /**
     * 10^-3
     */
    MILLI,
    /**
     * 10^-6
     */
    MICRO,
    /**
     * 10^-9
     */
    NANO,
    /**
     * 10^-12
     */
    PICO,
    /**
     * 10^-15
     */
    FEMTO,
    /**
     * 10^-18
     */
    ATTO
}
