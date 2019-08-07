package code401challenges;

import java.util.Arrays;

public class ArrayShift {
    public static void main (String[] args) {
        int[] arr = new int[]{4, 8, 15, 23, 42};
        System.out.println("Array to be shifted: " + Arrays.toString(arr));
        System.out.println("Array after inserting value: " + 16 + " => " + Arrays.toString(arrayShift(arr, 16)));
    }

    public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded) {
        int middleIndex;
        //For even length
        if (arrToBeShifted.length % 2 == 0) {
            middleIndex = arrToBeShifted.length / 2;
        } else {
            middleIndex = arrToBeShifted.length / 2 + 1;
        }
        int[] newArray = new int[arrToBeShifted.length + 1];
        int index = 0;

        for (int i = 0; i < arrToBeShifted.length; i++) {
            if (i == middleIndex) {
                newArray[middleIndex] = intToBeAdded;
                index++;
            }
            newArray[index] = arrToBeShifted[i];
            index++;
        }
        return newArray;

    }
}
