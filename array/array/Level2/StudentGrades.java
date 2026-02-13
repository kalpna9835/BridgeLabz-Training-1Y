package com.gla.array.Level2;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++){
            System.out.println("Student " + (i + 1));
            System.out.print("Enter marks of physics: ");
            phy[i] = sc.nextInt();
            System.out.print("Enter marks of chemistry: ");
            chem[i] = sc.nextInt();
            System.out.print("Enter marks of maths: ");
            math[i] = sc.nextInt();

            if(phy[i] < 0 || chem[i] < 0 || math[i] < 0){
                System.out.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if(percent[i] >= 80){
                grade[i] = 'A';
            }else if(percent[i] >= 70){
                grade[i] = 'B';
            }else if(percent[i] >= 60){
                grade[i] = 'C';
            }else if (percent[i] >= 50){
                grade[i] = 'D';
            }else if(percent[i] >= 40){
                grade[i] = 'E';
            }else{
                grade[i] = 'R';
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println("Percentage: " + percent[i] + " Grade: " + grade[i]);
        }
    }
}
