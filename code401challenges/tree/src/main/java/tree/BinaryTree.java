package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BinaryTree {
    Node root;

    /**
     * Constructor
     * @param data
     * Creates a tree with the given data
     * The node has left and right child
     */
    BinaryTree (int data) {
        this.root = new Node(data);
    }

    /**
     * Default constructor
     */
    BinaryTree() {
        this.root = null;
    }

    /**
     * Takes in the root node
     * Traversal: left, root, right
     * @param node
     */
    ArrayList<Integer> inOrder(Node node, ArrayList<Integer> items) {

        if (node == null)
            return null;

        inOrder(node.left, items);
        System.out.print(node.value + " ");
        items.add((Integer) node.value);
        inOrder(node.right, items);

        return items;

    }

    /**
     * Takes in root node
     * Traversal: root, left, right
     * @param node
     */
    ArrayList<Integer> preOrder(Node node, ArrayList<Integer> items) {
        if (node == null)
            return null;
        System.out.print(node.value + " ");
        items.add((Integer) node.value);
        preOrder(node.left, items);
        preOrder(node.right, items);

        return items;

    }

    /**
     * Takes in root node
     * Traversal: left, right, root
     * @param node
     */
    ArrayList<Integer> postOrder(Node node, ArrayList<Integer> items) {
        if (node == null)
            return null;
        postOrder(node.left, items);
        postOrder(node.right, items);
        System.out.print(node.value + " ");
        items.add((Integer) node.value);

        return items;

    }

}
