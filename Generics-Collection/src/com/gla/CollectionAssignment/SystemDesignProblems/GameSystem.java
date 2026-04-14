import java.util.*;

class Player {
    String name;
    Player(String n){name=n;}
}

class Score implements Comparable<Score> {
    int points;
    Score(int p){points=p;}
    public int compareTo(Score o){ return o.points - points; }
}

class GameSystem {
    Set<Player> players = new HashSet<>();
    Queue<String> matches = new LinkedList<>();
    List<String> results = new ArrayList<>();
    TreeSet<Score> leaderboard = new TreeSet<>();
}