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

/**
 * An oriented edge is an edge constructed from another edge and contains a BOOLEAN direction flag to indicate
 * whether or not the orientation of the constructed edge agrees with the orientation of the original edge.
 * Except for perhaps orientation, the oriented edge is equivalent to the original edge.
 *
 * @author zaiyuan
 * @date 2022/12/10 13:40
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcOrientedEdge extends IfcEdge {
    private IfcEdge edgeElement;
    private BOOLEAN orientation;

    @IfcParserConstructor
    public IfcOrientedEdge(
        IfcVertex edgeStart,
        IfcVertex edgeEnd,
        IfcEdge edgeElement,
        BOOLEAN orientation
    ) {
        super(edgeStart, edgeEnd);
        this.edgeElement = edgeElement;
        this.orientation = orientation;
    }

    public IfcEdge getEdgeElement() {
        return edgeElement;
    }

    public void setEdgeElement(IfcEdge edgeElement) {
        this.edgeElement = edgeElement;
    }

    public BOOLEAN getOrientation() {
        return orientation;
    }

    public void setOrientation(BOOLEAN orientation) {
        this.orientation = orientation;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
