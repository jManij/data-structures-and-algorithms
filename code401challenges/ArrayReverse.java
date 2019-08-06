import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    System.out.println("Array to be reversed: " + Arrays.toString(arr));
    System.out.println("Array after reverse function call: " + Arrays.toString(reverse(arr)));
  }

  public static int[] reverse(int[] arr) { 
    if (arr.length == 0 || arr == null) {
      return arr;
    } 
    int index = 0;
    int[] newArr = new int[arr.length];

    for (int i = arr.length - 1; i >= 0; i--) {
      newArr[index] = arr[i];
      index++;
    }
    return newArr;
  }

}