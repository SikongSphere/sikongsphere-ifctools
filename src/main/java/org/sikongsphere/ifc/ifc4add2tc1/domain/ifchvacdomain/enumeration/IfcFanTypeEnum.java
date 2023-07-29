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
 * Enumeration defining the typical types of fans.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFanTypeEnum {
    /**
      * Air flows through the impeller radially using blades that are forward curved.
      */
    CENTRIFUGALFORWARDCURVED,

    /**
      * Air flows through the impeller radially using blades that are uncurved or slightly forward curved.
      */
    CENTRIFUGALRADIAL,

    /**
      * Air flows through the impeller radially using blades that are backward curved.
      */
    CENTRIFUGALBACKWARDINCLINEDCURVED,

    /**
      * Air flows through the impeller radially using blades that are airfoil shaped.
      */
    CENTRIFUGALAIRFOIL,

    /**
      * Air flows through the impeller axially with guide vanes and reduced running blade tip clearance.
      */
    TUBEAXIAL,

    /**
      * Air flows through the impeller axially with guide vanes and reduced running blade tip clearance.
      */
    VANEAXIAL,

    /**
      * Air flows through the impeller axially and small hub-to-tip ratio impeller mounted in an orifice plate or inlet ring.
      */
    PROPELLORAXIAL,

    /**
      * User-defined fan type.
      */
    USERDEFINED,

    /**
      * Undefined fan type.
      */
    NOTDEFINED

}
