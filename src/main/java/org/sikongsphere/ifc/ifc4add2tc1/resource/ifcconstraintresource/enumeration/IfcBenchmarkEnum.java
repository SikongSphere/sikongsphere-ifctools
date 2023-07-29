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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcconstraintresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * IfcBenchmarkEnum is an enumeration used to identify the logical comparators that can be applied in conjunction with constraint values.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcBenchmarkEnum {
    /**
      * Identifies that a value must be greater than that set by the constraint.
      */
    GREATERTHAN,

    /**
      * Identifies that a value must be either greater than or equal to that set by the constraint.
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
      * Identifies that a value must be not equal to that set by the constraint.
      */
    NOTEQUALTO,

    /**
      * Identifies that an aggregation (set, list or table) must include the value (individual item) set by the constraint.
      */
    INCLUDES,

    /**
      * Identifies that an aggregation (set, list or table) must not include the value (individual item) set by the constraint.
      */
    NOTINCLUDES,

    /**
      * Identifies that a value (individual item) must be included in the aggregation (set, list or table) set by the constraint.
      */
    INCLUDEDIN,

    /**
      * Identifies that a value (individual item) must not be included in the aggregation (set, list or table) set by the constraint.
      */
    NOTINCLUDEDIN

}
