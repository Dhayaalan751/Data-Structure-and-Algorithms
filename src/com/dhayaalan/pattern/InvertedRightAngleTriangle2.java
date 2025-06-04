package com.dhayaalan.pattern;

import java.util.Scanner;

public class InvertedRightAngleTriangle2 {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int i = 1;
        while (i <= s) {
            int j = 1;
            while(j <= s){
                if(i+j<=s+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
