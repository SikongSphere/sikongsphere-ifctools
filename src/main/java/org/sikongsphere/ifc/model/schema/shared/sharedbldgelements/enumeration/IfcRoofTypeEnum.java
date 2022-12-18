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
package org.sikongsphere.ifc.model.schema.shared.sharedbldgelements.enumeration;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This enumeration defines the basic configuration of the roof in terms of the different roof shapes.
 * @author Wang Bohong
 * @date 2022/11/6 11:20
 */
@IfcClass(type = IfcType.ENUMERATION, layer = IfcLayer.SHARED)
public enum IfcRoofTypeEnum {
    FLAT_ROOF,
    SHED_ROOF,
    GABLE_ROOF,
    HIP_ROOF,
    HIPPED_GABLE_ROOF,
    GAMBREL_ROOF,
    MANSARD_ROOF,
    BARREL_ROOF,
    RAINBOW_ROOF,
    BUTTERFLY_ROOF,
    PAVILION_ROOF,
    DOME_ROOF,
    FREEFORM,
    NOTDEFINED;
}
