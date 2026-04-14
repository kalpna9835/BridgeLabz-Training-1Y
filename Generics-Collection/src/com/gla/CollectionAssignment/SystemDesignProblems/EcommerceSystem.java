import java.util.*;

class Order {
    int id;
    Order(int id) { this.id = id; }

    public boolean equals(Object o) { return ((Order)o).id == id; }
    public int hashCode() { return id; }
}

class EcommerceSystem {
    List<Order> orders = new ArrayList<>();
    Set<Order> uniqueOrders = new HashSet<>();
    Queue<Order> queue = new LinkedList<>();
    Stack<Order> failed = new Stack<>();

    void process() {
        uniqueOrders.addAll(orders);
        queue.addAll(uniqueOrders);

        while (!queue.isEmpty()) {
            Order o = queue.poll();
            if (o.id % 2 == 0) failed.push(o);
            else System.out.println("Processed: " + o.id);
        }
    }

    void retry() {
        while (!failed.isEmpty())
            System.out.println("Retry: " + failed.pop().id);
    }
}