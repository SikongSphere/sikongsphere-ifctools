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
 * Enumeration defining the types of tendon anchors.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcTendonAnchorTypeEnum {
    /**
      * The anchor is an intermediate device which connects two tendons.
      */
    COUPLER,

    /**
      * The anchor fixes the end of a tendon.
      */
    FIXED_END,

    /**
      * The anchor is used or can be used to prestress the tendon.
      */
    TENSIONING_END,

    /**
      * The type of tendon anchor is user defined.
      */
    USERDEFINED,

    /**
      * The type of tendon anchor is not defined.
      */
    NOTDEFINED

}
