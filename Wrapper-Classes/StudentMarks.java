import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {

        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> validMarks = new ArrayList<>();

        for (Object obj : inputs) {
            try {
                if (obj instanceof String) {
                    String str = (String) obj;

                    if (str.equalsIgnoreCase("null")) continue;

                    validMarks.add(Integer.parseInt(str));
                } else if (obj instanceof Integer) {
                    validMarks.add((Integer) obj);
                }
            } catch (NumberFormatException e) {
               
            }
        }

        
        int sum = 0;
        for (int m : validMarks) {
            sum += m;
        }

        double avg = validMarks.size() == 0 ? 0 : (double) sum / validMarks.size();

        System.out.println("Valid marks = " + validMarks);
        System.out.println("Average marks = " + avg);
    }
}