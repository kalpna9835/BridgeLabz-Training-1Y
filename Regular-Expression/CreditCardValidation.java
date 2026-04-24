public class CreditCardValidation {
    public static void main(String[] args) {
        String[] cards = {"4123456789012345", "5123456789012345", "6123456789012345"};

        String regex = "^(4\\d{15}|5[1-5]\\d{14})$";

        for (String card : cards) {
            System.out.println(card + " -> " + card.matches(regex));
        }
    }
}