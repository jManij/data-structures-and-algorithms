package sort;

public class InsertionSort {

    static int[] algoInsertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];

            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main (String[] args) {
        int[] arr = new int[] {5, 7, 88, 22, 1, 2, 3, 12, 44,75, -2};
        algoInsertionSort(arr);

        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
