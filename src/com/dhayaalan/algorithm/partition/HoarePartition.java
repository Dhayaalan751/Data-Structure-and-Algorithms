package com.dhayaalan.algorithm.partition;

import java.util.Arrays;

public class HoarePartition {

    public static void main(String[] arg){
        int[] arr = {9,12,5,10,14,3,10};
        int pivotValue = 10;
        System.out.println(Arrays.toString(hoarePartition(arr,pivotValue)));
    }

    static int[] hoarePartition(int[] arr,int pivot){

        int low = 0, high = arr.length - 1, i = low - 1, j = high + 1;

        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);

            if(i >= j) return arr;
            swap(arr,i,j);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
