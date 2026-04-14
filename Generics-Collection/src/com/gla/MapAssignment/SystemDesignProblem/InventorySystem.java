import java.util.*;

class InventorySystem {
    public static void main(String[] args) {
        Map<String,Integer> stock = new HashMap<>();

        stock.put("Pen",10);
        stock.put("Book",5);

        stock.put("Pen", stock.get("Pen") - 3); // purchase
        stock.put("Book", stock.get("Book") + 10); // restock

        System.out.println(stock.getOrDefault("Pencil",0));

        stock.forEach((k,v)->{
            if(v<=0) System.out.println(k+" out of stock");
        });
    }
}