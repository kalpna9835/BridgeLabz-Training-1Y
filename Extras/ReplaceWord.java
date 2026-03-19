import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        String oldWord = sc.nextLine();
        String newWord = sc.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (String w : words) {
            if (w.equals(oldWord))
                result += newWord + " ";
            else
                result += w + " ";
        }

        System.out.println(result.trim());
    }
}
