package com.dhayaalan.algorithm.search;

public class BinarySearchProblem {

    public static void main(String[] arg) {


        //count 1s using binary search algorithm
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 0};
        System.out.println("Count One's: " + countOnes(arr));

        //FlourSquare
        int n = 11;
        System.out.println("Flour Square Root: " + flourSquareRoot(n));

    }

    static int countOnes(int[] arr) {
        int low = 0, high = arr.length - 1, lastOneIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == 1) {
                lastOneIndex = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastOneIndex + 1;
    }

    static int flourSquareRoot(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= n / mid) {  // To avoid overflow in mid * mid
                ans = mid;
                low = mid + 1; // Try for a bigger square root
            } else {
                high = mid - 1; // Try for a smaller square root
            }
        }

        return ans;
    }
}
