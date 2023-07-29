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
package org.sikongsphere.ifc.ifc4add2tc1.resource.ifcrepresentationresource.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.common.enumeration.IfcVersion;

/**
 * IfcGeometricProjectionEnum defines the various representation types that can be semantically distinguished. Often different levels of detail of the shape representation are controlled by the representation type.
 *
 * @author zaiyuan
 * @date 2023.07.23 22:19:45
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.ENUMERATION,
    version = IfcVersion.IFC_4_ADD2_TC1
)
public enum IfcGeometricProjectionEnum {
    /**
      * Geometric display representation that shows an abstract, often 1D element representation, e.g. representing a wall by its axis line.
      */
    GRAPH_VIEW,

    /**
      * Geometric display representation that shows an abstract, often 2D element representation, e.g. representing a wall by its two foot print edges, surpressing any inner layer representation.
      */
    SKETCH_VIEW,

    /**
      * Geometric display representation that shows a full 3D element representation, e.g. representing a wall by its volumetric body.
      */
    MODEL_VIEW,

    /**
      * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale, e.g. representing a wall by its two foot print edges and the edges of all inner layers. The projection is shown in ground view as seen from above.
      */
    PLAN_VIEW,

    /**
      * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale, e.g. representing a wall by its two foot print edges and the edges of all inner layers. The projection is shown in ground view as seen from below.
      */
    REFLECTED_PLAN_VIEW,

    /**
      * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale, e.g. representing a wall by its two inner/outer edges and the edges of all inner layers, if the element is cut by the section line.
      */
    SECTION_VIEW,

    /**
      * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale, e.g. representing a wall by its bounding edges if the element is within an elevation view.
      */
    ELEVATION_VIEW,

    /**
      * A user defined specification is given by the value of the UserDefinedTargetView attribute.
      */
    USERDEFINED,

    /**
      * No specification given.
      */
    NOTDEFINED

}
