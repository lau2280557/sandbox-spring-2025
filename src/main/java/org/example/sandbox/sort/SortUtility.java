package org.example.sandbox.sort;



public class SortUtility {

    private SortUtility() {
        // Prevent instantiation
    }

    public static <T extends Comparable<T>> void selectionSort(T[] data) {
        int min;
        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }
            swap(data, index, min);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index, int min) {
        T temp = data[min];
        data[min] = data[index];
        data[index] = temp;
    }

    public static <T extends Comparable<T>> void insertionSort(T[] data) {
        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index;

            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }
            data[position] = key;
        }

        public static <T extends Comparable<T>>void bubbleSort (T[]data){
            boolean swapped;
            for (int i = 0; i < data.length - 1; i++) {
                swapped = false;
                for (int j = 0; j < data.length - 1 - i; j++) {
                    if (data[j].compareTo(data[j + 1]) > 0) {
                        swap(data, j, j + 1);
                        swapped = true;
                    }
                }
                if (!swapped) {
                    break; // No swaps means the array is sorted
                }
            }
        }

        public static <T extends Comparable<T>>void quickSort (T[]data){
            quickSort(data, 0, data.length - 1);
        }
        private static <T extends Comparable<T>>void quickSort (T[]data,int low, int high){
            if (low < high) {
                int pivotIndex = partition(data, low, high);
                quickSort(data, low, pivotIndex - 1);
                quickSort(data, pivotIndex + 1, high);
            }
        }
    }
