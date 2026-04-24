import java.util.*;
import java.util.stream.*;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("rahul", "priya", "amit");

        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .toList();

        System.out.println(upperNames);
    }
}