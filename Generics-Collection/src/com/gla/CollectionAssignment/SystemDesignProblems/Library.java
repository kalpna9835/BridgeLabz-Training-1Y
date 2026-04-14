import java.util.*;

class Book {
    String name;
    Book(String n){name=n;}
}

class Library {
    List<Book> books = new ArrayList<>();
    Set<String> members = new HashSet<>();
    Queue<Book> issueQueue = new LinkedList<>();
    Stack<Book> returned = new Stack<>();
}