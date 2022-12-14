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
 * An IfcConstraintEnum is an enumeration used to qualify a constraint.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcConstraintEnum {
    /**
     *	Qualifies a constraint such that it must be followed rigidly within or at the values set.
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
    USERDEFINED,
    NOTDEFINED
}
