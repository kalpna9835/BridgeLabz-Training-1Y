import java.util.*;

class CourseSystem {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("CS101",60);
        map.put("CS102",3);

        map.put("CS101",map.get("CS101")+1);

        map.forEach((k,v)->{
            if(v>=50) System.out.println(k+" full");
            if(v<5) System.out.println(k+" low");
        });
    }
}