import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return name + " expires on " + expiryDate;
    }
}

public class MembershipFilter {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        List<Member> members = Arrays.asList(
            new Member("Rahul", today.plusDays(10)),
            new Member("Priya", today.plusDays(40)),
            new Member("Amit", today.plusDays(25)),
            new Member("Sara", today.plusDays(5))
        );

        members.stream()
               .filter(m -> !m.expiryDate.isAfter(limit))
               .forEach(System.out::println);
    }
}