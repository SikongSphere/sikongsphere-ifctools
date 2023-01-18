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
package org.sikongsphere.ifc.model.schema.resource.topology.selectType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * This type collects together, for reference when constructing more complex models, the subtypes which have the
 * characteristics of a shell. A shell is a connected object of fixed dimensionality d = 0; 1; or 2, typically used to
 * bound a region. The domain of a shell, if present, includes its bounds and 0 £ X < ¥ .
 *
 * @author zaiyuan
 * @date 2022/9/2 08:15
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.SELECT_TYPE)
public interface IfcShell {}
