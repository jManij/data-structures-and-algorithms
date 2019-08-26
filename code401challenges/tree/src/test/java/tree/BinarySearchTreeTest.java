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
        assertTrue("The method should return true if the value is on the BST", BST.contains(BST.root, 5));
        assertTrue("The method should return true if the value is on the BST", BST.contains(BST.root, 4));
        assertTrue("The method should return true if the value is on the BST", BST.contains(BST.root, 3));
        assertTrue("The method should return true if the value is on the BST", BST.contains(BST.root, 2));
        assertTrue("The method should return true if the value is on the BST", BST.contains(BST.root, 1));
        assertFalse("The method should return false if the value is on the BST", BST.contains(BST.root, 6));
        assertFalse("The method should return false if the value is on the BST", BST.contains(BST.root, 7));
        assertFalse("The method should return false if the value is on the BST", BST.contains(BST.root, 8));
        assertFalse("The method should return false if the value is on the BST", BST.contains(BST.root, 9));




    }


}