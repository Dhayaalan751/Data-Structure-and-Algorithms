package com.dhayaalan.dataStructure.array;

import java.util.Scanner;

public class DeleteOperation {

    public static void main(String[] args) {
        int[] a = {5, 7, 8, 9, 1};
        System.out.println(a.length);
        System.out.println("Enter the position:");
        Scanner scan = new Scanner(System.in);
        int pos = scan.nextInt();
        deleteElement(a, pos);
        for (int j : a) {
            System.out.println(j);
        }
    }

    static void deleteElement(int[] a, int pos) {
        for (int i = pos; i < a.length - 1; i++)
            a[i] = a[i + 1];
        a[a.length - 1] = 0;
    }
}
