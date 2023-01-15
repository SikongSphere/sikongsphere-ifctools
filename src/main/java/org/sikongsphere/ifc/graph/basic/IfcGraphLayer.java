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
package org.sikongsphere.ifc.graph.basic;

import java.util.List;

public abstract class IfcGraphLayer {
    private List<IfcGraphVertex> vertexList;
    private List<IfcGraphEdge> edgeList;
    private IfcGraphVertex startVertex;
    private LayerType layerType;
    private String layerId;
    private String graphId;


    public void DFSInfo() {

    }

    public void BFSInfo() {

    }
}
