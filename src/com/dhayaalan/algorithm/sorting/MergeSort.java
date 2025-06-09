package com.dhayaalan.algorithm.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {10, 23, 2, 4, 19, 40};
        System.out.print(Arrays.toString(mergeSort(arr,0,arr.length-1)));
    }

    static int[] mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr,l,mid,r);
        }
        return arr;
    }

    static void merge(int[] arr,int l,int mid,int r){
        int n1 = mid - l + 1, n2 = r - mid;
        int[] left = new int[n1], right = new int[n2];

        for (int i = 0; i < n1 ; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2 ; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = l;
        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}
