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
package org.sikongsphere.ifc.model.schema.resource.geometricconstraint.selectType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcPointOrVertexPoint provides the option to either select a geometric point (IfcPoint and subtypes) within
 * a geometric model, or a vertex with associated point coordinates (IfcVertexPoint) within a topological model.
 * @author zaiyuan
 * @date 2022/12/17 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.SELECT_TYPE)
public interface IfcPointOrVertexPoint {}
