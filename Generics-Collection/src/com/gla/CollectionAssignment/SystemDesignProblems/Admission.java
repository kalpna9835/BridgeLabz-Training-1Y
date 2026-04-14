import java.util.*;

class StudentA implements Comparable<StudentA> {
    int marks;
    StudentA(int m){marks=m;}
    public int compareTo(StudentA o){ return o.marks - marks; }
}

class Admission {
    List<StudentA> all = new ArrayList<>();
    Set<StudentA> shortlisted = new HashSet<>();
    Queue<StudentA> interview = new LinkedList<>();
    TreeSet<StudentA> merit = new TreeSet<>();
}