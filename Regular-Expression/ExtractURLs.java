import java.util.regex.*;

public class ExtractURLs {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org";

        Pattern pattern = Pattern.compile("https?://[^\\s]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}