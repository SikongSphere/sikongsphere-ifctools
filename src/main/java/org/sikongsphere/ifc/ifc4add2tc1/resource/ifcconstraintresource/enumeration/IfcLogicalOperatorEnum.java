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
 * IfcLogicalOperatorEnum is an enumeration that defines the logical operators that may be applied for the satisfaction of one or more operands (IfcConstraint) at a time.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcLogicalOperatorEnum {
    /**
      * Defines a relationship between operands whereby the result is true if all operands are true, and false if at least one operand is false.
      */
    LOGICALAND,

    /**
      * Defines a relationship between operands whereby the result is true if at least one operand is true, and false if all operands are false.
      */
    LOGICALOR,

    /**
      * Defines a relationship between operands whereby the result is true if exactly one operand is true (exclusive or).
      */
    LOGICALXOR,

    /**
      * Defines a relationship between operands whereby the result is true if at least one operand is false, and false if all operands are true.
      */
    LOGICALNOTAND,

    /**
      * Defines a relationship between operands whereby the result is true if all operands are false, and false if at least one operand is true.
      */
    LOGICALNOTOR

}
