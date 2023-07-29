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
 * This enumeration distinguishes between different types of structural surface members, such as the typical mechanical function of walls, slabs and shells.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcStructuralSurfaceMemberTypeEnum {
    /**
      * A member with capacity to carry out-of-plane loads, i.e. a plate.
      */
    BENDING_ELEMENT,

    /**
      * A member with capacity to carry in-plane loads, for example a shear wall.
      */
    MEMBRANE_ELEMENT,

    /**
      * A member with capacity to carry in-plane and out-of-plane loads, i.e. a combination of bending element and membrane element.
      */
    SHELL,

    /**
      * A specially defined member.
      */
    USERDEFINED,

    /**
      * A member without further categorization.
      */
    NOTDEFINED

}
