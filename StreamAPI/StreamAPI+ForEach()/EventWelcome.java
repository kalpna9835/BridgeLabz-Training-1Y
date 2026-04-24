import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Rahul", "Priya", "Amit");

        attendees.forEach(name ->
            System.out.println("Welcome " + name + " to the event!")
        );
    }
}