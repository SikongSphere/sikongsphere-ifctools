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
 * The IfcLightFixtureTypeEnum defines the different types of light fixtures.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcLightFixtureTypeEnum {
    /**
      * A light fixture that is considered to have negligible area and that emit light with approximately equal intensity in all directions. A light fixture containing a tungsten, halogen or similar bulb is an example of a point source.
      */
    POINTSOURCE,

    /**
      * A light fixture that is considered to have a length or surface area from which it emits light in a direction. A light fixture containing one or more fluorescent lamps is an example of a direction source.
      */
    DIRECTIONSOURCE,

    /**
      * A light fixture having specific purpose of directing occupants in an emergency, such as an illuminated exit sign or emergency flood light.
      */
    SECURITYLIGHTING,

    /**
      * User-defined type.
      */
    USERDEFINED,

    /**
      * Undefined type.
      */
    NOTDEFINED

}
