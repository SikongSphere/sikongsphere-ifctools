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
 * Enumeration defining the typical types of evaporators.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcEvaporatorTypeEnum {
    /**
      * Direct-expansion evaporator.
      */
    DIRECTEXPANSION,

    /**
      * Direct-expansion evaporator where a refrigerant evaporates inside a series of baffles that channel the fluid throughout the shell side.
      */
    DIRECTEXPANSIONSHELLANDTUBE,

    /**
      * Direct-expansion evaporator where a refrigerant evaporates inside one or more pairs of coaxial tubes.
      */
    DIRECTEXPANSIONTUBEINTUBE,

    /**
      * Direct-expansion evaporator where a refrigerant evaporates inside plates brazed or welded together to make up an assembly of separate channels.
      */
    DIRECTEXPANSIONBRAZEDPLATE,

    /**
      * Evaporator in which refrigerant evaporates outside tubes.
      */
    FLOODEDSHELLANDTUBE,

    /**
      * Evaporator in which refrigerant evaporates inside a simple coiled tube immersed in the fluid to be cooled.
      */
    SHELLANDCOIL,

    /**
      * User-defined evaporator type.
      */
    USERDEFINED,

    /**
      * Undefined evaporator type.
      */
    NOTDEFINED

}
