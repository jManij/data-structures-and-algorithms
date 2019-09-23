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
    public void addNodeTestandGetNodes() {
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

    @Test
    public void getNeighborsTest() {
        graph.addEdge(v1, v2, 2);
        graph.addEdge(v2, v3, 5);
        graph.addEdge(v3, v4, 6);
        graph.addEdge(v4, v1, 7);

        ArrayList<Edge> arrayListv1 = graph.getNeighbors(v1);
        ArrayList<Edge> arrayListv2 = graph.getNeighbors(v2);
        ArrayList<Edge> arrayListv3 = graph.getNeighbors(v3);
        ArrayList<Edge> arrayListv4 = graph.getNeighbors(v4);

        assertTrue("The method should return the neighbor of the vertex",
                arrayListv1.get(0).vertex.equals(v2));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv1.get(1).vertex.equals(v4));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv2.get(0).vertex.equals(v1));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv2.get(1).vertex.equals(v3));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv3.get(0).vertex.equals(v2));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv3.get(1).vertex.equals(v4));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv4.get(0).vertex.equals(v3));
        assertTrue("The method should return the neighbor of the vertex",
                arrayListv4.get(1).vertex.equals(v1));


    }

    @Test
    public void getSizeTest() {
        assertEquals("The method should return the size of the graph (number of nodes)",
                4, graph.size());

    }




}