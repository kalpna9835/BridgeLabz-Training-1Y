package com.gla.method.Level1;

import java.util.Scanner;

public class Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int result = calculateHandshakes(students);

        System.out.println("Maximum handshakes: " + result);
    }
}

