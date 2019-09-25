package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFS {


    /**
     * Takes in the graph and the vertex to start from and performs the breadth-first-search
     * @param vertex
     * @return
     */
    public ArrayList<Vertex> performBFS(Graph graph, Vertex vertex) {
        ArrayList<Vertex> vertices = new ArrayList<>();
        ArrayList<Edge> allNeighbors;
        LinkedList<Vertex> queue = new LinkedList<>();

        queue.add(vertex);  //Add first node into the queue

        while (!queue.isEmpty()) {
            Vertex tempVertex = queue.poll();
            vertices.add(tempVertex);

            allNeighbors = graph.getNeighbors(tempVertex);
            if(!allNeighbors.isEmpty() || allNeighbors != null) {

                for (Edge item: allNeighbors) {
                    queue.add(item.vertex);
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
