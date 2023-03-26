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

import org.sikongsphere.ifc.model.schema.kernel.entity.IfcObject;

import java.util.List;

public abstract class IfcGraphVertex {
    private IfcObject IfcObject;
    private List<IfcGraphEdge> edgeList;
    private String graphLayer;
    private String graphId;

    private boolean visited;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public IfcObject getIfcObject() {
        return IfcObject;
    }

    public void setIfcObject(IfcObject IfcObject) {
        this.IfcObject = IfcObject;
    }

    public List<IfcGraphEdge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<IfcGraphEdge> edgeList) {
        this.edgeList = edgeList;
    }

    public String getGraphLayer() {
        return graphLayer;
    }

    public void setGraphLayer(String graphLayer) {
        this.graphLayer = graphLayer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
