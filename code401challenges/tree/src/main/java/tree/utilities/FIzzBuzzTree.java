package tree.utilities;

import tree.BinaryTree;
import tree.Node;

public class FIzzBuzzTree<T> {



    public BinaryTree checkFizzBuzz(BinaryTree tree) {
        alterTree(tree.root);
        return tree;
    }

    void alterTree(Node root) {
        if (root == null)
            return;
        alterTree(root.left);
        if (!getFizzBuzz((T) root.value).isEmpty()) {
            root.value = getFizzBuzz((T) root.value);
        }
        alterTree(root.right);

    }

    String getFizzBuzz(T value) {
        if ((int) value % 15 == 0) {
            return "FizzBuzz";
        } else if((int )value % 3 == 0) {
            return "Fizz";
        } else if ((int) value % 5 == 0) {
            return "Buzz";
        }
        return ""; //return empty
    }

}
