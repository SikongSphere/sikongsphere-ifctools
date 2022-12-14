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
package org.sikongsphere.ifc.model.schema.resource.profileproperty.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Enumeration defining standard types for the role, purpose or usage of the bar, i.e. the kind of loads and
 * stresses they are intended to carry.
 *
 * @author zaiyuan
 * @date 2022-09-05 20:30:00
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcReinforcingBarRoleEnum {
    /**
     * The reinforcing bar is a main bar.
     */
    MAIN,
    /**
     * The reinforcing bar is a shear bar.
     */
    SHEAR,
    /**
     * The reinforcing bar is a link (stirrup).
     */
    LIGATURE,
    /**
     * The reinforcing bar is a stud.
     */
    STUD,
    /**
     * Punching reinforcement.
     */
    PUNCHING,
    /**
     * Edge reinforcement.
     */
    EDGE,
    /**
     * Ring reinforcement.
     */
    RING,
    /**
     * Anchoring reinforcement.
     */
    ANCHORING,
    /**
     * The type of reinforcement is user defined.
     */
    USERDEFINED,
    /**
     * The type of reinforcement is not defined.
     */
    NOTDEFINED
}
