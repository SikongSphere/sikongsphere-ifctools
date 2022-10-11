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
package org.sikongsphere.ifc.model.resource.representation.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;

/**
 * The IfcGeometricRepresentationSubContext defines the context that applies to several shape representations
 * of a product being a sub context, sharing the WorldCoordinateSystem, CoordinateSpaceDimension, Precision
 * and TrueNorth attributes with the parent IfcGeometricRepresentationContext.
 *
 * @author stan
 * @date 2022/09/02 13:31
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public class IfcGeometricRepresentationSubContext extends IfcGeometricRepresentationContext {}
