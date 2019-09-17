package tree.utilities;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LibraryTest {
    BinaryTree tree;
    BinaryTree tree2;
    @Before
    public void init() {
        tree = new BinaryTree(150);
        tree.root.left = new Node(100);
        tree.root.left.left = new Node(75);
        tree.root.left.right = new Node(160);
        tree.root.left.right.left = new Node(125);
        tree.root.left.right.right = new Node(175);
        tree.root.right = new Node(250);
        tree.root.right.left = new Node(200);
        tree.root.right.right = new Node(350);
        tree.root.right.right.left = new Node(300);
        tree.root.right.right.right = new Node(500);


        tree2 = new BinaryTree(42);
        tree2.root.left = new Node(100);
        tree2.root.left.left = new Node(15);
        tree2.root.left.right = new Node(160);
        tree2.root.left.right.left = new Node(125);
        tree2.root.left.right.right = new Node(175);
        tree2.root.right = new Node(600);
        tree2.root.right.left = new Node(200);
        tree2.root.right.right = new Node(350);
        tree2.root.right.right.left = new Node(4);
        tree2.root.right.right.right = new Node(500);


    }

    @Test
    public void findIntersection() {
        Library test = new Library();
        ArrayList<Integer> list = new ArrayList<>();
        list = test.findIntersection(tree, tree2);
        assertTrue("The list should contain the value available in both binary trees",list.contains(100));
        assertTrue("The list should contain the value available in both binary trees",list.contains(160));
        assertTrue("The list should contain the value available in both binary trees",list.contains(125));
        assertTrue("The list should contain the value available in both binary trees",list.contains(175));
        assertTrue("The list should contain the value available in both binary trees",list.contains(200));
        assertTrue("The list should contain the value available in both binary trees",list.contains(350));
        assertTrue("The list should contain the value available in both binary trees",list.contains(500));

        assertFalse("The list should not contain the value not available in both binary trees",list.contains(4));
        assertFalse("The list should not contain the value not available in both binary trees",list.contains(42));


    }
}