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
 * IfcObjectiveEnum is an enumeration used to determine the objective for which purpose the constraint needs to be satisfied.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcObjectiveEnum {
    /**
      * A constraint whose objective is to ensure satisfaction of a code compliance provision.
      */
    CODECOMPLIANCE,

    /**
      * A constraint whose objective is to identify an agreement that code compliance requirements (the waiver) will not be enforced.
      */
    CODEWAIVER,

    /**
      * A constraint whose objective is to ensure satisfaction of a design intent provision.
      */
    DESIGNINTENT,

    /**
      * A constraint whose objective is to synchronize data with an external source such as a file
      */
    EXTERNAL,

    /**
      * A constraint whose objective is to ensure satisfaction of a health and safety provision.
      */
    HEALTHANDSAFETY,

    /**
      * A constraint whose objective is to resolve a conflict such as merging data from multiple sources.
      */
    MERGECONFLICT,

    /**
      * A constraint whose objective is to ensure data conforms to a model view definition.
      */
    MODELVIEW,

    /**
      * A constraint whose objective is to calculate a value based on other referenced values.
      */
    PARAMETER,

    /**
      * A constraint whose objective is to ensure satisfaction of a project requirement provision.
      */
    REQUIREMENT,

    /**
      * A constraint whose objective is to ensure satisfaction of a specification provision.
      */
    SPECIFICATION,

    /**
      * A constraint whose objective is to indicate a limiting value beyond which the condition of an object requires a particular form of attention.
      */
    TRIGGERCONDITION,

    USERDEFINED,

    NOTDEFINED

}
