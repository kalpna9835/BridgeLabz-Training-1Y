// Parent class
class Book {

    public String ISBN;        // public
    protected String title;    // protected
    private String author;     // private

    // Setter method for author
    public void setAuthor(String a) {
        author = a;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends Book {

    void displayDetails() {
        System.out.println("ISBN  : " + ISBN);       // public accessible
        System.out.println("Title : " + title);      // protected accessible
        System.out.println("Author: " + getAuthor()); // private via method
    }

    public static void main(String[] args) {

        EBook e = new EBook();

        e.ISBN = "978-12345";
        e.title = "Java Programming";
        e.setAuthor("James Gosling");

        e.displayDetails();
    }
}
