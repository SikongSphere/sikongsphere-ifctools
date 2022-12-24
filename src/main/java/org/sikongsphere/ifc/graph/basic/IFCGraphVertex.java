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
