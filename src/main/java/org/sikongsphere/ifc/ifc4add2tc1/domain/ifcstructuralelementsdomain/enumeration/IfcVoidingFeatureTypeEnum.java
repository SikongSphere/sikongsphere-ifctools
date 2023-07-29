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
package org.sikongsphere.ifc.ifc4add2tc1.domain.ifcstructuralelementsdomain.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * This enumeration qualifies a voiding feature regarding its shape and configuration relative to the voided element.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(layer = IfcLayer.DOMAIN, type = IfcType.ENUMERATION, version = IfcVersion.IFC_4_ADD2_TC1)
public enum IfcVoidingFeatureTypeEnum {
    /**
      * An internal cutout (creating an opening) or external cutout (creating a recess) of arbitrary shape. The edges between cutting planes may be overcut or undercut, i.e. rounded.
      */
    CUTOUT,

    /**
      * An external cutout of with a mostly rectangular cutting profile. The edges between cutting planes may be overcut or undercut, i.e. rounded.
      */
    NOTCH,

    /**
      * A circular or slotted or threaded hole, typically but not necessarily of smaller dimension than what would be considered a cutout.
      */
    HOLE,

    /**
      * A skewed plane end cut, removing material across the entire profile of the voided element.
      */
    MITER,

    /**
      * A skewed plane end cut, removing material only across a part of the profile of the voided element.
      */
    CHAMFER,

    /**
      * A shape modification along an edge of the element with the edge length as the predominant dimension of the feature, and feature profile dimensions which are typically much smaller than the edge length. Can for example be a chamfer edge (differentiated from a chamfer by its ratio of dimensions and thus usually manufactured differently), rounded edge (a convex edge feature), or fillet edge (a concave edge feature).
      */
    EDGE,

    /**
      * A user-defined type of voiding feature.
      */
    USERDEFINED,

    /**
      * An undefined type of voiding feature.
      */
    NOTDEFINED

}
