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

import org.sikongsphere.ifc.common.annotation.IfcParserConstructor;
import org.sikongsphere.ifc.model.datatype.LIST;

/**
 * An edge_loop is a loop with nonzero extent. It is a path in which the start and end vertices are the same. Its domain, if present, is a closed curve. An edge_loop may overlap itself.
 *
 * @author:stan
 * @date:2023/1/15 0:21
 */
public class IfcEdgeLoop extends IfcLoop {

    private LIST<IfcOrientedEdge> edgeList;

    @IfcParserConstructor
    public IfcEdgeLoop(LIST<IfcOrientedEdge> edgeList) {
        this.edgeList = edgeList;
    }

    public LIST<IfcOrientedEdge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(LIST<IfcOrientedEdge> edgeList) {
        this.edgeList = edgeList;
    }
}
