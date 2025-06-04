package com.dhayaalan.dataStructure.array;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] a = {10, 20, 20, 30, 30, 30};
        System.out.println(removeDuplicate(a));
    }

    static int removeDuplicate(int[] a) {
        int res = 1;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] != a[res - 1]) {
                a[res] = a[i];
                res++;
            }
        }
        return res;
    }
}
