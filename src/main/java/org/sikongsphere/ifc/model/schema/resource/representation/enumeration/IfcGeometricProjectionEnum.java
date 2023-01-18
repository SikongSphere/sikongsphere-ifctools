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
package org.sikongsphere.ifc.model.schema.resource.representation.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcGeometricProjectionEnum defines the various representation types that can be semantically distinguished.
 *
 * @author Wang Bohong
 * @date 2022/8/29 15:24
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENUMERATION)
public enum IfcGeometricProjectionEnum {
    /**
     * Geometric display representation that shows an abstract, often 1D element representation
     * @author Wang Bohong
     */
    GRAPH_VIEW,
    /**
     * Geometric display representation that shows an abstract, often 2D element representation.
     * @author Wang Bohong
     */
    SKETCH_VIEW,
    /**
     * Geometric display representation that shows a full 3D element representation.
     * @author Wang Bohong
     */
    MODEL_VIEW,
    /**
     * Geometric display representation that shows a full 3D element representation.
     * @author Wang Bohong
     */
    PLAN_VIEW,
    /**
     * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale.
     * @author Wang Bohong
     */
    REFLECTED_PLAN_VIEW,
    /**
     * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale
     * @author Wang Bohong
     */
    SECTION_VIEW,
    /**
     * Geometric display representation that shows a full 2D element representation, the level of detail often depends on the target scale.
     * @author Wang Bohong
     */
    ELEVATION_VIEW,
    /**
     * A user defined specification is given by the value of the UserDefinedTargetView attribute.
     * @author Wang Bohong
     */
    USERDEFINED,
    /**
     * No specification given.
     * @author Wang Bohong
     */
    NOTDEFINED
}
