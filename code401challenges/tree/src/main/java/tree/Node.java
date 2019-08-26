package tree;

public class Node<T> {
    T value;
    Node left, right;

    Node (T data) {
        this.value = data;
        left = right = null;
    }

}
