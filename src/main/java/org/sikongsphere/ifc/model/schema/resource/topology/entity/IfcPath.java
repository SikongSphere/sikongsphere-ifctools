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
import org.sikongsphere.ifc.model.datatype.LIST;

/**
 * A path is a topological entity consisting of an ordered collection of oriented edges, such that the edge start
 * vertex of each edge coincides with the edge end of its predecessor.
 *
 * @author zaiyuan
 * @date 2022/12/10 13:40
 */
@IfcClass(type = IfcType.ENTITY, layer = IfcLayer.RESOURCE)
public class IfcPath extends IfcTopologicalRepresentationItem {
    // TODO unique
    private LIST<IfcOrientedEdge> edgeList;

    @IfcParserConstructor
    public IfcPath(LIST<IfcOrientedEdge> edgeList) {
        this.edgeList = edgeList;
    }

    public LIST<IfcOrientedEdge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(LIST<IfcOrientedEdge> edgeList) {
        this.edgeList = edgeList;
    }

    @Override
    public boolean illegal() {
        // TODO
        return super.illegal();
    }
}
