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
 * IfcConstraintEnum is an enumeration used to qualify a constraint.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcConstraintEnum {
    /**
      * Qualifies a constraint such that it must be followed rigidly within or at the values set.
      */
    HARD,

    /**
      * Qualifies a constraint such that it should be followed within or at the values set.
      */
    SOFT,

    /**
      * Qualifies a constraint such that it is advised that it is followed within or at the values set.
      */
    ADVISORY,

    /**
      * A user-defined grade indicated by a separate attribute at the referencing entity.
      */
    USERDEFINED,

    /**
      * Grade has not been specified.
      */
    NOTDEFINED

}
