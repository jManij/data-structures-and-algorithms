package tree.utilities;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    BinaryTree tree;
    BinaryTree tree1;

    @Before
    public void init() {
        tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree1 = new BinaryTree(2);
        tree1.root.left = new Node(7);
        tree1.root.right = new Node(5);
        tree1.root.left.left = new Node(2);
        tree1.root.left.right = new Node(6);
        tree1.root.left.right.left = new Node(5);
        tree1.root.left.right.right = new Node(11);
        tree1.root.right.right = new Node(9);
        tree1.root.right.right.left = new Node(4);


        /** tree 1 structure
              2
             / \
            7   5
           / \    \
          2   6    9
             /\    /
            5  11  4

         */
    }

    @Test
    public void BFSTest() {
        BreadthFirst test = new BreadthFirst();
        assertEquals("The method should return value as BFS","[1, 2, 3, 4, 5]", test.BFS(tree).toString());
        assertEquals("The method should return value as BFS","[2, 7, 5, 2, 6, 9, 5, 11, 4]", test.BFS(tree1).toString());
    }

}