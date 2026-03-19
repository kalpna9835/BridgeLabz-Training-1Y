import java.util.Scanner;

public class FactorialRecursion {

    static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
    }
}
