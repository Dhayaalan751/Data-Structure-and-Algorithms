package com.dhayaalan.bigInteger;

import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.Scanner;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = scan.nextInt();
       System.out.print(factorial(n));
    }

    public static BigInteger factorial(int n){
        BigInteger res = new BigInteger("1");
        for(int i = 2; i <= n; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
