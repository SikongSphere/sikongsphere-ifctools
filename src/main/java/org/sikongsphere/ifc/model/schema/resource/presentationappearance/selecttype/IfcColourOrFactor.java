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
package org.sikongsphere.ifc.model.schema.resource.presentationappearance.selecttype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcColourOrFactor enables the selection of either a RGB colour value or a scalar factor value for the use as
 * values of the reflectance components.
 *
 * @author Yiwei
 * @date 2022/10/23
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.SELECT_TYPE)
public interface IfcColourOrFactor {}
