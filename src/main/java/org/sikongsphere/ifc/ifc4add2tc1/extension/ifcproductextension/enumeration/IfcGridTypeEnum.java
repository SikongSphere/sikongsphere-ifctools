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
 * This enumeration defines the different layout types of grids. Restriction on the correct use of IfcGrid instantiations may be imposed depending on the value of the PredefinedType being IfcGridTypeEnum.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.EXTENSION,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcGridTypeEnum {
    /**
      * An IfcGrid with straight u-axes and straight v-axes being perpendicular to each other. All grid axes being part of u-axes can be described by one axis line and all other axes being 2D offsets from this axis line. The same applies to all grid axes being part of V-axes.
      */
    RECTANGULAR,

    /**
      * An IfcGrid with straight u-axes and curved v-axes. All grid axes being part of V-axes have the same center point and are concentric circular arcs. All grid axes being part of u-axes intersect at the same center point and rotate counter clockwise.
      */
    RADIAL,

    /**
      * An IfcGrid with u-axes, v-axes, and w-axes all being co-linear axis lines with a 2D offset. The v-axes are at 60 degree rotated counter clockwise from the u-axes, and the w-axes are at 120 degree rotated counter clockwise from the u-axes.
      */
    TRIANGULAR,

    /**
      * An IfcGrid with u-axes, v-axes, and optionally w-axes that cannot be described by the patterns.
      */
    IRREGULAR,

    /**
      * Any other grid not conforming to any of the above restrictions.
      */
    USERDEFINED,

    /**
      * Not known whether grid conforms to any standard type.
      */
    NOTDEFINED

}
