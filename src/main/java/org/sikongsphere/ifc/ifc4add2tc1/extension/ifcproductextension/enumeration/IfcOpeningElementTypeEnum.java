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
package org.sikongsphere.ifc.ifc4add2tc1.extension.ifcproductextension.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration defines the basic types for opening elements.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcOpeningElementTypeEnum {
    /**
      * An opening as subtraction feature that cuts through the element it voids. It thereby creates a hole. An opening in addiion have a particular meaning for either providing a void for doors or windows, or an opening to permit flow of air and passing of light.
      */
    OPENING,

    /**
      * An opening as subtraction feature that does not cut through the element it voids. It creates a niche or similar voiding pattern.
      */
    RECESS,

    /**
      * User-defined opening element.
      */
    USERDEFINED,

    /**
      * Undefined opening element.
      */
    NOTDEFINED

}
