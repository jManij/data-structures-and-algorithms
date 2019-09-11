package sort;

public class QuickSort {

    public static int[] QuickSort(int[] arr, int left, int right) {
        if (left < right) {
            int position = Partition(arr, left, right);
            QuickSort(arr, left, position - 1);
            QuickSort(arr, position + 1, right);
        }

        return arr;

    }


    public static int Partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int low = left - 1;

        for (int i = left; i < right; i++) {
            if(arr[i] <= pivot) {
                low++;
                Swap(arr, i, low);
            }
        }

        Swap(arr, right, low + 1);

        return low + 1;
    }

    public static void Swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

    }

    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 88, 22, 1, 2, 3, 12, 44,75};

        QuickSort(arr, 0, arr.length - 1);

        for (int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}


