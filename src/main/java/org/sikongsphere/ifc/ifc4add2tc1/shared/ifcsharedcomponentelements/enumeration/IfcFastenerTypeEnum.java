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
package org.sikongsphere.ifc.ifc4add2tc1.shared.ifcsharedcomponentelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the different types of fasteners, except for mechanical fasteners.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcFastenerTypeEnum {
    /**
      * A fastening connection where glue is used to join together elements.
      */
    GLUE,

    /**
      * A composition of mineralic or other materials used to fill jointing gaps and possibly fulfilling a load carrying role.
      */
    MORTAR,

    /**
      * A weld seam between parts of metallic material or other suitable materials.
      */
    WELD,

    /**
      * User-defined fastener.
      */
    USERDEFINED,

    /**
      * Undefined fastener.
      */
    NOTDEFINED

}
