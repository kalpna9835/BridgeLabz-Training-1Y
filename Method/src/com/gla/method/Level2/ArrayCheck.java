package com.gla.method.Level2;

import java.util.Scanner;

public class ArrayCheck {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            if (isPositive(i)) {
                if (isEven(i))
                    System.out.println(i + " Positive Even");
                else
                    System.out.println(i + " Positive Odd");
            } else {
                System.out.println(i + " Negative");
            }
        }

        int result = compare(arr[0], arr[4]);

        if (result == 1)
            System.out.println("First Greater");
        else if (result == 0)
            System.out.println("Equal");
        else
            System.out.println("Last Greater");
    }
}
