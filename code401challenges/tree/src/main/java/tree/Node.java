package tree;

public class Node<T> {
    public T value;
    public Node left, right;

    public Node(T data) {
        this.value = data;
        left = right = null;
    }

}
