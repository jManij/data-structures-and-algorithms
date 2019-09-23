package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {
    Graph graph = new Graph();

    Vertex v1= new Vertex(1);
    Vertex v2= new Vertex(2);
    Vertex v3= new Vertex(3);
    Vertex v4= new Vertex(4);

    @Before
    public void init() {
        graph.addNode(v1);
        graph.addNode(v2);
        graph.addNode(v3);
        graph.addNode(v4);

    }

    @Test
    public void addNodeTest() {
        Vertex v5 = new Vertex(5);
        graph.addNode(v5);
        assertTrue("The graph should contain the vertex that has been added",graph.GetNodes().contains(v1));
        assertTrue("The graph should contain the vertex that has been added",graph.GetNodes().contains(v2));
        assertTrue("The graph should contain the vertex that has been added",graph.GetNodes().contains(v3));
        assertTrue("The graph should contain the vertex that has been added",graph.GetNodes().contains(v4));
        assertTrue("The graph should contain the vertex that has been added",graph.GetNodes().contains(v5));

    }

    @Test
    public void addEdgeTest() {
        graph.addEdge(v1, v2, 2);
        graph.addEdge(v2, v3, 5);
        graph.addEdge(v3, v4, 6);
        graph.addEdge(v4, v1, 7);

        assertNotNull(graph.print());
    }









}