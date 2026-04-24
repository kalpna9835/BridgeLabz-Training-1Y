import java.util.*;

public class EmailService {
    public static void main(String[] args) {

        List<String> emails = Arrays.asList("a@mail.com", "b@mail.com");

        emails.forEach(email ->
            sendEmailNotification(email)
        );
    }

    static void sendEmailNotification(String email) {
        System.out.println("Email sent to: " + email);
    }
}