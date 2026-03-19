import java.util.Scanner;

class EmployeeBonus {

    // Method to calculate bonus
    static double calculateBonus(double salary, int years) {
        if (years >= 5)
            return salary * 0.10;
        else
            return salary * 0.05;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = calculateBonus(salary, years);

        System.out.println("Bonus Amount: " + bonus);
    }
}
