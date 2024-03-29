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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcelectricaldomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * The IfcCableCarrierSegmentTypeEnum defines the range of different types of cable carrier segment that can be specified.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCableCarrierSegmentTypeEnum {
    /**
      * An open carrier segment on which cables are carried on a ladder structure.
      */
    CABLELADDERSEGMENT,

    /**
      * A (typically) open carrier segment onto which cables are laid.
      */
    CABLETRAYSEGMENT,

    /**
      * An enclosed carrier segment with one or more compartments into which cables are placed.
      */
    CABLETRUNKINGSEGMENT,

    /**
      * An enclosed tubular carrier segment through which cables are pulled.
      */
    CONDUITSEGMENT,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
