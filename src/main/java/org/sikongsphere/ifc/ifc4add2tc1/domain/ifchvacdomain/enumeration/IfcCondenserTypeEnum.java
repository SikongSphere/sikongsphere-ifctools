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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifchvacdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * Enumeration defining the typical types of condensers. Air is used as the cooling medium for AIRCOOLED; water is used as the cooling medium for all other types.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCondenserTypeEnum {
    /**
      * A condenser in which heat is transferred to an air-stream.
      */
    AIRCOOLED,

    /**
      * A condenser that is cooled evaporatively.
      */
    EVAPORATIVECOOLED,

    /**
      * Water-cooled condenser with unspecified operation.
      */
    WATERCOOLED,

    /**
      * Water-cooled condenser with plates brazed together to form an assembly of separate channels.
      */
    WATERCOOLEDBRAZEDPLATE,

    /**
      * Water-cooled condenser with cooling water circulated through one or more continuous or assembled coils contained within the shell.
      */
    WATERCOOLEDSHELLCOIL,

    /**
      * Water-cooled condenser with cooling water circulated through one or more tubes contained within the shell.
      */
    WATERCOOLEDSHELLTUBE,

    /**
      * Water-cooled condenser consisting of one or more assemblies of two tubes, one within the other.
      */
    WATERCOOLEDTUBEINTUBE,

    /**
      * User-defined condenser type.
      */
    USERDEFINED,

    /**
      * Undefined condenser type.
      */
    NOTDEFINED

}
