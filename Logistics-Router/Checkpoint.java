
abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String checkpointId, String locationName, double distanceFromLast,
                      int expectedDuration, int actualDuration) {
        this.checkpointId = checkpointId;
        this.locationName = locationName;
        this.distanceFromLast = distanceFromLast;
        this.expectedDuration = expectedDuration;
        this.actualDuration = actualDuration;
    }

    boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    abstract boolean isCritical();

    abstract String getType();

    abstract double calculatePenalty();
}

class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "Delivery";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return (actualDuration - expectedDuration) * 2;
        }
        return 0;
    }
}
class FuelCheckpoint extends Checkpoint {

    public FuelCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    boolean isCritical() {
        return true;
    }

    String getType() {
        return "Fuel";
    }

    double calculatePenalty() {
        if (isDelayed()) {
            return 10;
        }
        return 0;
    }
}


class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, int exp, int act) {
        super(id, loc, dist, exp, act);
    }

    boolean isCritical() {
        return false;
    }

    String getType() {
        return "Rest";
    }

    double calculatePenalty() {
        if (isDelayed() && (actualDuration - expectedDuration) > 30) {
            return (actualDuration - expectedDuration) * 0.5;
        }
        return 0;
    }
}


class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}


class RouteLinkedList<T extends Checkpoint> {

    Node<T> head;

    void addCheckpoint(T checkpoint) {
        Node<T> newNode = new Node<>(checkpoint);

        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    boolean removeCheckpoint(String checkpointId) {
        if (head == null) return false;

        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            return true;
        }

        Node<T> temp = head;
        while (temp.next != null) {
            if (temp.next.data.checkpointId.equals(checkpointId)) {
                temp.next = temp.next.next;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    T findCheckpoint(String checkpointId) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.checkpointId.equals(checkpointId)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    double computeTotalDistance() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    double computeTotalPenalty() {
        double total = 0;
        Node<T> temp = head;
        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    boolean checkCritical() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node<T> temp = head;
        while (temp != null) {
            if (temp.data.getType().equals("Delivery")) {
                hasDelivery = true;
            }
            if (temp.data.getType().equals("Fuel")) {
                hasFuel = true;
            }
            temp = temp.next;
        }

        return hasDelivery && hasFuel;
    }

    void printRoute() {
        Node<T> temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint cp = temp.data;

            String status = cp.isDelayed() ? "Delayed" : "On Time";

            System.out.println(i + ". " + cp.getType() + "Checkpoint – " +
                    cp.locationName + " – " + status +
                    " – Penalty: " + cp.calculatePenalty());

            temp = temp.next;
            i++;
        }
    }
}


class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double distance = routeHistory.computeTotalDistance();
        double penalty = routeHistory.computeTotalPenalty();
        double score = distance - penalty;

        System.out.println("Total Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + score);

        if (routeHistory.checkCritical()) {
            System.out.println("Critical Route Check: All required checkpoints present");
        } else {
            System.out.println("Critical Route Check: Missing critical checkpoints");
        }
    }
}


public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 40, 80));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 60, 90, 105));

        d.printSummary();
    }
}