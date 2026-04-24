import java.util.*;

public class SensorReadings {
    public static void main(String[] args) {

        List<Integer> readings = Arrays.asList(30, 75, 90, 45, 120);

        readings.stream()
                .filter(r -> r > 70)
                .forEach(r -> System.out.println("Alert reading: " + r));
    }
}