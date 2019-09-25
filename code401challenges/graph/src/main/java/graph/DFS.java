package graph;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Stack;

public class DFS {

    /**
     * Receives a graph and the node to start from, and performs Depth-First-Search
     * @param graph
     * @param vertex
     * @return
     */
    public ArrayList<Vertex> performDFS(Graph graph, Vertex vertex) {
        ArrayList<Vertex> vertices = new ArrayList<>();
        ArrayList<Edge> allNeighbors;

        /**
         * Variables that track if the vertex has been visited before
         * Set each of the nodes to false
         */
        LinkedHashMap<Vertex, Boolean> visitedVertex = new LinkedHashMap<>();
        for(Vertex v: graph.GetNodes()) {
            visitedVertex.put(v, false);
        }

        Stack<Vertex> stackOfVertices = new Stack<>();
        stackOfVertices.push(vertex);

        while (!stackOfVertices.isEmpty()) {
            vertex = stackOfVertices.peek();
            stackOfVertices.pop();
            vertices.add(vertex);

            if(!visitedVertex.get(vertex)) {
                visitedVertex.put(vertex, true);
            }

            allNeighbors = graph.getNeighbors(vertex);
            for (Edge edge: allNeighbors) {
                if(!visitedVertex.get(edge.getVertex())) {
                    stackOfVertices.push(edge.getVertex());
                }

            }
        }

        return vertices;

    }


    /**
     * Returns a readable format representing the graph. This is mainly for testing purpose.
     * @param vertexArrayList
     * @return
     */
    public String getReadable(ArrayList<Vertex> vertexArrayList) {
        StringBuilder readableFormat = new StringBuilder();

        for(Vertex v: vertexArrayList) {
            readableFormat.append(v.getValue() + " ");
        }

        return readableFormat.toString();
    }
}
