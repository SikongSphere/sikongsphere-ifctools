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
package org.sikongsphere.ifc.model.schema.resource.material.selectType;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * Selection of whether a material, a material layer, material layer set (with or without usage information)
 * or a material list is assigned to an element.
 *
 * @author yiwei
 * @date 2022/09/02 21:57
 */
@IfcClass(type = IfcType.SELECT_TYPE, layer = IfcLayer.RESOURCE)
public interface IfcMaterialSelect {}
