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
 * This enumeration defines thedifferent types of space boundaries in terms of either beinginside the building or outside the building.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcInternalOrExternalEnum {
    /**
      * The space boundary faces a physical or virtual element where there is an internal space on the other side.
      */
    INTERNAL,

    /**
      * The space boundary faces a physical or virtual element where there is an external space on the other side.
      */
    EXTERNAL,

    /**
      * The space boundary faces a physical or virtual element where there is earth (or terrain) on the other side.
      */
    EXTERNAL_EARTH,

    /**
      * The space boundary faces a physical or virtual element where there is water (water component of terrain) on the other side.
      */
    EXTERNAL_WATER,

    /**
      * The space boundary faces a physical or virtual element where there is another building on the other side.
      */
    EXTERNAL_FIRE,

    /**
      * No information available.
      */
    NOTDEFINED

}
