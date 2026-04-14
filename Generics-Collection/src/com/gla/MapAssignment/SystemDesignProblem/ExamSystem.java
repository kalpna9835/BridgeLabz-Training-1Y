import java.util.*;

class ExamSystem {
    public static void main(String[] args) {
        Map<String,Map<String,Integer>> map=new HashMap<>();

        map.put("Math",Map.of("A",90,"B",80));
        map.put("Science",Map.of("A",95,"B",85));

        for(var subject:map.entrySet()){
            var inner=subject.getValue();

            String topper=Collections.max(inner.entrySet(),
                Map.Entry.comparingByValue()).getKey();

            double avg=inner.values().stream()
                .mapToInt(i->i).average().orElse(0);

            System.out.println(subject.getKey()+" Topper: "+topper+" Avg:"+avg);
        }
    }
}