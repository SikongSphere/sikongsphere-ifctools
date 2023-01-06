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
package org.sikongsphere.ifc.model.schema.resource.constraint.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * An IfcBenchmarkEnum is an enumeration used to identify the logical comparators that can be applied in conjunction
 * with constraint values.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcBenchmarkEnum {
    /**
     * Identifies that a value must be greater than that set by the constraint.
     */
    GREATERTHAN,
    /**
     *	Identifies that a value must be either greater than or equal to that set by the constraint.
     */
    GREATERTHANOREQUALTO,
    /**
     * Identifies that a value must be less than that set by the constraint.
     */
    LESSTHAN,
    /**
     * Identifies that a value must be either less than or equal to that set by the constraint.
     */
    LESSTHANOREQUALTO,
    /**
     * Identifies that a value must be equal to that set by the constraint.
     */
    EQUALTO,
    /**
     *	Identifies that a value must be not equal to that set by the constraint.
     */
    NOTEQUALTO
}
