package tree.utilities;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FIzzBuzzTreeTest<T> {
    BinaryTree tree;
    BinaryTree tree1;
    BinaryTree tree2;
    BinaryTree tree3;
    BinaryTree tree4;
    BinaryTree tree5;


    FIzzBuzzTree test = new FIzzBuzzTree();

    @Before
    public void init() {
        tree = new BinaryTree(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree1 = new BinaryTree(3);
        tree1.root.left = new Node(5);
        tree1.root.right = new Node(15);
        tree1.root.left.left = new Node(3);
        tree1.root.left.right = new Node(5);

        tree2 = new BinaryTree(5);
        tree2.root.left = new Node(5);
        tree2.root.right = new Node(5);
        tree2.root.left.left = new Node(5);
        tree2.root.left.right = new Node(5);


        tree3 = new BinaryTree(3);
        tree3.root.left = new Node(3);
        tree3.root.right = new Node(3);
        tree3.root.left.left = new Node(3);
        tree3.root.left.right = new Node(3);

        tree4 = new BinaryTree(15);
        tree4.root.left = new Node(15);
        tree4.root.right = new Node(15);
        tree4.root.left.left = new Node(15);
        tree4.root.left.right = new Node(15);
    }

    @Test
    public void checkFizzBuzz() {

        test.checkFizzBuzz(tree);
        test.checkFizzBuzz(tree1);
        test.checkFizzBuzz(tree2);
        test.checkFizzBuzz(tree3);
        test.checkFizzBuzz(tree4);


        assertEquals("The method should replace the number divisible by 3, 5 and 15","[4, 2, Buzz, 1, Fizz]", tree.printTree(tree.root));
        assertEquals("The method should replace the number divisible by 3, 5 and 15","[Fizz, Buzz, Buzz, Fizz, FizzBuzz]", tree1.printTree(tree1.root));
        assertEquals("The method should replace the number divisible by 3, 5 and 15","[Buzz, Buzz, Buzz, Buzz, Buzz]", tree2.printTree(tree2.root));
        assertEquals("The method should replace the number divisible by 3, 5 and 15","[Fizz, Fizz, Fizz, Fizz, Fizz]", tree3.printTree(tree3.root));
        assertEquals("The method should replace the number divisible by 3, 5 and 15","[FizzBuzz, FizzBuzz, FizzBuzz, FizzBuzz, FizzBuzz]", tree4.printTree(tree4.root));


    }
}