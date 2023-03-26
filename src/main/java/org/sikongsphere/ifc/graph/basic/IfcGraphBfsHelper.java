package org.sikongsphere.ifc.graph.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IfcGraphBfsHelper {
    public static void  bfs(IfcGraphVertex startVertex) {
        Queue<IfcGraphVertex> queue = new LinkedList<>();
        queue.offer(startVertex);
        startVertex.setVisited(true);

        while(!queue.isEmpty()) {
            IfcGraphVertex currentVertex = queue.poll();

            System.out.println("Visited vertex: " + currentVertex.getGraphId());

            List<IfcGraphVertex> neighbors = getNeighbors(currentVertex);

            for(IfcGraphVertex neighbor : neighbors) {
                if(!neighbor.isVisited()) {
                    neighbor.setVisited(true);
                    queue.offer(neighbor);
                }
            }
        }
    }

    private static List<IfcGraphVertex> getNeighbors(IfcGraphVertex vertex) {
        // Find all edges that are connected to this vertex
        List<IfcGraphEdge> connectedEdges = vertex.getEdgeList();

        List<IfcGraphVertex> neighbors = new ArrayList<>();
        for(IfcGraphEdge edge : connectedEdges) {
            IfcGraphVertex neighbor = getNeighbor(vertex, edge);
            if(neighbor != null) {
                neighbors.add(neighbor);
            }
        }

        return neighbors;
    }


    private static IfcGraphVertex getNeighbor(IfcGraphVertex vertex, IfcGraphEdge edge) {
        if(edge.getSource().equals(vertex)) {
            return edge.getDestination();
        } else if(edge.getDestination().equals(vertex)) {
            return edge.getSource();
        } else {
            return null;
        }
    }
}
