import java.util.*;

class Bank {
    public static void main(String[] args) {
        Map<String,Double> map=new HashMap<>();

        map.put("A1",1000.0);
        map.put("A2",5000.0);

        map.put("A1",map.get("A1")+500);

        double bal=map.get("A1");
        if(bal>=200) map.put("A1",bal-200);

        map.entrySet().stream()
            .sorted((a,b)->Double.compare(b.getValue(),a.getValue()))
            .limit(3)
            .forEach(System.out::println);
    }
}