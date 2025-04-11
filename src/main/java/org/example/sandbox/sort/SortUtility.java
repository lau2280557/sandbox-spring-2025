package org.example.sandbox.sort;

public class SortUtility {

    private SortUtility() {
        // Prevent instantiation
    }

    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {

            // Assume first value is min
            min = index;

            for (int scan = index + 1; scan < data.length; scan++) {

                // Find minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }

            }

            // Swap minimum value with lowest index
            swap(data, min, index);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int min, int index) {
        T temp = data[min];
        data[min] = data[index];
        data[index] = temp;
    }

}
