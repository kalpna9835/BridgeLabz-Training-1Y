import java.util.Scanner;

public class CalculateAverageofThreeNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        System.out.print("Enter third number: ");
        float c = sc.nextFloat();

        float average = (a + b + c) / 3;

        System.out.println("Average = " + average);
    }
}
