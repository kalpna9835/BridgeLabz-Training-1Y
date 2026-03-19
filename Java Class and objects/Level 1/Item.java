class Item {

    int itemCode;
    String itemName;
    double price;

    void display(int quantity) {
        double totalCost = price * quantity;

        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Cost: " + totalCost);
    }

    public static void main(String[] args) {

        Item i = new Item();

        i.itemCode = 101;
        i.itemName = "Pen";
        i.price = 10;

        i.display(5);
    }
}
