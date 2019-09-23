package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BFSTest {
    Graph graph = new Graph();

    Vertex v1= new Vertex('A');
    Vertex v2= new Vertex('B');
    Vertex v3= new Vertex('C');
    Vertex v4= new Vertex('D');
    Vertex v5= new Vertex('E');
    Vertex v6= new Vertex('F');



    @Before
    public void init() {
        graph.addNode(v1);
        graph.addNode(v2);
        graph.addNode(v3);
        graph.addNode(v4);
        graph.addNode(v5);
        graph.addNode(v6);

        graph.addEdge(v1, v2, 2);
        graph.addEdge(v1, v3, 5);
        graph.addEdge(v1, v4, 6);
        graph.addEdge(v3, v5, 1);
        graph.addEdge(v3, v6, 2);

    }

    @Test
    public void test() {

        System.out.println(graph.print());

    }






}