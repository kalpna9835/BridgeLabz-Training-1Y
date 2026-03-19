import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();

        System.out.print("Convert to (C/F)? ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temp));
        } else if (choice == 'F') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
