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
 * This enumeration defines the different types of stair flights that can further specify an IfcStairFlight or IfcStairFlightType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcStairFlightTypeEnum {
    /**
      * A stair flight with a straight walking line.
      */
    STRAIGHT,

    /**
      * A stair flight with a walking line including straight and curved sections.
      */
    WINDER,

    /**
      * A stair flight with a circular or elliptic walking line.
      */
    SPIRAL,

    /**
      * A stair flight with a curved walking line.
      */
    CURVED,

    /**
      * A stair flight with a free form walking line (and outer boundaries).
      */
    FREEFORM,

    /**
      * User-defined stair flight.
      */
    USERDEFINED,

    /**
      * Undefined stair flight.
      */
    NOTDEFINED

}
