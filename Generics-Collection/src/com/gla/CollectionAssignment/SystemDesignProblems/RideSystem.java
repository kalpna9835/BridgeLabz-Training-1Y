import java.util.*;

class RideRequest {
    int priority;
    RideRequest(int p){priority=p;}
}

class RideSystem {
    Queue<RideRequest> queue = new LinkedList<>();
    PriorityQueue<RideRequest> pq =
        new PriorityQueue<>((a,b)->b.priority-a.priority);

    void process() {
        while (!pq.isEmpty())
            System.out.println("High Priority Ride");
    }
}