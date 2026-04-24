import java.util.regex.*;

public class ExtractLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, JavaScript and Go";

        Pattern pattern = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}