package com.dhayaalan.pattern;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int x = s;
        int y = s;
        int i = 1;
        while (i <= s) {
            int j = 1;
            while (j <= (2*s -1)) {
                if (j >= x && j <= y) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
            x--;
            y++;
        }
    }
}
