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
package org.sikongsphere.ifc.newModel.schema.resource.measure.selectTypes;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.newModel.schema.resource.geometry.entity.IfcAxis2Placement3D;

/**
 * This select type collects together both versions of the placement
 * as used in two dimensional or in three dimensional Cartesian space.
 *
 * @author stan
 * @date 2022/09/02 21:57
 */
@IfcClass(
    layer = IfcLayer.RESOURCE,
    type = IfcType.SELECT_TYPE,
    defaultClass = IfcAxis2Placement3D.class
)
public interface IfcAxis2Placement {}
