package com.dhayaalan.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 23, 2, 4, 19, 40};
        System.out.print(Arrays.toString(quickSort(arr,0,arr.length-1)));
    }

    static int[] quickSort(int[] arr, int l, int r){
        if(l < r){

            //Quick Sort with Lomuto's Partition
//            int p = lomutoPartition(arr,l,r);
//            quickSort(arr, l, p - 1);
//            quickSort(arr,  p + 1 , r);

            //Quick sort with Hoare's Partition
            int p = hoarePartition(arr,l,r);
            quickSort(arr, l, p );
            quickSort(arr,  p + 1 , r);

        }
        return arr;
    }

    static int lomutoPartition(int[] arr,int low ,int high){

         int i = low - 1, pivotValue = arr[high];


        for (int j = low; j <= high - 1; j++) {
            if(arr[j] < pivotValue){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }

    static int hoarePartition(int[] arr, int low, int high){

        int i = low - 1, j = high + 1, pivot = arr[low];

        while(true){
            do{
                i++;
            }while(arr[i] < pivot);

            do{
                j--;
            }while(arr[j] > pivot);

            if(i >= j) return j;
            swap(arr,i,j);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
