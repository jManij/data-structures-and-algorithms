package graph;

public class Vertex<T> {

    T value;  // Value for the Vertex

    /**
     * Constructor
     * @param value
     */
    public Vertex(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
