package sort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    InsertionSort i = new InsertionSort();
    int[] arr1;
    int[] arr2;
    int[] arr;

    @Before
    public void init() {
        arr1 = new int[] {5, 7, 88, 22, 1, 2, 3, 12, 44,75, 77};
        arr2 = new int[] {12, 33, 1, 0, -1, -2, -7, 88, 23, 11, 11, 23,44};
        arr = new int[] {5, 7, 88, 22, 1, 2, 3, 12, 44,75};
    }

    @Test
    public void insertionSortSanityTest() {
        assertTrue("The returned array should refer to the same memory address.",
                arr.equals(i.algoInsertionSort(arr)));
        assertTrue("The returned array should refer to the same memory address.",
                arr1.equals(i.algoInsertionSort(arr1)));
        assertTrue("The returned array should refer to the same memory address.",
                arr2.equals(i.algoInsertionSort(arr2)));

    }

    @Test
    public void insertionSortFunctionalityTest() {
        int[] arr1Sorted = new int[] {1, 2, 3, 5, 7, 12, 22, 44, 75, 77, 88};
        int[] arr2Sorted = new int[] {-7, -2, -1, 0, 1, 11, 11, 12, 23, 23, 33, 44, 88};
        int[] arrSorted = new int[] {1, 2, 3, 5, 7, 12, 22, 44, 75, 88};
        Assert.assertArrayEquals("The array should be sorted.",arr1Sorted, i.algoInsertionSort(arr1));
        Assert.assertArrayEquals("The array should be sorted.",arr2Sorted, i.algoInsertionSort(arr2));
        Assert.assertArrayEquals("The array should be sorted.",arrSorted, i.algoInsertionSort(arr));

    }

}