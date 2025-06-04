package com.dhayaalan.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number FOUR:");
        int N = scan.nextInt();
        int[][] M = {{2, 1, 2, 1},
                {1, 2, 1, 2},
                {1, 1, 2, 1},
                {1, 2, 2, 1}};
        System.out.println(countOfCommonNumber(M,N));
    }

    public static int countOfCommonNumber(int[][] M, int N){
        int distinctCount = distinctElement(M,N);
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

        return ans - distinctCount;
    }

    public static int distinctElement(int[][] M,int N){
       int count = 0;
       boolean isDistinct = true;
        for(int i = 0; i < N; i++){
            for(int j = i-1; j >= 0; j--){
                if(M[0][i] == M[0][j] ){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                count ++;
            }
        }
        

        return count;

    }


}
