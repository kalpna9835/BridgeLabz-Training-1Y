import java.util.regex.*;

public class ExtractCurrency {
    public static void main(String[] args) {
        String text = "Price is $45.99 and discount is 10.50";

        Pattern pattern = Pattern.compile("\\$?\\d+(\\.\\d{2})?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}