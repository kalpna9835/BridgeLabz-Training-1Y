import java.util.Scanner;

class SumNaturalRecursive {
    static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r1 = recursiveSum(n);
        int r2 = formulaSum(n);

        System.out.println("Recursive Sum: " + r1);
        System.out.println("Formula Sum: " + r2);
        System.out.println("Result Match: " + (r1 == r2));
    }
}
