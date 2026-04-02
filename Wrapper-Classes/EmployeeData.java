import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {

        int[] ages = {22, 35, 18, 40, 28};

        
        ArrayList<Integer> list = new ArrayList<>();
        for (int age : ages) {
            list.add(age); 
        }

        
        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Youngest age = " + youngest);
        System.out.println("Oldest age = " + oldest);
    }
}