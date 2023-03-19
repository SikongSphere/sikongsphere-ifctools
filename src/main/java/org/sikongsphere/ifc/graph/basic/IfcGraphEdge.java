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

import org.sikongsphere.ifc.model.schema.kernel.entity.IfcRelationship;

public abstract class IfcGraphEdge {
    private IfcRelationship relationShip;
    private IfcGraphVertex graphA;
    private IfcGraphVertex graphB;
    private String graphId;

    private String graphLayer;

    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public IfcRelationship getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(IfcRelationship relationShip) {
        this.relationShip = relationShip;
    }

    public IfcGraphVertex getGraphA() {
        return graphA;
    }

    public void setGraphA(IfcGraphVertex graphA) {
        this.graphA = graphA;
    }

    public IfcGraphVertex getGraphB() {
        return graphB;
    }

    public void setGraphB(IfcGraphVertex graphB) {
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
