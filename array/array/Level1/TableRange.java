package com.gla.array.Level1;
import java.util.Scanner;

public class TableRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] result = new int[10];

        System.out.print("Enter number(6 to 9): ");
        int num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            result[i - 1] = num * i;
        }

        for(int i = 0; i < result.length; i++){
            System.out.println(num + " * " + (i + 1) + " = " + result[i]);
        }
    }
}
