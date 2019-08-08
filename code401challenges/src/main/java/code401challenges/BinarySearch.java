package code401challenges;

public class BinarySearch {

    public static int binary_search(int[] arr, int search_key) {
        int left = 0;
        int right = arr.length - 1;
        int middle;

        while (left <= right) {
            middle = left + (right -1) / 2;  //Get the middle index

            if (arr[middle] == search_key) {
                return middle;   //Element found, returning the index
            }

            if (arr[middle] < search_key) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }


        }

        return -1; //element not found

    }
}
