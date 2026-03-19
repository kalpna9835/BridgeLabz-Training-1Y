import java.util.Scanner;

class NumberChecker {

    // Method to check Duck Number
    static boolean isDuckNumber(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n = n / 10;
        }
        return false;
    }

    // Method to check Armstrong Number
    static boolean isArmstrong(int n) {
        int original = n, sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        return sum == original;
    }

    // Method to find largest digit
    static int largestDigit(int n) {
        int max = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max)
                max = digit;
            n = n / 10;
        }
        return max;
    }

    // Method to find second largest digit
    static int secondLargestDigit(int n) {
        int largest = -1, second = -1;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                second = largest;
                largest = digit;
            } else if (digit != largest && digit > second) {
                second = digit;
            }
            n = n / 10;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Duck Number      : " + isDuckNumber(number));
        System.out.println("Armstrong Number : " + isArmstrong(number));
        System.out.println("Largest Digit    : " + largestDigit(number));
        System.out.println("Second Largest   : " + secondLargestDigit(number));
    }
}
