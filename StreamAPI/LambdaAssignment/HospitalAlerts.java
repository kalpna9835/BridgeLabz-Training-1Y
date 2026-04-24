import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class HospitalAlerts {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("CRITICAL", "Heart rate abnormal"),
            new Alert("INFO", "Routine checkup scheduled"),
            new Alert("WARNING", "Low oxygen level"),
            new Alert("INFO", "Medication reminder")
        );

        Predicate<Alert> criticalOnly = a -> a.type.equals("CRITICAL");

        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);
    }
}