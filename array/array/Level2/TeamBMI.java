package com.gla.array.Level2;
import java.util.Scanner;

public class TeamBMI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of team members: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Member " + (i + 1));
            System.out.print("Height (in meters): ");
            height[i] = sc.nextDouble();
            System.out.print("Weight (in kg): ");
            weight[i] = sc.nextDouble();

            if(height[i]<=0 || weight[i]<=0){
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
            bmi[i] = weight[i] / (height[i]*height[i]);
        }

        System.out.println("\nBMI of team members: ");
        for(int i = 0; i < n; i++){
            System.out.println("Member " + (i + 1) + " BMI " + bmi[i]);
        }
    }
}
