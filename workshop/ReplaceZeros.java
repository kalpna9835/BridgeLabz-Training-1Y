import java.util.Scanner;

public class ReplaceZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String str = String.valueOf(num);
        str = str.replace('0', '1');

        int result = Integer.parseInt(str);

        System.out.println("Modified number: " + result);
    }
}