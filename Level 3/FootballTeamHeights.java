import java.util.Scanner;

class FootballTeamHeights {

    // Method to find minimum height
    static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min)
                min = h;
        }
        return min;
    }

    // Method to find maximum height
    static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max)
                max = h;
        }
        return max;
    }

    // Method to find average height
    static double findAverage(int[] heights) {
        int sum = 0;
        for (int h : heights)
            sum += h;
        return (double) sum / heights.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] heights = new int[11];

        System.out.println("Enter heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height : " + findTallest(heights));
        System.out.println("Average Height : " + findAverage(heights));
    }
}
