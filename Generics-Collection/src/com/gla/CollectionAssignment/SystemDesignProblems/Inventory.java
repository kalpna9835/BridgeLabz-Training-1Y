import java.util.*;

class Product {
    String name; int stock;
    Product(String n,int s){name=n;stock=s;}
}

class Inventory {
    Set<String> names = new HashSet<>();
    List<Product> products = new ArrayList<>();
    Queue<Product> restock = new LinkedList<>();
    Stack<Product> undo = new Stack<>();

    void checkStock() {
        for (Product p : products)
            if (p.stock < 5) restock.add(p);
    }
}