import java.util.*;

class Attendance {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("A",0); map.put("B",0);

        List<String> present = List.of("A");

        for(String s:present)
            map.put(s,map.get(s)+1);

        map.forEach((k,v)->{
            if(v<1) System.out.println(k+" low attendance");
        });
    }
}