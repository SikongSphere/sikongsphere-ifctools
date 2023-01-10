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
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.selectType.IfcPointOrVertexPoint;

/**
 * An point is a location in some real Cartesian coordinate space Rm, for m = 1, 2 or 3.
 *
 * @author Wang Bohong
 * @date 2022/9/1 15:52
 */
@IfcClass(layer = IfcLayer.RESOURCE, type = IfcType.ENTITY)
public abstract class IfcPoint extends IfcGeometricRepresentationItem
    implements
        IfcPointOrVertexPoint {}
