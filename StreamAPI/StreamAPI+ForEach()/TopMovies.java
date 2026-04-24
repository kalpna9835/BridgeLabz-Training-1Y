import java.util.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String toString() {
        return name + " | " + rating + " | " + year;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 4.5, 2024),
            new Movie("Movie B", 4.8, 2023),
            new Movie("Movie C", 4.2, 2025),
            new Movie("Movie D", 4.9, 2024),
            new Movie("Movie E", 4.6, 2022),
            new Movie("Movie F", 4.7, 2025)
        );

        movies.stream()
              .filter(m -> m.rating > 4.0)
              .sorted((m1, m2) -> {
                  if (m2.rating == m1.rating)
                      return m2.year - m1.year;
                  return Double.compare(m2.rating, m1.rating);
              })
              .limit(5)
              .forEach(System.out::println);
    }
}