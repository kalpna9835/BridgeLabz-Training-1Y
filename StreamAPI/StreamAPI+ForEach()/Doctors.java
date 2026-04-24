import java.util.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public String toString() {
        return name + " - " + specialty;
    }
}

public class Doctors {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. A", "Cardiologist", true),
            new Doctor("Dr. B", "Dermatologist", false),
            new Doctor("Dr. C", "Neurologist", true),
            new Doctor("Dr. D", "Cardiologist", true)
        );

        doctors.stream()
               .filter(d -> d.availableOnWeekend)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}