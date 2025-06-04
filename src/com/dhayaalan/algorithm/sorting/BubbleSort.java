package com.dhayaalan.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] arg) {
        int[] arr = {10, 20, 30, 50, 13, 20};
        System.out.print(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {
        int size = arr.length - 1;
        for (int i = 0; i < size; i++) {
            boolean swapped = false;
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
                swapped = true;
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
