import java.util.*;

class Transaction {
    int id;
    Transaction(int id){this.id=id;}
}

class BankSystem {
    List<Transaction> all = new ArrayList<>();
    Queue<Transaction> queue = new LinkedList<>();
    Set<Integer> accounts = new HashSet<>();
    Stack<Transaction> rollback = new Stack<>();

    void process() {
        while (!queue.isEmpty()) {
            Transaction t = queue.poll();
            rollback.push(t);
            System.out.println("Done: " + t.id);
        }
    }

    void undo() {
        if (!rollback.isEmpty())
            System.out.println("Undo: " + rollback.pop().id);
    }
}