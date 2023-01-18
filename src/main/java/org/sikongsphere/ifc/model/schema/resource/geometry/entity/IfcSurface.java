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
package org.sikongsphere.ifc.model.schema.resource.geometry.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.IfcAbstractClass;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.selectType.IfcSurfaceOrFaceSurface;
import org.sikongsphere.ifc.model.schema.resource.geometricmodel.selectType.IfcGeometricSetSelect;

/**
 * A surface can be envisioned as a set of connected points in 3-dimensional space which is always locally
 * 2-dimensional, but need not be a manifold.
 *
 * @author zaiyuan
 * @date 2022/12/17 11:40
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcSurface extends IfcGeometricRepresentationItem
    implements
        IfcSurfaceOrFaceSurface,
        IfcGeometricSetSelect {

}
