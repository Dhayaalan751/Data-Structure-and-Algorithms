package com.dhayaalan.algorithm.partition;

import java.util.Arrays;

public class LomutoPartition {

    public static void  main(String[] arg){
        int[] arr = {10,50,80,100,40,20,30};
        int pivotIndex = 3;
        System.out.println("O/P: "+ Arrays.toString(lomutoPartition(arr,pivotIndex)));
    }

    static int[] lomutoPartition(int[] arr,int pivotIndex){

        int low = 0, high = arr.length - 1, i = low - 1, pivotValue = arr[pivotIndex];

        if(pivotIndex != high){
            swap(arr,pivotIndex,high);
             pivotValue = arr[high];
        }

        for (int j = low; j <= high - 1; j++) {
            if(arr[j] < pivotValue){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
