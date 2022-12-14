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
 * An IfcObjectiveEnum is an enumeration used to determine the objective for which purpose the constraint
 * needs to be satisfied.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcObjectiveEnum {
    /**
     *A constraint whose objective is to ensure satisfaction of a code compliance provision.
     */
    CODECOMPLIANCE,
    /**
     *A constraint whose objective is to ensure satisfaction of a design intent provision.
     */
    DESIGNINTENT,
    /**
     *A constraint whose objective is to ensure satisfaction of a health and safety provision.
     */
    HEALTHANDSAFETY,
    /**
     *A constraint whose objective is to ensure satisfaction of a project requirement provision.
     */
    REQUIREMENT,
    /**
     *A constraint whose objective is to ensure satisfaction of a specification provision.
     */
    SPECIFICATION,
    /**
     *A constraint whose objective is to indicate a limiting value beyond which the condition of an object requires a particular form of attention.
     */
    TRIGGERCONDITION,
    USERDEFINED,
    NOTDEFINED
}
