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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;

/**
 * The IfcConnectionGeometry is used to describe the geometric and topological constraints that facilitate the physical
 * connection of two objects. It is envisioned as a control that applies to the element connection relationships.
 *
 * @author GaoSu
 * @date 2022/10/18 15:08
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public abstract class IfcConnectionGeometry extends IfcAbstractClass {}
