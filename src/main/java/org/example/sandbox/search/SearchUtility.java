package org.example.sandbox.search;

public class SearchUtility {
    public static int binarySearchIterative(int[] array. int targetValue) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (array[mid] == targetValue) {
                return mid;
            } else if (array[mid] < targetValue) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
    }
}
