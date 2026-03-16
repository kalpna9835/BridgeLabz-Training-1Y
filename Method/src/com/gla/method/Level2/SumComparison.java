package com.gla.method.Level2;

import java.util.Scanner;

public class SumComparison {

    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r1 = recursiveSum(n);
        int r2 = formulaSum(n);

        System.out.println("Recursive Sum: " + r1);
        System.out.println("Formula Sum: " + r2);
    }
}
