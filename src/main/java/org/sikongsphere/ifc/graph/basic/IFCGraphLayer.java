package org.sikongsphere.ifc.graph.basic;

import java.util.List;

public abstract class IFCGraphLayer {
    private List<IFCGraphVertex> vertexList;
    private List<IFCGraphEdge> edgeList;
    private IFCGraphVertex startVertex;
    private LayerType layerType;
    private String layerId;
    private String graphId;


    public void DFSInfo() {

    }

    public void BFSInfo() {

    }
}
