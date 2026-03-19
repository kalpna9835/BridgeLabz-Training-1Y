import java.util.Scanner;

class NumberAnalysis {

    // Method to find sum of digits
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    // Method to check Harshad number
    static boolean isHarshad(int n) {
        int sum = sumOfDigits(n);
        return n % sum == 0;
    }

    // Method to find frequency of digits
    static int[] digitFrequency(int n) {
        int[] freq = new int[10];

        while (n > 0) {
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("Sum of Digits: " + sum);

        System.out.println("Harshad Number: " + isHarshad(number));

        int[] freq = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0)
                System.out.println(i + " -> " + freq[i]);
        }
    }
}
