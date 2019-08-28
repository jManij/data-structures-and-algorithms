package tree.utilities;

import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst<T> extends BinaryTree {
    /**
     * Constructor
     *
     * @param data Creates a tree with the given data
     *             The node has left and right child
     */
    public BreadthFirst(Object data) {
        super(data);
    }

    public BreadthFirst() {
        super();
    }


    public ArrayList<T> BFS(BinaryTree tree) {
        Queue<Node> queue = new LinkedList<>();
        ArrayList<T> finalList = new ArrayList<>();
        Node temp;
        if (tree.root != null)
        queue.add(tree.root);

        while (!queue.isEmpty()) {
            temp = (Node) queue.remove();
            finalList.add((T) temp.value);

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        return finalList;
    }
}
