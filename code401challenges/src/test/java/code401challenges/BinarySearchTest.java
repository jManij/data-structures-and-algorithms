package code401challenges;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binary_search() {
        BinarySearch test = new BinarySearch();
        assertEquals("It should return the index of the search key",9,
                test.binary_search(new int[] {1, 2, 3, 5, 7, 8, 9, 12, 34, 56, 78}, 56));
        assertEquals("It should return -1 for search key not found in the array",-1,test.binary_search(new int[]{22, 34, 56, 78, 99, 123, 345, 654}, 689));

    }
}