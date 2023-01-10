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
package org.sikongsphere.ifc.model.schema.resource.topology.entity;

import org.sikongsphere.ifc.common.annotation.IfcClass;
import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.common.enumeration.IfcLayer;
import org.sikongsphere.ifc.common.enumeration.IfcType;
import org.sikongsphere.ifc.model.datatype.BOOLEAN;
import org.sikongsphere.ifc.model.schema.resource.geometricconstraint.selectType.IfcCurveOrEdgeCurve;
import org.sikongsphere.ifc.model.schema.resource.geometry.entity.IfcCurve;

/**
 * @author zaiyuan
 * @date 2022/12/10 23:09
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcEdgeCurve extends IfcEdge implements IfcCurveOrEdgeCurve {
    private IfcCurve edgeGeometry;
    private BOOLEAN sameSense;

    @IfcParserConstructor
    public IfcEdgeCurve(
        IfcVertex edgeStart,
        IfcVertex edgeEnd,
        IfcCurve edgeGeometry,
        BOOLEAN sameSense
    ) {
        super(edgeStart, edgeEnd);
        this.edgeGeometry = edgeGeometry;
        this.sameSense = sameSense;
    }

    public IfcCurve getEdgeGeometry() {
        return edgeGeometry;
    }

    public void setEdgeGeometry(IfcCurve edgeGeometry) {
        this.edgeGeometry = edgeGeometry;
    }

    public BOOLEAN getSameSense() {
        return sameSense;
    }

    public void setSameSense(BOOLEAN sameSense) {
        this.sameSense = sameSense;
    }
}
