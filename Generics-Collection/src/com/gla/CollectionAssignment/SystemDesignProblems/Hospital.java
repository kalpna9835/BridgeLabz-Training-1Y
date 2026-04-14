import java.util.*;

class Patient {
    String name;
    Patient(String n){name=n;}
}

class Hospital {
    Set<Patient> admitted = new HashSet<>();
    Queue<Patient> queue = new LinkedList<>();
    Stack<Patient> discharged = new Stack<>();
    List<Patient> history = new ArrayList<>();
}