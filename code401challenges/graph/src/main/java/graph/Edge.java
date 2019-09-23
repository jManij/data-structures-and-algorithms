package graph;

public class Edge<T> {

    int weight;
    Vertex<T> vertex;


    /***
     * Constructor
     * @param weight
     * @param vertex
     */

    public Edge(int weight, Vertex<T> vertex) {
        this.weight = weight;
        this.vertex = vertex;
    }


    /**
     * Getters & Setters
     * @return
     */

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Vertex<T> getVertex() {
        return vertex;
    }

    public void setVertex(Vertex<T> vertex) {
        this.vertex = vertex;
    }
}
