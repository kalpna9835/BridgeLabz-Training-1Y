import java.util.*;

class Package {
    String id;
    Package(String id){this.id=id;}
}

class DeliverySystem {
    Queue<Package> queue = new LinkedList<>();
    Set<String> ids = new HashSet<>();
    List<Package> delivered = new ArrayList<>();
    Stack<Package> returned = new Stack<>();
}