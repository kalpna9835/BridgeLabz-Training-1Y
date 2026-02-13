package com.gla.array.Level2;
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter number of phys: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter number of maths: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter number of chem: ");
            marks[i][2] = sc.nextInt();
            percent[i] = (marks[i][0] + marks[i][1] + marks[0][2]) / 3.0;

            if(percent[i] >= 80){
                grade[i] = 'A';
            } else if(percent[i] >= 70){
                grade[i] = 'B';
            } else if (percent[i] >= 60) {
                grade[i] = 'C';
            } else if (percent[i] >= 50) {
                grade[i] = 'D';
            }else if(percent[i] >= 40){
                grade[i] = 'E';
            }else{
                grade[i] = 'R';
            }
        }
        for(int i = 0; i < n;i++){
            System.out.println("Percentage = " + percent[i] + " Grade = " + grade[i]);
        }
    }
}
