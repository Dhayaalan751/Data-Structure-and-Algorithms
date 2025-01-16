package com.dhayaalan.array;

import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number FOUR:");
        int N = scan.nextInt();
        int[][] M = {{2, 1, 4, 3},
                {1, 2, 3, 2},
                {3, 6, 2, 3},
                {5, 2, 5, 3}};
        System.out.print(countOfCommonNumber(M,N));
    }

    public static int countOfCommonNumber(int[][] M, int N){
        int ans = 0,x = 0,y = 0;
        while(x < N){
            int value = M[0][y];
            int count = 0;
            for(int i = 1; i < N; i ++){
                for(int j = 0; j < N; j++){
                    int value2 = M[i][j];
                    if( value == value2){
                        count++;
                        break;
                    }
                }
            }

            if(count == (N-1) ){
                ans ++;
            }

            y++;
            x++;
        }

        return ans;
    }
}
