package com.dhayaalan.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] arg) {
        int[] arr = {10, 22, 33, 15, 20, 30};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {
        int minIndex = 0;
        int size = arr.length - 1;
        for (int i = 0; i <= size; i++) {
            minIndex = i;
            for (int j = i + 1; j <= size; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
