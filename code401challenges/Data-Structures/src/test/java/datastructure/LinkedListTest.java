/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package datastructure;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListTest {
    LinkedList list = new LinkedList();

    @Before
    public void initializeForTest() {
        list.insert(1);
        list.insert(4);
        list.insert(7);
        list.insert(13);
        list.insert(17);
        list.insert(19);
        list.insert(23);
        list.insert(29);
        list.insert(37);
        list.insert(59);
        list.insert(60);
    }



    //Check to see if empty linked list gets created
    @Test
    public void emptyList() {
        LinkedList emptyList = new LinkedList();
        assertEquals("It should validate an empty linked list","HEAD -> NULL", emptyList.toString());
    }

    //Check to see if could be inserted into linked list
    @Test public void checkInsert1() {
        list.insert(10);
        assertEquals("It should insert the value in the beginning of the list","HEAD -> 10 -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> NULL", list.toString());
    }

    @Test public void checkInsert2() {
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        assertEquals("It should insert multiple values in the beginning of the linked list in the order they were received","HEAD -> 40 -> 30 -> 20 -> 10 -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> NULL", list.toString());
    }

    @Test public void checkIncludes() {
        assertEquals("It should return true for value that exists in the linked list",true, list.includes(17));
        assertEquals("It should return false for value that does not exist in the linked list",false, list.includes(30));
    }

    @Test public void checkToString()
    {
        assertEquals("It should return the string version of the linked list", "HEAD -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> NULL", list.toString());
    }

    //Challenge 06
    @Test public void addAtEndTest() {
        list.append(70);
        assertEquals("It should append the value at the end of the linked list","HEAD -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> 70 -> NULL", list.toString());

    }

    @Test public void addMultipleAtEndTest() {
        list.append(71);
        list.append(72);
        list.append(73);
        list.append(74);
        list.append(75);
        list.append(76);
        list.append(77);
        assertEquals("It should add multiple values at the end of the linked list","HEAD -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> 71 -> 72 -> 73 -> 74 -> 75 -> 76 -> 77 -> NULL", list.toString());

    }

    @Test public void addInBeforeMiddleTest() {
        list.insertBefore(19,20);
        assertEquals("It should add new value before the given value in the linked list","HEAD -> 60 -> 59 -> 37 -> 29 -> 23 -> 20 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> NULL", list.toString());
    }

    @Test public void addInBeforeFirstTest() {
        list.insertBefore(60,20);
        assertEquals("It should add new value before the given value in the linked list","HEAD -> 20 -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> NULL", list.toString());
    }

    @Test public void addInAfterMiddleTest()  {
        list.insertAfter(19, 100);
        assertEquals("It should add new value after the given value in the linked list","HEAD -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 100 -> 17 -> 13 -> 7 -> 4 -> 1 -> NULL", list.toString());
    }

    @Test public void addInAfterLastTest() {
        list.insertAfter(1, 100);
        assertEquals("It should add new value after the given value in the linked list","HEAD -> 60 -> 59 -> 37 -> 29 -> 23 -> 19 -> 17 -> 13 -> 7 -> 4 -> 1 -> 100 -> NULL", list.toString());
    }

    /*
    Challenge - 07
    Test to validate:
    # Where k is greater than the length of the linked list
    # Where k and the length of the list are the same
    # Where k is not a positive integer
    # “Happy Path” where k is not at the end, but somewhere in the middle of the linked list
     */

    @Test public void kthFromEndTest() {
        System.out.println(list.toString());
        assertEquals("It should return the last element of the linked list",1, list.kFromEnd(0));
        assertEquals("It should return the first element of the linked list",60, list.kFromEnd(10));
        assertEquals("It should return -1 for argument equal to the length of linked list",-1, list.kFromEnd(11));
        assertEquals("It should return the last element of the linked list",-1, list.kFromEnd(-1));
        assertEquals("It should return the kth element from the last of the linked list",19, list.kFromEnd(5));

    }

    /*
    Test to validate:
     # Where the linked list is of a size 1
     */

    @Test public void kthFromEndtestforSize1() {
        LinkedList smallList = new LinkedList();
        smallList.insert(5);
        System.out.println(smallList.toString());
        assertEquals("It should return the only element in the linked list",5, smallList.kFromEnd(0));
        assertEquals("It should return -1 for index that is out of bound",-1, smallList.kFromEnd(1));
        assertEquals("It should return -1 for index that is out of bound",-1, smallList.kFromEnd(-1));
        assertEquals("It should return -1 for index that is out of bound",-1, smallList.kFromEnd(5));




    }

}