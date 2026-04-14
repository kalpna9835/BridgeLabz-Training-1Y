import java.util.*;

class Parcel {
    int priority;
    Parcel(int p){priority=p;}
}

class Courier {
    PriorityQueue<Parcel> pq =
        new PriorityQueue<>((a,b)->b.priority-a.priority);
    Set<String> ids = new HashSet<>();
    List<Parcel> completed = new ArrayList<>();
    Queue<Parcel> normal = new LinkedList<>();
}