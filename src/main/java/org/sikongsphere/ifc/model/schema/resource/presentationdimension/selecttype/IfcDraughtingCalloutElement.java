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
package org.sikongsphere.ifc.model.schema.resource.presentationdimension.selecttype;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 *The draughting callout elements can either be annotated curves, symbols or text.
 *
 * @author GaoSu
 * @date 2022/12/11 19:53
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.SELECT_TYPE)
public interface IfcDraughtingCalloutElement {}
