import java.util.Scanner;

class StudentScoreCard {

    // Generate random 2-digit PCM marks
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10; // 10–99
            }
        }
        return marks;
    }

    // Calculate total, average and percentage
    public static double[][] calculateResults(int[][] marks) {

        int students = marks.length;
        double[][] results = new double[students][3]; // total, average, percentage

        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Display Scorecard
    public static void displayScoreCard(int[][] marks, double[][] results) {

        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {

            System.out.println(
                    (i + 1) + "\t\t" +
                    marks[i][0] + "\t\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" +
                    results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);

        displayScoreCard(marks, results);

        sc.close();
    }
}
