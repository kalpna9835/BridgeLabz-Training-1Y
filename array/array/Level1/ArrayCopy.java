package com.gla.array.Level1;
import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] arr2D = new int[rows][cols];
        int[] arr1D = new int[rows*cols];
        int index = 0;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr2D[i][j] = sc.nextInt();
                arr1D[index++] = arr2D[i][j];
            }
        }
        System.out.println("1D Array:");
        for(int i : arr1D){
            System.out.print(i + " ");
        }
    }
}
