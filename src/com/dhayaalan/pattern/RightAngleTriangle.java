package com.dhayaalan.pattern;

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();

        int i = 1;
        while (i <= s-1) {
            int j = 1;
            while(j <= i){
                if(j == 1 || j == i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
        int y = 0;
        while(y < s){
            System.out.print("* ");
            y++;
        }
    }
}
