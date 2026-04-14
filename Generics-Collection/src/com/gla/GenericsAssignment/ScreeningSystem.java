import java.util.*;

abstract class JobRole {}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }
}

class ScreeningSystem {
    public static void processResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Processing: " + role.getClass().getSimpleName());
        }
    }
}