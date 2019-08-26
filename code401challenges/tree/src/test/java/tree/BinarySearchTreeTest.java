package tree;

import org.apache.commons.math3.geometry.partitioning.BSPTree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    BinarySearchTree BST = new BinarySearchTree(3);


    @Before
    public void init() {
        BST.add(BST.root, 1);
        BST.add(BST.root, 2);
        BST.add(BST.root, 4);
        BST.add(BST.root, 5);

        BST.inorderRec(BST.root);
    }

    @Test
    public void addandContainsTest() {

        assertEquals("The method should add the value and return the root node", BST.root, BST.add(BST.root, 1));
        assertEquals("The method should add the value and return the root node", BST.root, BST.add(BST.root, 2));
        assertEquals("The method should add the value and return the root node", BST.root, BST.add(BST.root, 4));
        assertEquals("The method should add the value and return the root node", BST.root, BST.add(BST.root, 5));
        assertTrue(BST.contains(BST.root, 5));

    }


}