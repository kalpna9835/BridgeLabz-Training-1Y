import java.util.*;

class Booking {
    int priority;
    Booking(int p){priority=p;}
}

class TicketSystem {
    List<Booking> bookings = new ArrayList<>();
    Set<String> users = new HashSet<>();
    Queue<Booking> queue = new LinkedList<>();
    PriorityQueue<Booking> vip =
        new PriorityQueue<>((a,b)->b.priority-a.priority);
}