import java.util.*;

class LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();

        map.put("101","Java");
        map.put("102","Python");

        System.out.println(map.getOrDefault("103","Not Found"));

        map.remove("101");

        map.forEach((k,v)->System.out.println(k+" "+v));
    }
}