import java.util.*;
public class FriendlyPair {
    public static int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 28;
        int sum1 = getSum(num1);
        int sum2 = getSum(num2);
        double ratio1 = (double) sum1 / num1;
        double ratio2 = (double) sum2 / num2;

        if (ratio1 == ratio2) {
            System.out.println("Yes, they are a friendly pair");
        } else {
            System.out.println("No, they are not a friendly pair");
        }
    }
}

