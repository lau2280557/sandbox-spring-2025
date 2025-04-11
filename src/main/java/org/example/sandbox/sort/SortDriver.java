package org.example.sandbox.sort;

public class SortDriver {
    public static void main(String[] args) {

        Integer[] intArray = {2, 4, 6, 5, 3, 1, 2, 1, 0};

        SortUtility.selectionSort(intArray);

        for (Integer i : intArray) {
            System.out.print(i + " ");
        }
    }
}
