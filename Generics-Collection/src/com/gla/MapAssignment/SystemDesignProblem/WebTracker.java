import java.util.*;

class WebTracker {
    public static void main(String[] args) {
        String[] pages={"home","about","home","products"};

        Map<String,Integer> map=new HashMap<>();

        for(String p:pages)
            map.put(p,map.getOrDefault(p,0)+1);

        map.entrySet().stream()
            .sorted((a,b)->b.getValue()-a.getValue())
            .forEach(System.out::println);
    }
}