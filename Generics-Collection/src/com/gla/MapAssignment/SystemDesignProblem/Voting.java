import java.util.*;

class Voting {
    public static void main(String[] args) {
        String[] votes = {"A","B","A","C","A","B","C","C","B","B"};

        Map<String,Integer> map = new HashMap<>();

        for(String v:votes)
            map.put(v,map.getOrDefault(v,0)+1);

        String winner = Collections.max(map.entrySet(),
            Map.Entry.comparingByValue()).getKey();

        System.out.println(map);
        System.out.println("Winner: "+winner);
    }
}