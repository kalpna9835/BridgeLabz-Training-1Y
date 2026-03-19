class Books {

    String title;
    String author;
    double price;
    boolean available = true;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", 400);
        b.borrowBook();
        b.borrowBook();
    }
}
