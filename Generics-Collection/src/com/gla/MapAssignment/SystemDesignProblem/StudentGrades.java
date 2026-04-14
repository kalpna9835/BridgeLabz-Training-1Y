import java.util.*;

class StudentGrades {
    public static void main(String[] args) {
        Map<String, Double> map = new TreeMap<>();

        map.put("Aman", 85.0);
        map.put("Riya", 90.0);

        map.put("Aman", 88.0); // update
        map.remove("Riya");

        for (var e : map.entrySet())
            System.out.println(e);
    }
}