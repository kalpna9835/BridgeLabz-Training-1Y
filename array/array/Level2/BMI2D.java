package com.gla.array.Level2;
import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Height(m): ");
            double height = sc.nextDouble();
            System.out.print("Enter Weight(kg): ");
            double weight = sc.nextDouble();

            if (height <= 0 || weight <= 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            double bmi = weight / (height * height);
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println("Height: " + personData[i][0]);
            System.out.println("Weight: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2] + "\nStatus: " + weightStatus[i]);
        }
    }
}
