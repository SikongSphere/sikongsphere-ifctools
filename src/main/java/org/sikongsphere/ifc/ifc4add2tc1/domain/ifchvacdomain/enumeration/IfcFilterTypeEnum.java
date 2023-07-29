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
 * This enumeration defines the various types of filter typically used within building services distribution systems:
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFilterTypeEnum {
    /**
      * A filter used to remove particulates from air.
      */
    AIRPARTICLEFILTER,

    /**
      * A filter used to remove particulates from compressed air.
      */
    COMPRESSEDAIRFILTER,

    /**
      * A filter used to remove odors from air.
      */
    ODORFILTER,

    /**
      * A filter used to remove particulates from oil.
      */
    OILFILTER,

    /**
      * A filter used to remove particulates from a fluid.
      */
    STRAINER,

    /**
      * A filter used to remove particulates from water.
      */
    WATERFILTER,

    /**
      * User-defined filter type.
      */
    USERDEFINED,

    /**
      * Undefined filter type.
      */
    NOTDEFINED

}
