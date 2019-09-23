package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    HashMap<Vertex, ArrayList<Edge>> adjacencyList = new HashMap<>();
    private int size = 0;

    public Graph() {
        adjacencyList = new HashMap<Vertex, ArrayList<Edge>>();
    }

    public Vertex addNode(Vertex newVertex) {
        adjacencyList.put(newVertex, new ArrayList<Edge>());
        size++;
        return newVertex;
    }

    public String addEdge(Vertex v1, Vertex v2, int weight) {

        //Edge Case: Check if the vertices exist. Return immediately if not!

        addTwoEdges(v1, v2, weight);
        addTwoEdges(v2, v1, weight);
        return "Vertices added";
    }


    private void addTwoEdges(Vertex v1, Vertex v2, int weight) {

        ArrayList<Edge> arrayListOfEdges = adjacencyList.get(v1);
        arrayListOfEdges.add(new Edge(weight, v2));

        adjacencyList.put(v1, arrayListOfEdges);

    }

    public ArrayList<Vertex> GetNodes() {
        ArrayList<Vertex> arrayListOfVertices = new ArrayList<>();

        for (Map.Entry<Vertex, ArrayList<Edge>> entry : adjacencyList.entrySet()) {
            arrayListOfVertices.add(entry.getKey());
        }

        return arrayListOfVertices;
    }


    public ArrayList<Edge> getNeighbors(Vertex v1) {
        return adjacencyList.get(v1);
    }

    public int size() {
        return size;
    }

    public String print() {
        StringBuilder printString = new StringBuilder();
        for (Map.Entry<Vertex, ArrayList<Edge>> entry : adjacencyList.entrySet()) {

            printString.append("Vertex: " + entry.getKey().getValue()); //Prints the node Value

            for (Edge item: adjacencyList.get(entry.getKey())) {
                printString.append("-> {weight: " + item.weight + " , value: " +
                        item.vertex.value + "} ");

            }
//            System.out.println();
            printString.append("\n");
        }


        return printString.toString();

    }

    public static void main(String[] args) {
//        Graph graph = new Graph();
//        Vertex v1= new Vertex(1);
//        Vertex v2= new Vertex(2);
//        Vertex v3= new Vertex(3);
//        Vertex v4= new Vertex(4);
//
//
//        graph.addNode(v1);
//        graph.addNode(v2);
//        graph.addNode(v3);
//        graph.addNode(v4);
//
//        graph.addEdge(v1, v2, 5);
//        graph.addEdge(v1, v3, 10);
//        graph.addEdge(v4, v1, 12);
//
//
//
//
//        graph.print();
//        System.out.println(graph.size);
//        System.out.print("Hello");
    }


}
