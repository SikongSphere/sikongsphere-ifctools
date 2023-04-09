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

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IfcGraphDfsHelper {
    public static void dfs(IfcGraphVertex startVertex) {
        Stack<IfcGraphVertex> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.isEmpty()) {
            IfcGraphVertex currentVertex = stack.pop();
            currentVertex.setVisited(true);

            System.out.println("Visited vertex: " + currentVertex.getGraphId());

            List<IfcGraphVertex> neighbors = getNeighbors(currentVertex);

            for (IfcGraphVertex neighbor : neighbors) {
                if (!neighbor.isVisited()) {
                    stack.push(neighbor);
                }
            }
        }
    }

    private static List<IfcGraphVertex> getNeighbors(IfcGraphVertex vertex) {
        // Find all edges that are connected to this vertex
        List<IfcGraphEdge> connectedEdges = vertex.getEdgeList();

        List<IfcGraphVertex> neighbors = new ArrayList<>();
        for (IfcGraphEdge edge : connectedEdges) {
            IfcGraphVertex neighbor = getNeighbor(vertex, edge);
            if (neighbor != null) {
                neighbors.add(neighbor);
            }
        }

        return neighbors;
    }

    private static IfcGraphVertex getNeighbor(IfcGraphVertex vertex, IfcGraphEdge edge) {
        if (edge.getSource().equals(vertex)) {
            return edge.getDestination();
        } else if (edge.getDestination().equals(vertex)) {
            return edge.getSource();
        } else {
            return null;
        }
    }
}
