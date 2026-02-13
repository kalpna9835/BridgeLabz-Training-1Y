import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int i = 1;
            System.out.print("Multiples below 100: ");
            while (i < 100) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}
