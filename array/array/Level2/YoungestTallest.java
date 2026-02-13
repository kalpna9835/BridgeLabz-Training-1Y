package com.gla.array.Level2;
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        int[] height = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.println("Enter details of friend " + (i + 1));
            System.out.print("Age: ");
            age[i] = sc.nextInt();
            System.out.print("Height in cm: ");
            height[i] = sc.nextInt();
        }

        int youngest = age[0];
        int tallest = height[0];

        for(int i = 0; i < 3; i++){
            if(age[i] < youngest){
                youngest = age[i];
            }
            if(height[i] > tallest){
                tallest = height[i];
            }
        }
        System.out.println("\nYoungest age = " + youngest);
        System.out.println("Tallest height = " + tallest);
    }
}
