package com.dhayaalan.pattern;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int i = 1;
        while (i <= s) {
            int j = 1;
            if (i == 1 || i == s) {
                while (j <= s) {
                    System.out.print("* ");
                    j++;
                }
            } else {
                while (j <= s) {
                    if (j == 1 || j == s) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}
