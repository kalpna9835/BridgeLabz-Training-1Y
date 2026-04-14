import java.util.*;

class FeedbackSystem {
    List<String> feedbacks = new ArrayList<>();
    Set<String> unique = new HashSet<>();
    Queue<String> queue = new LinkedList<>();
    Stack<String> recent = new Stack<>();
}