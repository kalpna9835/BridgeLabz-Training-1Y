class PalindromeChecker {

    String text;

    // Method to check palindrome
    boolean isPalindrome() {
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }

        if (text.equals(reverse))
            return true;
        else
            return false;
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker();

        p.text = "madam";

        p.displayResult();
    }
}
