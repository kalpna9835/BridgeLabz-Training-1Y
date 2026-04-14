import java.util.*;

class Product {
    double price;
    Product(double price) { this.price = price; }
    double getPrice() { return price; }
}

class Mobile extends Product {
    Mobile(double price) { super(price); }
}

class Laptop extends Product {
    Laptop(double price) { super(price); }
}

class PriceUtil {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}