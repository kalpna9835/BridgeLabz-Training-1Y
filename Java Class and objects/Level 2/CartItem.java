class CartItem {

    String itemName;
    double price;
    int quantity;

    // Method to add item to cart
    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
        System.out.println("Item added to cart");
    }

    // Method to remove item from cart
    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart");
    }

    // Method to display total cost
    void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        CartItem c = new CartItem();

        c.addItem("Notebook", 50, 4);
        c.displayTotalCost();

        c.removeItem();
        c.displayTotalCost();
    }
}
