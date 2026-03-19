import java.util.Scanner;

class FactorsOfNumber {

    // Method to find factors and store in array
    static int[] findFactors(int n) {
        int count = 0;

        // First loop: count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                factors[index++] = i;
        }

        return factors;
    }

    // Method to find sum of factors
    static int sum(int[] arr) {
        int s = 0;
        for (int x : arr)
            s += x;
        return s;
    }

    // Method to find product of factors
    static int product(int[] arr) {
        int p = 1;
        for (int x : arr)
            p *= x;
        return p;
    }

    // Method to find sum of squares of factors
    static double sumOfSquares(int[] arr) {
        double s = 0;
        for (int x : arr)
            s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors)
            System.out.print(f + " ");

        System.out.println("\nSum of Factors: " + sum(factors));
        System.out.println("Product of Factors: " + product(factors));
        System.out.println("Sum of Squares of Factors: " + sumOfSquares(factors));
    }
}
