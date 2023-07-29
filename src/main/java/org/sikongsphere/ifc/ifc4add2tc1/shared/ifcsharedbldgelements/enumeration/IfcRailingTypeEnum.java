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
 * This enumeration defines the different types of IfcRailing or IfcRailingType that can be predefined using the enumeration values.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcRailingTypeEnum {
    /**
      * A type of railing designed to serve as an optional structural support for loads applied by human occupants (at hand height). Generally located adjacent to ramps and stairs. Generally floor or wall mounted.
      */
    HANDRAIL,

    /**
      * A type of railing designed to guard human occupants from falling off a stair, ramp or landing where there is a vertical drop at the edge of such floors/landings.
      */
    GUARDRAIL,

    /**
      * Similar to the definitions of a guardrail except the location is at the edge of a floor, rather then a stair or ramp. Examples are balustrates at roof-tops or balconies.
      */
    BALUSTRADE,

    /**
      * User-defined railing element, a term to identify the user type is given by the attribute IfcRailing.ObjectType.
      */
    USERDEFINED,

    /**
      * Undefined railing element, no type information available.
      */
    NOTDEFINED

}
