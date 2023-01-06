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
 *  IfcLogicalOperatorEnum is an enumeration that defines the logical operators that may be applied for
 *  the satisfaction of more than one constraint at a time.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcLogicalOperatorEnum {
    /**
     * Defines a relationship between constraints whereby the provisions of all constraints must be satisfied simultaneously (e.g. constraint A AND constraint B must both be satisfied for the constraint as a whole to be satisfied).
     */
    LOGICALAND,
    /**
     * Defines a relationship between constraints whereby the provisions of at least one of the constraints must be satisfied (e.g. constraint A OR constraint B or the provisions of both may be satisfied for the constraint as a whole to be satisfied).
     */
    LOGICALOR
}
