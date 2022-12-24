package org.sikongsphere.ifc.graph.basic;

public abstract class IFCGraphEdge {
    private IFCRelationShip relationShip;
    private IFCBaseGraphVertex graphA;
    private IFCBaseGraphVertex graphB;
    private String graphId;

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public IFCRelationShip getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(IFCRelationShip relationShip) {
        this.relationShip = relationShip;
    }

    public IFCBaseGraphVertex getGraphA() {
        return graphA;
    }

    public void setGraphA(IFCBaseGraphVertex graphA) {
        this.graphA = graphA;
    }

    public IFCBaseGraphVertex getGraphB() {
        return graphB;
    }

    public void setGraphB(IFCBaseGraphVertex graphB) {
        this.graphB = graphB;
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
