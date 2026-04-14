import java.util.*;

class Question { String q; Question(String q){this.q=q;} }
class Student { String id; Student(String id){this.id=id;} }

class ExamSystem {
    List<Question> questions = new ArrayList<>();
    Set<String> students = new HashSet<>();
    Queue<Student> queue = new LinkedList<>();
    Stack<Question> history = new Stack<>();

    void addStudent(String id){ students.add(id); }

    void serveStudent(){
        Student s = queue.poll();
        System.out.println("Serving: " + s.id);
    }
}