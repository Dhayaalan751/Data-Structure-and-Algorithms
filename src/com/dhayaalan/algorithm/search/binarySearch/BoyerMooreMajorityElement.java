package com.dhayaalan.algorithm.search.binarySearch;


public class BoyerMooreMajorityElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 1, 4, 2, 1};
        System.out.println("Majority Element: " + majorityElement(arr));
    }

    static int majorityElement(int[] arr) {
        int count = 0, candidate = -1;

        // Phase 1: Find a candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Phase 2: Verify the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        return (count > arr.length / 2) ? candidate : -1;
    }
}
