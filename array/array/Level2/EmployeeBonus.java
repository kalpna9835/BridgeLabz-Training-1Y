package com.gla.array.Level2;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Employee " + (i + 1));
            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of service: ");
            years[i] = sc.nextInt();

            if(salary[i] <= 0 || years[i] < 0){
                System.out.println("Invalid input. Enter again.");
                i--;
                continue;
            }
            if(years[i] > 5){
                bonus[i] = salary[i] * 0.05;
            }
            else{
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
        }

        System.out.println("\nEmployee Details:");
        for(int i = 0; i < 10; i++){
            System.out.println("Old Salary: " + salary[i] + " Bonus: " + bonus[i] + " New Salary: " + newSalary[i]);
        }
        System.out.println("\nTotal Bonus Payout = " + totalBonus);
    }
}
