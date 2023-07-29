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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralelementsdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * Enumeration defining standard types for the role, purpose or usage of the bar, i.e. the kind of loads and stresses they are intended to carry.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcReinforcingBarTypeEnum {
    /**
      * Anchoring reinforcement.
      */
    ANCHORING,

    /**
      * Edge reinforcement.
      */
    EDGE,

    /**
      * The reinforcing bar is a ligature (link, stirrup).
      */
    LIGATURE,

    /**
      * The reinforcing bar is a main bar.
      */
    MAIN,

    /**
      * Punching reinforcement.
      */
    PUNCHING,

    /**
      * Ring reinforcement.
      */
    RING,

    /**
      * The reinforcing bar is a shear bar.
      */
    SHEAR,

    /**
      * The reinforcing bar is a stud.
      */
    STUD,

    /**
      * The type of reinforcement is user defined.
      */
    USERDEFINED,

    /**
      * The type of reinforcement is not defined.
      */
    NOTDEFINED

}
