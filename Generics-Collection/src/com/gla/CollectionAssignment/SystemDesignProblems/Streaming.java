import java.util.*;

class Movie {
    String name, genre;
    Movie(String n,String g){name=n;genre=g;}
}

class Streaming {
    Stack<Movie> history = new Stack<>();
    List<Movie> all = new ArrayList<>();
    Set<String> genres = new HashSet<>();
    Queue<Movie> upNext = new LinkedList<>();
}