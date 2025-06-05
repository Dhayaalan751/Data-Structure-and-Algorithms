package com.dhayaalan.algorithm.sorting.problem;

import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 = {1,2,3};
        System.out.println(Arrays.toString(mergeTwoSortedArray(nums1, 3, nums2, nums2.length)));
    }

    static int[] mergeTwoSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, size = m + n - 1;
        while (j>=0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[size--] = nums1[i--];
            } else {
                nums1[size--] = nums2[j--];
            }
        }
        return nums1;
    }

}
