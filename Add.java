import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER A NUMBER:");
        double x = sc.nextDouble();

        System.out.println("ENTER A NUMBER:");
        double y = sc.nextDouble();

        System.out.println("SUM OF THE GIVEN NUMBERS = " + (x + y));

        sc.close(); // good practice to close the scanner
    }
}
