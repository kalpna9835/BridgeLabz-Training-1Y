package com.gla.method.Level1;

import java.util.Scanner;

public class AthleteRun {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);

        System.out.println("Rounds required: " + rounds);
    }
}

