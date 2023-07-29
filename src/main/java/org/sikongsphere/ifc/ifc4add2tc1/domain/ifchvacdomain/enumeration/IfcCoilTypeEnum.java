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
 * Enumeration defining the typical types of coils.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcCoilTypeEnum {
    /**
      * Cooling coil using a refrigerant to cool the air stream directly.
      */
    DXCOOLINGCOIL,

    /**
      * Heating coil using electricity as a heating source.
      */
    ELECTRICHEATINGCOIL,

    /**
      * Heating coil using gas as a heating source.
      */
    GASHEATINGCOIL,

    /**
      * Cooling or Heating coil that uses a hydronic fluid as a cooling or heating source.
      */
    HYDRONICCOIL,

    /**
      * Heating coil using steam as heating source.
      */
    STEAMHEATINGCOIL,

    /**
      * Cooling coil using chilled water. HYDRONICCOIL supercedes this enumerator.
      */
    WATERCOOLINGCOIL,

    /**
      * Heating coil using hot water as a heating source. HYDRONICCOIL supercedes this enumerator.
      */
    WATERHEATINGCOIL,

    /**
      * User-defined coil type.
      */
    USERDEFINED,

    /**
      * Undefined coil type.
      */
    NOTDEFINED

}
