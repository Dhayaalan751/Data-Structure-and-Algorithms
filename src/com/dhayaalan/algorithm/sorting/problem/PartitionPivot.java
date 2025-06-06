package com.dhayaalan.algorithm.sorting.problem;

import java.util.Arrays;


public class PartitionPivot {

    public static void main(String[] args) {
        int[] nums = {9,12,5,10,14,3,10};
        int pivot = 10;
//        int[] nums = {-3,4,3,2};
//        int pivot = 2;
        System.out.println(Arrays.toString(pivotArray(nums,pivot)));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int low = 0, high = nums.length - 1, i = low -1;

        for(int j = low; j <= high - 1; j++){
            if(nums[j] < pivot){
                i++;
                swap(nums,i,j);
            }
        }
        while(i<high){
            nums[high--] = nums[high];
        }
        nums[i+1] = pivot;
        return nums;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
