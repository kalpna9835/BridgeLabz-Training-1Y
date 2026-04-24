import java.util.*;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(120.5, 121.0, 119.8, 122.3);

        prices.forEach(System.out::println);
    }
}