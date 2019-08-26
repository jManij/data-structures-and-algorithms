package tree;

public class BinarySearchTree {
    Node root;

    /**
     * Constructor
     * @param data
     * Creates a BST with the given data
     */
    BinarySearchTree (int data) {
        this.root = new Node(data);
    }

    /**
     * Default constructor
     */

    BinarySearchTree() {
        this.root = null;
    }

    /**
     * Takes in the root node and value, adds new node into BST
     * @param value
     */
    Node add(Node node, int value) {
        if (node == null)
            return new Node(value);


        else if (value < (int) node.value)
            node.left = add(node.left, value);

         else node.right = add(node.right, value);

         return  node;

    }

    /**
     * Takes in root node and value and checks to see if it exists on the BST
     * returns true or false
     * inOrder traversal
     */
    boolean contains(Node node, int value) {
        if (node == null)
            return false;

        if (value < (int)node.value)
            return contains(node.left, value);

        return contains(node.right, value);

    }

    /**
     * Helper method to see the contents
     *
     */

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
//            System.out.println("here " + root.value);
            inorderRec(root.right);
        }
    }



}

