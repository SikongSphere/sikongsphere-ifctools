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
package org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcAxis2Placement3D;

/**
 * This select type identifies all those types of entities which may participate in a Boolean operation to form a CSG
 * solid.
 *
 * @author zaiyuan
 * @date 2022/12/17 21:57
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.SELECT_TYPE)
public interface IfcBooleanOperand {}
