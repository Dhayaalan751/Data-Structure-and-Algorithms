package com.dhayaalan.dataStructure.array;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] a = {1, 1, 0, 0, 1, 0, 1, 0, 0};
        // a = {1,1,1,1,0,0,0,0,0}
        int[] res = moveZerosToEnd(a);
        for (int j : res) {
            System.out.print(j + ",");
        }
    }

    static int[] moveZerosToEnd(int[] a) {
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] != 0) {
                int temp = a[j];
                a[i] = a[j];
                a[j] = temp;
                i++;
            }
        }
        return a;
    }
}
