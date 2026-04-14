import java.util.*;

class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();

        map.put("India","Delhi");
        map.put("USA","Washington");

        System.out.println(map.getOrDefault("UK","Unknown"));

        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}