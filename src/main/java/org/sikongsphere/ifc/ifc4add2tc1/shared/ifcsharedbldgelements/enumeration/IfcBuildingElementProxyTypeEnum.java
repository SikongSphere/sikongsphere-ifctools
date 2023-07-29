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
 * This enumeration defines the available generic types for IfcBuildingElementProxy or IfcBuildingElementProxyType.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.SHARED, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcBuildingElementProxyTypeEnum {
    /**
      * Not used - kept for upward compatibility.
      */
    COMPLEX,

    /**
      * Not used - kept for upward compatibility.
      */
    ELEMENT,

    /**
      * Not used - kept for upward compatibility.
      */
    PARTIAL,

    /**
      * The proxy denotes a provision for voids (an proposed opening not applied as void yet).
      */
    PROVISIONFORVOID,

    /**
      * The proxy denotes a provision for space (e.g. the space allocated as a provision for mechanical equipment or furniture).
      */
    PROVISIONFORSPACE,

    /**
      * User-defined building element proxy.
      */
    USERDEFINED,

    /**
      * Undefined building element proxy.
      */
    NOTDEFINED

}
