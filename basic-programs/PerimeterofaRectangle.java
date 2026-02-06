import java.util.Scanner;

public class PerimeterofaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        float length = sc.nextFloat();

        System.out.print("Enter width: ");
        float width = sc.nextFloat();

        float perimeter = 2 * (length + width);

        System.out.println("Perimeter of the Rectangle = " + perimeter);
    }
}
