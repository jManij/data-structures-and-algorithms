package tree.utilities;

import tree.Node;

public class FindMaxInBT {


    public FindMaxInBT() {
    }

    public int findMaxInBT(Node node) {
        if (node == null)
            return -1; // Returning -1 as the least value in the tree.

        int current = (int) node.value;
        int left = findMaxInBT(node.left);
        int right = findMaxInBT(node.right);

        if (left > right)
            right = left;

        if (right > current)
            current = right;

        return current;

    }


}
