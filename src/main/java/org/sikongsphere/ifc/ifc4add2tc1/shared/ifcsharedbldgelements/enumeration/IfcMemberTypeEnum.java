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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedbldgelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the different types of linear elements anIfcMember or IfcMemberType object can fulfill.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcMemberTypeEnum {
    /**
      * A linear element (usually sloped) often used for bracing of a girder or truss.
      */
    BRACE,

    /**
      * Upper or lower longitudinal member of a truss, used horizontally or sloped.
      */
    CHORD,

    /**
      * A linear element (usually used horizontally) within a roof structure to connect rafters and posts.
      */
    COLLAR,

    /**
      * A linear element within a girder or truss with no further meaning.
      */
    MEMBER,

    /**
      * A linear element within a curtain wall system to connect two (or more) panels.
      */
    MULLION,

    /**
      * A linear continuous horizontal element in wall framing, such as a head piece or a sole plate.
      */
    PLATE,

    /**
      * A linear member (usually used vertically) within a roof structure to support purlins.
      */
    POST,

    /**
      * A linear element (usually used horizontally) within a roof structure to support rafters.
      */
    PURLIN,

    /**
      * A linear elements used to support roof slabs or roof covering, usually used with slope.
      */
    RAFTER,

    /**
      * A linear element used to support stair or ramp flights, usually used with slope.
      */
    STRINGER,

    /**
      * A linear element often used within a girder or truss.
      */
    STRUT,

    /**
      * Vertical element in wall framing.
      */
    STUD,

    /**
      * User-defined linear element.
      */
    USERDEFINED,

    /**
      * Undefined linear element.
      */
    NOTDEFINED

}
