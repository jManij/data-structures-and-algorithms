package tree;

import java.util.ArrayList;

public class BinaryTree<T> {
    public Node root;

    /**
     * Constructor
     * @param data
     * Creates a tree with the given data
     * The node has left and right child
     */
    public BinaryTree(T data) {
        this.root = new Node(data);
    }

    /**
     * Default constructor
     */
    public BinaryTree() {
        this.root = null;
    }

    /**
     * Takes in the root node
     * Traversal: left, root, right
     * @param node
     */
    public ArrayList<T> inOrder(Node node, ArrayList<T> items) {

        if (node == null)
            return null;

        inOrder(node.left, items);
        items.add((T) node.value);
        inOrder(node.right, items);

        return items;

    }

    /**
     * Takes in root node
     * Traversal: root, left, right
     * @param node
     */
    ArrayList<T> preOrder(Node node, ArrayList<T> items) {
        if (node == null)
            return null;
        items.add((T) node.value);
        preOrder(node.left, items);
        preOrder(node.right, items);

        return items;

    }

    /**
     * Takes in root node
     * Traversal: left, right, root
     * @param node
     */
    ArrayList<T> postOrder(Node node, ArrayList<T> items) {
        if (node == null)
            return null;
        postOrder(node.left, items);
        postOrder(node.right, items);
        items.add((T) node.value);

        return items;

    }

    /**
     * Helper method to print the contents of the tree
     * @param node
     */
    public String printTree(Node node) {
        return inOrder(node, new ArrayList<T>()).toString();
    }


}
