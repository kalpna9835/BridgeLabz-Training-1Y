import java.util.*;

class Team implements Comparable<Team> {
    int points;
    Team(int p){points=p;}
    public int compareTo(Team o){ return o.points - points; }
}

class Tournament {
    Set<Team> teams = new HashSet<>();
    Queue<String> matches = new LinkedList<>();
    List<String> results = new ArrayList<>();
    TreeSet<Team> ranking = new TreeSet<>();
}