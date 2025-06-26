package com.dhayaalan.algorithm.sorting.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8,9,9,5,11,5,5,9,6,11,10,5));
        int m = 11;
        System.out.print(findMinDiff(arr,m));

    }

    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int size = arr.size();
        if((size-1) == m)
            return arr.get(m-1) - arr.get(0);
        int i =0;
        int limit = size/m +1;
        int min = Integer.MAX_VALUE;
        while(i <= limit){
            int diff = arr.get(i+m - 1) - arr.get(i);
            if(min > diff ){
                min = diff;
            }
            i++;
        }

        return min;
    }
}
