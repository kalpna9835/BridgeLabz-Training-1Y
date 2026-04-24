import java.util.*;

public class CustomerNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "zara", "amit", "neha");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}