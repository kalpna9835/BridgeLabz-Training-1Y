class Product {

    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price       : " + price);
    }

    // Class (static) method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {

        Product p1 = new Product();
        p1.productName = "Pen";
        p1.price = 10;
        totalProducts++;

        Product p2 = new Product();
        p2.productName = "Book";
        p2.price = 100;
        totalProducts++;

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
