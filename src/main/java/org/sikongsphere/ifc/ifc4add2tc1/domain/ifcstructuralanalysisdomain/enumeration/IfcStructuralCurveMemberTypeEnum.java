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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralanalysisdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration distinguishes between different types of structural 'curve' members, such as cables.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcStructuralCurveMemberTypeEnum {
    /**
      * A member with capacity to carry transverse and axial loads, i.e. a beam. Its actual joints may be rigid or pinned. Typically used in rigid frames.
      */
    RIGID_JOINED_MEMBER,

    /**
      * A member with capacity to carry axial loads only, i.e. a link. Typically used in trusses.
      */
    PIN_JOINED_MEMBER,

    /**
      * A tension member which is able to carry transverse loads only under large deflection.
      */
    CABLE,

    /**
      * A member without compressional stiffness.
      */
    TENSION_MEMBER,

    /**
      * A member without tensional stiffness.
      */
    COMPRESSION_MEMBER,

    /**
      * A specially defined member.
      */
    USERDEFINED,

    /**
      * A member without further categorization.
      */
    NOTDEFINED

}
