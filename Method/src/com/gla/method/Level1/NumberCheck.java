package com.gla.method.Level1;

import java.util.Scanner;

public class NumberCheck {
    public static int checkNumber(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = checkNumber(num);

        System.out.println(result);
    }
}

