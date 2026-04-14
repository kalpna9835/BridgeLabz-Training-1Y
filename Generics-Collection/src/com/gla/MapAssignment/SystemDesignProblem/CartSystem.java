import java.util.*;

class CartSystem {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> cart=new LinkedHashMap<>();

        cart.put("TV",4000.0);
        cart.put("Phone",2000.0);

        double total=cart.values().stream().mapToDouble(d->d).sum();

        if(total>5000) total*=0.9;

        System.out.println(total);
    }
}