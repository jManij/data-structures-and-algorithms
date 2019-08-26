package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    BinaryTree tree;
    @Before
    public void init() {
        tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
    }

    @Test
    public void inOrder() {
        ArrayList <Integer> items = new ArrayList<>();
        ArrayList <Integer> returnItems = new ArrayList<>();
        returnItems.add(4);
        returnItems.add(2);
        returnItems.add(5);
        returnItems.add(1);
        returnItems.add(3);

        assertEquals("The method should return the arraylist in order",returnItems, tree.inOrder(tree.root, items));

    }

    @Test
    public void preOrder() {
        ArrayList <Integer> items = new ArrayList<>();
        ArrayList <Integer> returnItems = new ArrayList<>();
        returnItems.add(1);
        returnItems.add(2);
        returnItems.add(4);
        returnItems.add(5);
        returnItems.add(3);

        assertEquals("The method should return the arraylist in pre-order",returnItems, tree.preOrder(tree.root, items));
    }

    @Test
    public void postOrder() {
        ArrayList <Integer> items = new ArrayList<>();
        ArrayList <Integer> returnItems = new ArrayList<>();
        returnItems.add(4);
        returnItems.add(5);
        returnItems.add(2);
        returnItems.add(3);
        returnItems.add(1);

        assertEquals("The method should return the arraylist in post-order",returnItems, tree.postOrder(tree.root, items));
    }
}