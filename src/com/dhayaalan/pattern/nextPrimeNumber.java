package com.dhayaalan.pattern;

import java.util.Scanner;

public class nextPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int primeNumber = scan.nextInt();
        System.out.println(getNextPrimeNumber(primeNumber));
    }

    public static int getNextPrimeNumber(int primeNumber) {
        int i = primeNumber + 1;
        int ans = 0;
        while (i <= 500) {
            if (checkNumberIsPrime(i)) {
                ans = i;
                return ans;
            }
            i++;
        }
        return ans;

    }

    public static boolean checkNumberIsPrime(int n) {

        if (n == 1) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
