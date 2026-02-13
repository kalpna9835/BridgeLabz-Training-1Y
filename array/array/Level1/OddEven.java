package com.gla.array.Level1;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.print("Invalid input");
            return;
        }
        System.out.println("Even numbers:");
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("\nOdd numbers:");
        for(int i = 1;  i <= n; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
