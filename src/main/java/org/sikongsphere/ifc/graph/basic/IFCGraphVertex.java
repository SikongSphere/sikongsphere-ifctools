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

public abstract class IFCGraphVertex {
    private IFCObject ifcObject;
    private List<IFCBaseGraphEdge> edgeList;
    private String graphLayer;
    private String graphId;

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public IFCObject getIfcObject() {
        return ifcObject;
    }

    public void setIfcObject(IFCObject ifcObject) {
        this.ifcObject = ifcObject;
    }

    public List<IFCBaseGraphEdge> getEdgeList() {
        return edgeList;
    }

    public void setEdgeList(List<IFCBaseGraphEdge> edgeList) {
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
