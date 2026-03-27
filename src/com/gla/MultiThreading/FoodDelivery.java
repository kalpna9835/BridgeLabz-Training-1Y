class Order implements Runnable {
    private int orderId;
    private String restaurant;
    private int deliveryTime;

    public Order(int id, String res, int time) {
        this.orderId = id;
        this.restaurant = res;
        this.deliveryTime = time;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        long start = System.currentTimeMillis();

        try {
            System.out.println("Order " + orderId + " picked up by " + t.getName());
            Thread.sleep(1000);

            System.out.println("Order " + orderId + " in transit...");
            Thread.sleep(deliveryTime * 1000);

            System.out.println("Order " + orderId + " delivered!");

            long end = System.currentTimeMillis();
            System.out.println("Total time: " + (end - start) + " ms\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "Pizza Hut", 3), "Agent-1");
        Thread o2 = new Thread(new Order(2, "KFC", 5), "Agent-2");
        Thread o3 = new Thread(new Order(3, "Dominos", 2), "Agent-3");
        Thread o4 = new Thread(new Order(4, "Burger King", 4), "Agent-4");
        Thread o5 = new Thread(new Order(5, "Subway", 3), "Agent-5");

        o1.setPriority(10);
        o2.setPriority(5);
        o3.setPriority(10);
        o4.setPriority(3);
        o5.setPriority(5);

        o1.start(); o2.start(); o3.start(); o4.start(); o5.start();
    }
}