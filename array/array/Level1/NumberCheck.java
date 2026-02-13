package com.gla.array.Level1;
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = new int [5];

        for(int i = 0; i < num.length; i++){
            System.out.print("Enter number " + (i + 1) + ": ");
            num[i] =  sc.nextInt();

            if(num[i] > 0){
                System.out.println("Positive");
            }
            else if(num[i] < 0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");
            }
        }
    }
}
