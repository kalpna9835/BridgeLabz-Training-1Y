import java.util.Scanner;

class NumberProperties {

    // Prime number check
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Neon number check
    static boolean isNeon(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square = square / 10;
        }
        return sum == n;
    }

    // Spy number check
    static boolean isSpy(int n) {
        int sum = 0, product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n = n / 10;
        }
        return sum == product;
    }

    // Automorphic number check
    static boolean isAutomorphic(int n) {
        int square = n * n;
        return String.valueOf(square).endsWith(String.valueOf(n));
    }

    // Buzz number check
    static boolean isBuzz(int n) {
        return (n % 7 == 0 || n % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Prime Number      : " + isPrime(number));
        System.out.println("Neon Number       : " + isNeon(number));
        System.out.println("Spy Number        : " + isSpy(number));
        System.out.println("Automorphic Number: " + isAutomorphic(number));
        System.out.println("Buzz Number       : " + isBuzz(number));
    }
}
