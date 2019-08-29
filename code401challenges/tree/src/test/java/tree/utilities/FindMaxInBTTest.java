package tree.utilities;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import static org.junit.Assert.*;

public class FindMaxInBTTest {

    BinaryTree tree;
    BinaryTree tree1;
    BinaryTree tree2;
    BinaryTree tree3;
    BinaryTree tree4;

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

        tree2 = new BinaryTree(5);
        tree2.root.left = new Node(9);
        tree2.root.right = new Node(11);
        tree2.root.left.left = new Node(75);
        tree2.root.left.right = new Node(46);


        tree3 = new BinaryTree(3);
        tree3.root.left = new Node(36);
        tree3.root.right = new Node(399);
        tree3.root.left.left = new Node(3999);
        tree3.root.left.right = new Node(3);

        tree4 = new BinaryTree(125);
        tree4.root.left = new Node(105);
        tree4.root.right = new Node(152);
        tree4.root.left.left = new Node(195);
        tree4.root.left.right = new Node(615);
    }

    @Test
    public void findMaxInBTTest() {
        FindMaxInBT test = new FindMaxInBT();

        assertEquals("The method should return the maximum value in the tree",5, test.findMaxInBT(tree.root));
        assertEquals("The method should return the maximum value in the tree",11, test.findMaxInBT(tree1.root));
        assertEquals("The method should return the maximum value in the tree",75, test.findMaxInBT(tree2.root));
        assertEquals("The method should return the maximum value in the tree",3999, test.findMaxInBT(tree3.root));
        assertEquals("The method should return the maximum value in the tree",615, test.findMaxInBT(tree4.root));


    }


}