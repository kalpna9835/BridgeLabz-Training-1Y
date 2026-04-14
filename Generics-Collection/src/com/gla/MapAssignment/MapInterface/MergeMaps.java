import java.util.*;

class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>(Map.of("A",1,"B",2));
        Map<String,Integer> m2 = Map.of("B",3,"C",4);

        for (var e : m2.entrySet()) {
            m1.merge(e.getKey(), e.getValue(), Integer::sum);
        }

        System.out.println(m1);
    }
}