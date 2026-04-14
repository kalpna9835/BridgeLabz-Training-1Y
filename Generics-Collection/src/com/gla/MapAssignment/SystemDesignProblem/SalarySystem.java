import java.util.*;

class SalarySystem {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();

        map.put("A",50000.0);
        map.put("B",70000.0);

        map.put("A",map.get("A")*1.1);

        double avg = map.values().stream().mapToDouble(d->d).average().orElse(0);

        double max = Collections.max(map.values());

        map.forEach((k,v)->{
            if(v==max) System.out.println("Top: "+k);
        });

        System.out.println("Avg: "+avg);
    }
}