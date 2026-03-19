import java.util.Scanner;

class PalindromeDuck {

    // Method to check Palindrome number
    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
        return reverse == original;
    }

    // Method to check Duck number
    static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n = n / 10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Palindrome Number: " + isPalindrome(number));
        System.out.println("Duck Number      : " + isDuck(number));
    }
}
