import java.util.*;

class EmpDept {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();

        map.put(1,"IT");
        map.put(2,"HR");

        map.put(1,"Finance");

        String dept="Finance";

        map.forEach((k,v)->{
            if(v.equals(dept)) System.out.println(k);
        });
    }
}