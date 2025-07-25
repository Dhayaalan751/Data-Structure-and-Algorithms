package com.dhayaalan.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] arg) {
        int[] arr = {10, 23, 2, 4, 19, 40};
        System.out.print(Arrays.toString(insertionSort(arr)));
    }

    static int[] insertionSort(int[] arr) {
        int size = arr.length -1;
        for(int i = 1; i <= size; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
